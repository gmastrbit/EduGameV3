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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    private static final String MY_SETTINGS = "my_settings";
    private Snackbar mSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        // скриває верхній бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // скриває тайтлбар:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // шрифт:
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
        TextView textView = (TextView) findViewById(R.id.textView24);
        textView.setTypeface(typeFace);
        TextView textView1 = (TextView) findViewById(R.id.textView229);
        textView1.setTypeface(typeFace);
        Button button = (Button) findViewById(R.id.button181);
        button.setTypeface(typeFace);

        ImageView go_home = (ImageView) findViewById(R.id.imageView468);

        // кліки по кнопкам та довгі кліки по кнопкам
        go_home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // перехід на 1 гру розділу Сенсорика з анімацією
                Intent questionIntent = new Intent(UserActivity.this, MainActivity.class);
                startActivityForResult(questionIntent, 1);
                overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
            }
        });

        go_home.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mSnackbar = Snackbar.make(view, "На головний екран", Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
                View snackbarView = mSnackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#212121"));
                TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
                mSnackbar.show();
                return true;
            }
        });


        // значення ніку в EditText, якщо воно є
        SharedPreferences sp = getSharedPreferences(MY_SETTINGS, Context.MODE_PRIVATE);
        EditText userNameLogin = (EditText) findViewById(R.id.editText);

        String nick = sp.getString("userName", "");
        if (!nick.isEmpty()){
            userNameLogin.setText(nick);
        } else {
            userNameLogin.setText("");
        }
    }

    public void save(View view){
        SharedPreferences sp = getSharedPreferences(MY_SETTINGS, Context.MODE_PRIVATE);

        EditText userNameLogin = (EditText) findViewById(R.id.editText);
        userNameLogin.clearFocus();
        String userName = userNameLogin.getText().toString();
        SharedPreferences.Editor e = sp.edit();
        e.putString("userName", userName);
        e.commit();

        mSnackbar = Snackbar.make(view, "Ім'я '"+ userName +"' збережено!", Snackbar.LENGTH_LONG)
                .setAction("Action", null);
        View snackbarView = mSnackbar.getView();
        snackbarView.setBackgroundColor(Color.parseColor("#212121"));
        TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
        snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
        mSnackbar.show();
    }
}