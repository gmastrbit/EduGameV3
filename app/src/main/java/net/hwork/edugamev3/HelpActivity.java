package net.hwork.edugamev3;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    private Snackbar mSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        // скриває верхній бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // скриває тайтлбар:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // шрифт:
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setTypeface(typeFace);
        TextView textView1 = (TextView) findViewById(R.id.textView25);
        textView1.setTypeface(typeFace);
        TextView textView2 = (TextView) findViewById(R.id.textView26);
        textView2.setTypeface(typeFace);
    }

    public void showSnackHelp(View view) {
        mSnackbar = Snackbar.make(view, "Довідковий центр", Snackbar.LENGTH_LONG)
                .setAction("Action", null);
        View snackbarView = mSnackbar.getView();
        snackbarView.setBackgroundColor(Color.parseColor("#212121"));
        TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
        snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
        mSnackbar.show();
    }

    public void toInfo(View view){
        // перехід на мій сайт:
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://hwork.net/")));
    }
}
