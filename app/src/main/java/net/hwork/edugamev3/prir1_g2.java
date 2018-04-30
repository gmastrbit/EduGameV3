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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class prir1_g2 extends AppCompatActivity {

    private SoundPool mSoundPool;
    private AssetManager mAssetManager;
    private int mSuccessGame, mError, mStreamID, mSheep, mCow, mDuck, mChicken;
    private int error18 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prir1_g2_1);
        // приховує верхній бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує тайтлбар:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // шрифт:
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
        TextView textView = (TextView) findViewById(R.id.textView95);
        textView.setTypeface(typeFace);
        TextView textView0 = (TextView) findViewById(R.id.textView96);
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
        error18 = 0;
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
        mSoundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
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
        mSheep = loadSound("sheep.ogg");
        mCow = loadSound("cow.ogg");
        mDuck = loadSound("duck.ogg");
        mChicken = loadSound("chicken.ogg");
        error18 = 0;
    }
    @Override
    protected void onPause() {
        super.onPause();
        mSoundPool.release();
        mSoundPool = null;
    }
    // звуки;

    public void no_prir1_g2(View view){
        // звук:
        playSound(mError);

        error18++;
        if(error18 >= 5){
            // перехід на activity з помилкою
            Intent questionIntent = new Intent(prir1_g2.this, ErrorActivity.class);
            startActivityForResult(questionIntent, 1);
            overridePendingTransition(R.anim.right_in, R.anim.left_out);
        }

        // підсвітка:
        RelativeLayout mRelativeLayout;
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rel);
        mRelativeLayout.setBackgroundColor(Color.parseColor("#D50000"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                RelativeLayout mRelativeLayout;
                mRelativeLayout = (RelativeLayout) findViewById(R.id.rel);
                mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
            }
        }, 250);
    }

    public void go_prir1_g2_2(View view){
        // звук
        playSound(mSuccessGame);

        // сховати кнопки:
        LinearLayout mLinearLayout;
        mLinearLayout = (LinearLayout) findViewById(R.id.lin1);
        mLinearLayout.setVisibility(View.INVISIBLE);

        // підсвітка:
        RelativeLayout mRelativeLayout;
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rel);
        mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.prir1_g2_2);
                // шрифт:
                Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
                TextView textView1 = (TextView) findViewById(R.id.textView97);
                textView1.setTypeface(typeFace);
                TextView textView11 = (TextView) findViewById(R.id.textView98);
                textView11.setTypeface(typeFace);
            }
        }, 250);
    }

    public void go_prir1_g2_3(View view){
        // звук:
        playSound(mSuccessGame);

        // сховати кнопки:
        LinearLayout mLinearLayout;
        mLinearLayout = (LinearLayout) findViewById(R.id.lin2);
        mLinearLayout.setVisibility(View.INVISIBLE);

        // підсвітка:
        RelativeLayout mRelativeLayout;
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rel);
        mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.prir1_g2_3);
                // шрифт:
                Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
                TextView textView2 = (TextView) findViewById(R.id.textView99);
                textView2.setTypeface(typeFace);
                TextView textView22 = (TextView) findViewById(R.id.textView100);
                textView22.setTypeface(typeFace);
            }
        }, 250);
    }

    public void go_prir1_g2_4(View view){
        // звук:
        playSound(mSuccessGame);

        // сховати кнопки:
        LinearLayout mLinearLayout;
        mLinearLayout = (LinearLayout) findViewById(R.id.lin3);
        mLinearLayout.setVisibility(View.INVISIBLE);

        // підсвітка:
        RelativeLayout mRelativeLayout;
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rel);
        mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.prir1_g2_4);
                // шрифт:
                Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
                TextView textView3 = (TextView) findViewById(R.id.textView101);
                textView3.setTypeface(typeFace);
                TextView textView33 = (TextView) findViewById(R.id.textView102);
                textView33.setTypeface(typeFace);
            }
        }, 250);
    }

    public void go_prir1_g2_s(View view){
        // звук:
        playSound(mSuccessGame);

        // сховати кнопки:
        LinearLayout mLinearLayout;
        mLinearLayout = (LinearLayout) findViewById(R.id.lin4);
        mLinearLayout.setVisibility(View.INVISIBLE);

        // підсвітка:
        RelativeLayout mRelativeLayout;
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rel);
        mRelativeLayout.setBackgroundColor(Color.parseColor("#00C853"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.prir1_g2_s);
                // шрифт:
                Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
                TextView textView4 = (TextView) findViewById(R.id.textView103);
                textView4.setTypeface(typeFace);
            }
        }, 250);
    }

    public void playCow_prir1_g2(View view){
        // звук:
        playSound(mCow);
    }

    public void playChicken_prir1_g2(View view){
        // звук:
        playSound(mChicken);
    }

    public void playDuck_prir1_g2(View view){
        // звук:
        playSound(mDuck);
    }
    public void playSheep_prir1_g2(View view){
        // звук:
        playSound(mSheep);
    }


    public void toMain_prir1_g2(View view){
        // перехід на головну з анімацією:
        Intent questionIntent = new Intent(prir1_g2.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
        finish();
    }

    public void go_prir1_g3_1(View view){
        // перехід на 3 гру з анімацією:
        Intent questionIntent = new Intent(prir1_g2.this, prir1_g3.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
        finish();
    }
}
