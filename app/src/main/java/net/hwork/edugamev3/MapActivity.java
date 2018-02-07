package net.hwork.edugamev3;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        // скриває верхній бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // скриває тайтлбар:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // колір автоматично в налаштуваннях
    }

    public void go_sens1_map(View view){
        // перехід на 1 гру 1 розділу з анімацією:
        Intent questionIntent = new Intent(MapActivity.this, sens1_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_navk1_map(View view){
        // перехід на 1 гру 2 розділу з анімацією:
        Intent questionIntent = new Intent(MapActivity.this, navk1_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_prir1_map(View view){
        // перехід на 1 гру 3 розділу з анімацією:
        Intent questionIntent = new Intent(MapActivity.this, prir1_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_rozv1_map(View view){
        // перехід на 1 гру 4 розділу з анімацією:
        Intent questionIntent = new Intent(MapActivity.this, rozv1_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_math2_map(View view){
        // перехід на 1 гру 4 розділу з анімацією:
        Intent questionIntent = new Intent(MapActivity.this, math2_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_rozv2_map(View view){
        // перехід на 1 гру 5 розділу з анімацією:
        Intent questionIntent = new Intent(MapActivity.this, rozv2_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_navk2_map(View view){
        // перехід на 1 гру 5 розділу з анімацією:
        Intent questionIntent = new Intent(MapActivity.this, navk2_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void go_prir2_map(View view){
        // перехід на 1 гру 6 розділу з анімацією:
        Intent questionIntent = new Intent(MapActivity.this, prir2_g1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }
}
