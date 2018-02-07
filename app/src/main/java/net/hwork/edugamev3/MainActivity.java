package net.hwork.edugamev3;

import android.content.Intent;
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
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Snackbar mSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // скриває верхній бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // скриває тайтлбар:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // шрифт:
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setTypeface(typeFace);
        // анімація
        LinearLayout mLinearLayout;
        TextView mTextView;
        Animation mFadeInAnimation;
        mFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
        mLinearLayout = (LinearLayout) findViewById(R.id.linMain);
        mLinearLayout.startAnimation(mFadeInAnimation);
        mTextView = (TextView) findViewById(R.id.textView);
        mTextView.startAnimation(mFadeInAnimation);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // анімація
        LinearLayout mLinearLayout;
        TextView mTextView;
        Animation mFadeInAnimation;
        mFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
        mLinearLayout = (LinearLayout) findViewById(R.id.linMain);
        mLinearLayout.startAnimation(mFadeInAnimation);
        mTextView = (TextView) findViewById(R.id.textView);
        mTextView.startAnimation(mFadeInAnimation);
    }

    public void toMapMain(View view){
        // перехід на карту з анімацією:
        Intent questionIntent = new Intent(MainActivity.this, MapActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void toListMain(View view){
        // перехід на карту з анімацією:
        Intent questionIntent = new Intent(MainActivity.this, ListActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void toHelpMain(View view){
        // перехід на карту з анімацією:
        Intent questionIntent = new Intent(MainActivity.this, HelpActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
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