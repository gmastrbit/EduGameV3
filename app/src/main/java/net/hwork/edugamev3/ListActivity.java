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
import android.widget.Button;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    private Snackbar mSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        // скриває верхній бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // скриває тайтлбар:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // шрифт:
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setTypeface(typeFace);
        TextView textView0 = (TextView) findViewById(R.id.textView4);
        textView0.setTypeface(typeFace);
        TextView textView1 = (TextView) findViewById(R.id.textView5);
        textView1.setTypeface(typeFace);
        TextView textView6 = (TextView) findViewById(R.id.textView10);
        textView6.setTypeface(typeFace);
        TextView textView7 = (TextView) findViewById(R.id.textView11);
        textView7.setTypeface(typeFace);
        TextView textView8 = (TextView) findViewById(R.id.textView12);
        textView8.setTypeface(typeFace);
        TextView textView9 = (TextView) findViewById(R.id.textView13);
        textView9.setTypeface(typeFace);
        TextView textView10 = (TextView) findViewById(R.id.textView14);
        textView10.setTypeface(typeFace);
        TextView textView16 = (TextView) findViewById(R.id.textView20);
        textView16.setTypeface(typeFace);
        TextView textView17 = (TextView) findViewById(R.id.textView21);
        textView17.setTypeface(typeFace);
        TextView textView18 = (TextView) findViewById(R.id.textView22);
        textView18.setTypeface(typeFace);
        TextView textView19 = (TextView) findViewById(R.id.textView23);
        textView19.setTypeface(typeFace);

        Button button = (Button) findViewById(R.id.button);
        button.setTypeface(typeFace);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setTypeface(typeFace);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setTypeface(typeFace);
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setTypeface(typeFace);
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setTypeface(typeFace);
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setTypeface(typeFace);
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setTypeface(typeFace);
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setTypeface(typeFace);
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setTypeface(typeFace);
        Button button10 = (Button) findViewById(R.id.button10);
        button10.setTypeface(typeFace);
        Button button11 = (Button) findViewById(R.id.button11);
        button11.setTypeface(typeFace);
        Button button12 = (Button) findViewById(R.id.button12);
        button12.setTypeface(typeFace);
        Button button13 = (Button) findViewById(R.id.button13);
        button13.setTypeface(typeFace);
        Button button14 = (Button) findViewById(R.id.button14);
        button14.setTypeface(typeFace);
        Button button15 = (Button) findViewById(R.id.button15);
        button15.setTypeface(typeFace);
        Button button16 = (Button) findViewById(R.id.button16);
        button16.setTypeface(typeFace);
        Button button17 = (Button) findViewById(R.id.button17);
        button17.setTypeface(typeFace);
        Button button18 = (Button) findViewById(R.id.button18);
        button18.setTypeface(typeFace);
        Button button19 = (Button) findViewById(R.id.button19);
        button19.setTypeface(typeFace);
        Button button20 = (Button) findViewById(R.id.button20);
        button20.setTypeface(typeFace);
        Button button21 = (Button) findViewById(R.id.button21);
        button21.setTypeface(typeFace);
        Button button22 = (Button) findViewById(R.id.button22);
        button22.setTypeface(typeFace);
        Button button23 = (Button) findViewById(R.id.button23);
        button23.setTypeface(typeFace);
        Button button24 = (Button) findViewById(R.id.button24);
        button24.setTypeface(typeFace);
        Button button25 = (Button) findViewById(R.id.button25);
        button25.setTypeface(typeFace);
        Button button26 = (Button) findViewById(R.id.button26);
        button26.setTypeface(typeFace);
        Button button27 = (Button) findViewById(R.id.button27);
        button27.setTypeface(typeFace);
        Button button28 = (Button) findViewById(R.id.button28);
        button28.setTypeface(typeFace);
        Button button29 = (Button) findViewById(R.id.button29);
        button29.setTypeface(typeFace);
        Button button30 = (Button) findViewById(R.id.button30);
        button30.setTypeface(typeFace);
        Button button31 = (Button) findViewById(R.id.button31);
        button31.setTypeface(typeFace);
        Button button32 = (Button) findViewById(R.id.button32);
        button32.setTypeface(typeFace);
        Button button33 = (Button) findViewById(R.id.button33);
        button33.setTypeface(typeFace);
        Button button34 = (Button) findViewById(R.id.button34);
        button34.setTypeface(typeFace);
        Button button35 = (Button) findViewById(R.id.button35);
        button35.setTypeface(typeFace);
        Button button36 = (Button) findViewById(R.id.button36);
        button36.setTypeface(typeFace);
        Button button37 = (Button) findViewById(R.id.button37);
        button37.setTypeface(typeFace);
        Button button38 = (Button) findViewById(R.id.button38);
        button38.setTypeface(typeFace);
        Button button39 = (Button) findViewById(R.id.button39);
        button39.setTypeface(typeFace);
        Button button40 = (Button) findViewById(R.id.button40);
        button40.setTypeface(typeFace);
        Button button41 = (Button) findViewById(R.id.button41);
        button41.setTypeface(typeFace);
        Button button43 = (Button) findViewById(R.id.button43);
        button43.setTypeface(typeFace);
        Button button44 = (Button) findViewById(R.id.button179);
        button44.setTypeface(typeFace);
        Button button45 = (Button) findViewById(R.id.button180);
        button45.setTypeface(typeFace);
    }

    public void showSnackList(View view) {
        mSnackbar = Snackbar.make(view, "Весь список ігр внизу", Snackbar.LENGTH_LONG)
                .setAction("Action", null);
        View snackbarView = mSnackbar.getView();
        snackbarView.setBackgroundColor(Color.parseColor("#212121"));
        TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
        snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
        mSnackbar.show();
    }

    public void go_sens1_g1_list(View view){
        // перехід на 1 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, sens1_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_sens1_g2_list(View view){
        // перехід на 2 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, sens1_g2.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_sens1_g3_list(View view){
        // перехід на 3 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, sens1_g3.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_sens1_g4_list(View view){
        // перехід на 4 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, sens1_g4.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_sens1_g5_list(View view){
        // перехід на 5 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, sens1_g5.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_sens1_g6_list(View view){
        // перехід на 6 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, sens1_g6.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_sens1_g7_list(View view){
        // перехід на 7 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, sens1_g7.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_sens1_g8_list(View view){
        // перехід на 8 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, sens1_g8.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_sens1_g9_list(View view){
        // перехід на 9 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, sens1_g9.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_sens1_g10_list(View view){
        // перехід на 10 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, sens1_g10.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_navk1_g1_list(View view){
        // перехід на 11 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, navk1_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_navk1_g2_list(View view){
        // перехід на 12 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, navk1_g2.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_navk1_g3_list(View view){
        // перехід на 13 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, navk1_g3.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_navk1_g4_list(View view){
        // перехід на 14 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, navk1_g4.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_navk1_g5_list(View view){
        // перехід на 15 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, navk1_g5.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_prir1_g1_list(View view){
        // перехід на 16 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, prir1_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_prir1_g2_list(View view){
        // перехід на 17 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, prir1_g2.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_prir1_g3_list(View view){
        // перехід на 18 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, prir1_g3.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_prir1_g4_list(View view){
        // перехід на 19 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, prir1_g4.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_rozv1_g1_list(View view){
        // перехід на 20 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, rozv1_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_rozv1_g2_list(View view){
        // перехід на 21 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, rozv1_g2.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_rozv1_g3_list(View view){
        // перехід на 22 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, rozv1_g3.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_math2_g1_list(View view){
        // перехід на 23 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, math2_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_math2_g2_list(View view){
        // перехід на 24 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, math2_g2.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_math2_g3_list(View view){
        // перехід на 25 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, math2_g3.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_math2_g4_list(View view){
        // перехід на 26 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, math2_g4.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_math2_g5_list(View view){
        // перехід на 27 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, math2_g5.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_math2_g6_list(View view){
        // перехід на 28 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, math2_g6.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_math2_g7_list(View view){
        // перехід на 29 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, math2_g7.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_math2_g8_list(View view){
        // перехід на 30 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, math2_g8.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_rozv2_g1_list(View view){
        // перехід на 37 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, rozv2_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_rozv2_g2_list(View view){
        // перехід на 38 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, rozv2_g2.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_rozv2_g3_list(View view){
        // перехід на 39 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, rozv2_g3.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_navk2_g1_list(View view){
        // перехід на 31 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, navk2_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_navk2_g2_list(View view){
        // перехід на 32 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, navk2_g2.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_navk2_g3_list(View view){
        // перехід на 33 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, navk2_g3.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_prir2_g1_list(View view){
        // перехід на 34 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, prir2_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_prir2_g2_list(View view){
        // перехід на 35 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, prir2_g2.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_prir2_g3_list(View view){
        // перехід на 36 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, prir2_g3.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_dod1_g1_list(View view){
        // перехід на 40 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, dod1_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_dod1_g2_list(View view){
        // перехід на 41 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, dod1_g2.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_dod1_g3_list(View view){
        // перехід на 42 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, dod1_g3.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_dod1_g4_list(View view){
        // перехід на 43 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, dod1_g4.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_dod1_g5_list(View view){
        // перехід на 44 гру з анімацією:
        Intent questionIntent = new Intent(ListActivity.this, dod1_g5.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }
}