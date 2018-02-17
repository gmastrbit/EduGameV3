package net.hwork.edugamev3;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class dod1_g5 extends AppCompatActivity {

    private SoundPool mSoundPool;
    private AssetManager mAssetManager;
    private int mSuccessGame, mError, mStreamID;
    private int s1 = 0;
    private int s2 = 0;
    private int error5 = 0;
    private int error6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dod1_g5_1);
        // скриває верхній бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // скриває тайтлбар:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // шрифт:
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
        TextView textView = (TextView) findViewById(R.id.textView42);
        textView.setTypeface(typeFace);
        TextView textView0 = (TextView) findViewById(R.id.textView225);
        textView0.setTypeface(typeFace);
        // звуки:
        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            // Для пристроїв до Android 5
            createOldSoundPool();
        } else {
            // Для нових пристроїв
            createNewSoundPool();
        }
        // звуки;
        error5 = 0;
        error6 = 0;
        s1 = 0;
        s2 = 0;
    }

    // звуки:
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void createNewSoundPool() {
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        mSoundPool = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
    }
    @SuppressWarnings("deprecation")
    private void createOldSoundPool() {
        mSoundPool = new SoundPool(7, AudioManager.STREAM_MUSIC, 0);
    }
    private int playSound(int sound) {
        if (sound > 0) {
            mStreamID = mSoundPool.play(sound, 1, 1, 1, 0, 1);
        }
        return mStreamID;
    }
    private int loadSound(String fileName) {
        AssetFileDescriptor afd;
        try {
            afd = mAssetManager.openFd(fileName);
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "Не можу завантажити  " + fileName,
                    Toast.LENGTH_SHORT).show();
            return -1;
        }
        return mSoundPool.load(afd, 1);
    }
    @Override
    protected void onResume() {
        super.onResume();
        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            createOldSoundPool();
        } else {
            createNewSoundPool();
        }
        mAssetManager = getAssets();
        mSuccessGame = loadSound("success_game.ogg");
        mError = loadSound("error.ogg");
    }
    @Override
    protected void onPause() {
        super.onPause();
        mSoundPool.release();
        mSoundPool = null;
    }
    // звуки;

    public void dod1_g5_go_2(View view){
        setContentView(R.layout.dod1_g5_2);
    }

    public void dod1_g5_s11(View view){
        // звук:
        playSound(mSuccessGame);
        ImageView imageView1 = findViewById(R.id.imageView456);
        imageView1.setVisibility(View.INVISIBLE);

        s1++;
        if(s1 >= 5){
            // перехід на наступний layout гри
            setContentView(R.layout.dod1_g5_3);
            // шрифт:
            Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
            TextView textView21 = (TextView) findViewById(R.id.textView226);
            textView21.setTypeface(typeFace);
            TextView textView22 = (TextView) findViewById(R.id.textView227);
            textView22.setTypeface(typeFace);
        } else {

        // підсвітка:
        RelativeLayout mRelativeLayout;
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rel1);
        mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                RelativeLayout mRelativeLayout;
                mRelativeLayout = (RelativeLayout) findViewById(R.id.rel1);
                mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
            }
        }, 250);
        }
    }

    public void dod1_g5_s12(View view){
        // звук:
        playSound(mSuccessGame);
        ImageView imageView1 = findViewById(R.id.imageView454);
        imageView1.setVisibility(View.INVISIBLE);

        s1++;
        if(s1 >= 5){
            // перехід на наступний layout гри
            setContentView(R.layout.dod1_g5_3);
            // шрифт:
            Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
            TextView textView23 = (TextView) findViewById(R.id.textView226);
            textView23.setTypeface(typeFace);
            TextView textView24 = (TextView) findViewById(R.id.textView227);
            textView24.setTypeface(typeFace);
        } else {

            // підсвітка:
            RelativeLayout mRelativeLayout;
            mRelativeLayout = (RelativeLayout) findViewById(R.id.rel1);
            mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    RelativeLayout mRelativeLayout;
                    mRelativeLayout = (RelativeLayout) findViewById(R.id.rel1);
                    mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }, 250);
        }
    }

    public void dod1_g5_s13(View view){
        // звук:
        playSound(mSuccessGame);
        ImageView imageView1 = findViewById(R.id.imageView455);
        imageView1.setVisibility(View.INVISIBLE);

        s1++;
        if(s1 >= 5){
            // перехід на наступний layout гри
            setContentView(R.layout.dod1_g5_3);
            // шрифт:
            Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
            TextView textView25 = (TextView) findViewById(R.id.textView226);
            textView25.setTypeface(typeFace);
            TextView textView26 = (TextView) findViewById(R.id.textView227);
            textView26.setTypeface(typeFace);
        } else {

            // підсвітка:
            RelativeLayout mRelativeLayout;
            mRelativeLayout = (RelativeLayout) findViewById(R.id.rel1);
            mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    RelativeLayout mRelativeLayout;
                    mRelativeLayout = (RelativeLayout) findViewById(R.id.rel1);
                    mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }, 250);
        }
    }

    public void dod1_g5_s14(View view){
        // звук:
        playSound(mSuccessGame);
        ImageView imageView1 = findViewById(R.id.imageView457);
        imageView1.setVisibility(View.INVISIBLE);

        s1++;
        if(s1 >= 5){
            // перехід на наступний layout гри
            setContentView(R.layout.dod1_g5_3);
            // шрифт:
            Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
            TextView textView27 = (TextView) findViewById(R.id.textView226);
            textView27.setTypeface(typeFace);
            TextView textView28 = (TextView) findViewById(R.id.textView227);
            textView28.setTypeface(typeFace);
        } else {

            // підсвітка:
            RelativeLayout mRelativeLayout;
            mRelativeLayout = (RelativeLayout) findViewById(R.id.rel1);
            mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    RelativeLayout mRelativeLayout;
                    mRelativeLayout = (RelativeLayout) findViewById(R.id.rel1);
                    mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }, 250);
        }
    }

    public void dod1_g5_s15(View view){
        // звук:
        playSound(mSuccessGame);
        ImageView imageView1 = findViewById(R.id.imageView458);
        imageView1.setVisibility(View.INVISIBLE);

        s1++;
        if(s1 >= 5){
            // перехід на наступний layout гри
            setContentView(R.layout.dod1_g5_3);
            // шрифт:
            Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
            TextView textView29 = (TextView) findViewById(R.id.textView226);
            textView29.setTypeface(typeFace);
            TextView textView30 = (TextView) findViewById(R.id.textView227);
            textView30.setTypeface(typeFace);
        } else {

            // підсвітка:
            RelativeLayout mRelativeLayout;
            mRelativeLayout = (RelativeLayout) findViewById(R.id.rel1);
            mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    RelativeLayout mRelativeLayout;
                    mRelativeLayout = (RelativeLayout) findViewById(R.id.rel1);
                    mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }, 250);
        }

    }

    public void dod1_g5_s_no_1(View view){
        // звук:
        playSound(mError);

        error5++;
        if(error5 >= 5){
            // перехід на activity з помилкою
            Intent questionIntent = new Intent(dod1_g5.this, ErrorActivity.class);
            startActivityForResult(questionIntent, 1);
            overridePendingTransition(R.anim.right_in, R.anim.left_out);
        }

        // підсвітка:
        RelativeLayout mRelativeLayout;
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rel1);
        mRelativeLayout.setBackgroundColor(Color.parseColor("#D50000"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                RelativeLayout mRelativeLayout;
                mRelativeLayout = (RelativeLayout) findViewById(R.id.rel1);
                mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
            }
        }, 250);
    }

    public void dod1_g5_go_4(View view){
        setContentView(R.layout.dod1_g5_4);
    }

    public void dod1_g5_s21(View view){
        // звук:
        playSound(mSuccessGame);
        ImageView imageView1 = findViewById(R.id.imageView461);
        imageView1.setVisibility(View.INVISIBLE);

        s2++;
        if(s2 >= 5){
            // перехід на наступний layout гри
            setContentView(R.layout.dod1_g5_s);
            Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
            TextView textView11 = (TextView) findViewById(R.id.textView228);
            textView11.setTypeface(typeFace);
        } else {

            // підсвітка:
            RelativeLayout mRelativeLayout;
            mRelativeLayout = (RelativeLayout) findViewById(R.id.rel2);
            mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    RelativeLayout mRelativeLayout;
                    mRelativeLayout = (RelativeLayout) findViewById(R.id.rel2);
                    mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }, 250);
        }
    }

    public void dod1_g5_s22(View view){
        // звук:
        playSound(mSuccessGame);
        ImageView imageView1 = findViewById(R.id.imageView462);
        imageView1.setVisibility(View.INVISIBLE);

        s2++;
        if(s2 >= 5){
            // перехід на наступний layout гри
            setContentView(R.layout.dod1_g5_s);
            Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
            TextView textView12 = (TextView) findViewById(R.id.textView228);
            textView12.setTypeface(typeFace);
        } else {

            // підсвітка:
            RelativeLayout mRelativeLayout;
            mRelativeLayout = (RelativeLayout) findViewById(R.id.rel2);
            mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    RelativeLayout mRelativeLayout;
                    mRelativeLayout = (RelativeLayout) findViewById(R.id.rel2);
                    mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }, 250);
        }
    }

    public void dod1_g5_s23(View view){
        // звук:
        playSound(mSuccessGame);
        ImageView imageView1 = findViewById(R.id.imageView465);
        imageView1.setVisibility(View.INVISIBLE);

        s2++;
        if(s2 >= 5){
            // перехід на наступний layout гри
            setContentView(R.layout.dod1_g5_s);
            Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
            TextView textView13 = (TextView) findViewById(R.id.textView228);
            textView13.setTypeface(typeFace);
        } else {

            // підсвітка:
            RelativeLayout mRelativeLayout;
            mRelativeLayout = (RelativeLayout) findViewById(R.id.rel2);
            mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    RelativeLayout mRelativeLayout;
                    mRelativeLayout = (RelativeLayout) findViewById(R.id.rel2);
                    mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }, 250);
        }
    }

    public void dod1_g5_s24(View view){
        // звук:
        playSound(mSuccessGame);
        ImageView imageView1 = findViewById(R.id.imageView464);
        imageView1.setVisibility(View.INVISIBLE);

        s2++;
        if(s2 >= 5){
            // перехід на наступний layout гри
            setContentView(R.layout.dod1_g5_s);
            Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
            TextView textView14 = (TextView) findViewById(R.id.textView228);
            textView14.setTypeface(typeFace);
        } else {

            // підсвітка:
            RelativeLayout mRelativeLayout;
            mRelativeLayout = (RelativeLayout) findViewById(R.id.rel2);
            mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    RelativeLayout mRelativeLayout;
                    mRelativeLayout = (RelativeLayout) findViewById(R.id.rel2);
                    mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }, 250);
        }
    }

    public void dod1_g5_s25(View view){
        // звук:
        playSound(mSuccessGame);
        ImageView imageView1 = findViewById(R.id.imageView463);
        imageView1.setVisibility(View.INVISIBLE);

        s2++;
        if(s2 >= 5){
            // перехід на наступний layout гри
            setContentView(R.layout.dod1_g5_s);
            Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
            TextView textView15 = (TextView) findViewById(R.id.textView228);
            textView15.setTypeface(typeFace);
        } else {

            // підсвітка:
            RelativeLayout mRelativeLayout;
            mRelativeLayout = (RelativeLayout) findViewById(R.id.rel2);
            mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    RelativeLayout mRelativeLayout;
                    mRelativeLayout = (RelativeLayout) findViewById(R.id.rel2);
                    mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }, 250);
        }
    }

    public void dod1_g5_s_no_2(View view){
        // звук:
        playSound(mError);

        error6++;
        if(error6 >= 5){
            // перехід на activity з помилкою
            Intent questionIntent = new Intent(dod1_g5.this, ErrorActivity.class);
            startActivityForResult(questionIntent, 1);
            overridePendingTransition(R.anim.right_in, R.anim.left_out);
        } else {

            // підсвітка:
            RelativeLayout mRelativeLayout;
            mRelativeLayout = (RelativeLayout) findViewById(R.id.rel2);
            mRelativeLayout.setBackgroundColor(Color.parseColor("#D50000"));

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    RelativeLayout mRelativeLayout;
                    mRelativeLayout = (RelativeLayout) findViewById(R.id.rel2);
                    mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }, 250);
        }
    }

    public void toMain_dod1_g5(View view){
        // перехід на головну з анімацією:
        Intent questionIntent = new Intent(dod1_g5.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
        finish();
    }
}