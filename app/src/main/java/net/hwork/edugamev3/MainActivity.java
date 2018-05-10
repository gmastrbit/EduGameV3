package net.hwork.edugamev3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String MY_SETTINGS = "my_settings";
    private Snackbar mSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sp = getSharedPreferences(MY_SETTINGS, Context.MODE_PRIVATE);
        boolean hasVisited = sp.getBoolean("hasVisited", false);

        if (!hasVisited) {
            // перехід на налаштування ніку з анімацією:
            Intent questionIntent = new Intent(MainActivity.this, UserActivity.class);
            startActivityForResult(questionIntent, 1);

            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited", true);
            e.commit();
        } else {

            setContentView(R.layout.activity_main);

            // приховує статус бар:
            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            // приховує ActionBar:
            getSupportActionBar().hide();
            // орієнтація екрана:
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            // шрифт:
            Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setTypeface(typeFace);
            TextView textView2 = (TextView) findViewById(R.id.textView231);
            textView2.setTypeface(typeFace);
            // анімація
            LinearLayout mLinearLayout;
            TextView mTextView;
            TextView mTextView2;
            Animation mFadeInAnimation;
            mFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
            mLinearLayout = (LinearLayout) findViewById(R.id.linMain);
            mLinearLayout.startAnimation(mFadeInAnimation);
            mTextView = (TextView) findViewById(R.id.textView);
            mTextView.startAnimation(mFadeInAnimation);
            mTextView2 = (TextView) findViewById(R.id.textView231);
            mTextView2.startAnimation(mFadeInAnimation);

            // привітання на головній
            String nick = sp.getString("userName", "");
            if (!nick.isEmpty()){
                textView2.setText("Привіт, " + nick);
            } else {
                textView2.setVisibility(View.INVISIBLE);
                textView2.setText("");
            }

            // знаходимо елементи для встановлення слухачів натискання
            ImageView go_list = (ImageView) findViewById(R.id.imageView17);
            ImageView go_map = (ImageView) findViewById(R.id.imageView);
            ImageView go_help = (ImageView) findViewById(R.id.imageView2);

            // кліки по кнопкам та довгі кліки по кнопкам
            go_list.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    // перехід на 1 гру розділу Сенсорика з анімацією
                    Intent questionIntent = new Intent(MainActivity.this, ListActivity.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                    //finish();
                }
            });

            go_list.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    mSnackbar = Snackbar.make(view, "Перейти в список ігор", Snackbar.LENGTH_LONG)
                            .setAction("Action", null);
                    View snackbarView = mSnackbar.getView();
                    snackbarView.setBackgroundColor(Color.parseColor("#212121"));
                    TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                    snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
                    mSnackbar.show();
                    return true;
                }
            });

            go_map.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    // перехід на 1 гру розділу Сенсорика з анімацією
                    Intent questionIntent = new Intent(MainActivity.this, MapActivity.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                    //finish();
                }
            });

            go_map.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    mSnackbar = Snackbar.make(view, "Карта", Snackbar.LENGTH_LONG)
                            .setAction("Action", null);
                    View snackbarView = mSnackbar.getView();
                    snackbarView.setBackgroundColor(Color.parseColor("#212121"));
                    TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                    snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
                    mSnackbar.show();
                    return true;
                }
            });

            go_help.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    // перехід на 1 гру розділу Сенсорика з анімацією
                    Intent questionIntent = new Intent(MainActivity.this, HelpActivity.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                    //finish();
                }
            });

            go_help.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    mSnackbar = Snackbar.make(view, "Перейти в довідку", Snackbar.LENGTH_LONG)
                            .setAction("Action", null);
                    View snackbarView = mSnackbar.getView();
                    snackbarView.setBackgroundColor(Color.parseColor("#212121"));
                    TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                    snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
                    mSnackbar.show();
                    return true;
                }
            });
        }
    }

    public void showSnackMain(View view) {
        mSnackbar = Snackbar.make(view, "Це Герой - ваш помічник", Snackbar.LENGTH_LONG)
                .setAction("Action", null);
        View snackbarView = mSnackbar.getView();
        snackbarView.setBackgroundColor(Color.parseColor("#212121"));
        TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
        snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
        mSnackbar.show();
    }
}