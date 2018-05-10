package net.hwork.edugamev3;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class MapActivity extends AppCompatActivity {

    private Snackbar mSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // колір автоматично встановлюється в налаштуваннях layout

        ImageView go_sens1 = (ImageView) findViewById(R.id.imageView4);
        ImageView go_prir1 = (ImageView) findViewById(R.id.imageView5);
        ImageView go_navk1 = (ImageView) findViewById(R.id.imageView6);
        ImageView go_rozv1 = (ImageView) findViewById(R.id.imageView7);

        ImageView go_math2 = (ImageView) findViewById(R.id.imageView8);
        ImageView go_rozv2 = (ImageView) findViewById(R.id.imageView9);
        ImageView go_prir2 = (ImageView) findViewById(R.id.imageView10);
        ImageView go_navk2 = (ImageView) findViewById(R.id.imageView11);
        ImageView go_dod1 = (ImageView) findViewById(R.id.imageView18);

        // sens1:
        go_sens1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // перехід на 1 гру розділу Сенсорика з анімацією
                Intent questionIntent = new Intent(MapActivity.this, sens1_g1.class);
                startActivityForResult(questionIntent, 1);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
            });

        go_sens1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mSnackbar = Snackbar.make(view, "Сенсорика", Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
                View snackbarView = mSnackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#212121"));
                TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
                mSnackbar.show();
                return true;
            }
        });
        // sens1;

        // prir1:
        go_prir1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // перехід на 1 гру розділу Ознайомлення з природою з анімацією
                Intent questionIntent = new Intent(MapActivity.this, prir1_g1.class);
                startActivityForResult(questionIntent, 1);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        go_prir1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mSnackbar = Snackbar.make(view, "Ознайомлення з природою", Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
                View snackbarView = mSnackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#212121"));
                TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
                mSnackbar.show();
                return true;
            }
        });
        // prir1;

        // navk1:
        go_navk1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // перехід на 1 гру Ознайомлення з навколишнім з анімацією
                Intent questionIntent = new Intent(MapActivity.this, navk1_g1.class);
                startActivityForResult(questionIntent, 1);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        go_navk1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mSnackbar = Snackbar.make(view, "Ознайомлення з навколишнім", Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
                View snackbarView = mSnackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#212121"));
                TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
                mSnackbar.show();
                return true;
            }
        });
        // navk1;

        // rozv1:
        go_rozv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // перехід на 1 гру розділу Розвиток мовлення з анімацією
                Intent questionIntent = new Intent(MapActivity.this, rozv1_g1.class);
                startActivityForResult(questionIntent, 1);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        go_rozv1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mSnackbar = Snackbar.make(view, "Розвиток мовлення", Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
                View snackbarView = mSnackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#212121"));
                TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
                mSnackbar.show();
                return true;
            }
        });
        // rozv1;

        // math2:
        go_math2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // перехід на 1 гру розділу Математика з анімацією
                Intent questionIntent = new Intent(MapActivity.this, math2_g1.class);
                startActivityForResult(questionIntent, 1);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        go_math2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mSnackbar = Snackbar.make(view, "Математика", Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
                View snackbarView = mSnackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#212121"));
                TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
                mSnackbar.show();
                return true;
            }
        });
        // math2;

        // rozv2:
        go_rozv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // перехід на 1 гру Розвиток мовлення 2 з анімацією
                Intent questionIntent = new Intent(MapActivity.this, rozv2_g1.class);
                startActivityForResult(questionIntent, 1);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        go_rozv2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mSnackbar = Snackbar.make(view, "Розвиток мовлення", Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
                View snackbarView = mSnackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#212121"));
                TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
                mSnackbar.show();
                return true;
            }
        });
        // rozv2;

        // prir2:
        go_prir2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // перехід на 1 гру розідлу Ознайомлення з природою з анімацією
                Intent questionIntent = new Intent(MapActivity.this, prir2_g1.class);
                startActivityForResult(questionIntent, 1);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        go_prir2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mSnackbar = Snackbar.make(view, "Ознайомлення з природою", Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
                View snackbarView = mSnackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#212121"));
                TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
                mSnackbar.show();
                return true;
            }
        });
        // prir2;

        // navk2:
        go_navk2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // перехід на 1 гру розділу Ознайомлення з навколишнім з анімацією
                Intent questionIntent = new Intent(MapActivity.this, navk2_g1.class);
                startActivityForResult(questionIntent, 1);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        go_navk2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mSnackbar = Snackbar.make(view, "Ознайомлення з навколишнім", Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
                View snackbarView = mSnackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#212121"));
                TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
                mSnackbar.show();
                return true;
            }
        });
        // navk2;

        // dod1:
        go_dod1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // перехід на 1 гру розділу Додатково з анімацією
                Intent questionIntent = new Intent(MapActivity.this, dod1_g1.class);
                startActivityForResult(questionIntent, 1);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        go_dod1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mSnackbar = Snackbar.make(view, "Додатково", Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
                View snackbarView = mSnackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#212121"));
                TextView snackTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                snackTextView.setTextColor(Color.parseColor("#FFD600")); //  #FFEA00
                mSnackbar.show();
                return true;
            }
        });
        // dod1;
    }
}
