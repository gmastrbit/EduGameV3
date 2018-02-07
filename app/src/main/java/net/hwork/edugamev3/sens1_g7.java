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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class sens1_g7 extends AppCompatActivity {

    private SoundPool mSoundPool;
    private AssetManager mAssetManager;
    private int mSuccessGame, mError, mStreamID;
    private int error35 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sens1_g7_1);
        // скриває верхній бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // скриває тайтлбар:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // шрифт:
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
        TextView textView = (TextView) findViewById(R.id.textView68);
        textView.setTypeface(typeFace);
        Button button44 = (Button) findViewById(R.id.button48);
        button44.setTypeface(typeFace);
        Button button45 = (Button) findViewById(R.id.button49);
        button45.setTypeface(typeFace);
        // звуки:
        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            // Для пристроїв до Android 5
            createOldSoundPool();
        } else {
            // Для нових пристроїв
            createNewSoundPool();
        }
        // звуки;
        error35 = 0;
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
        error35 = 0;
    }
    @Override
    protected void onPause() {
        super.onPause();
        mSoundPool.release();
        mSoundPool = null;
    }
    // звуки;

    public void no_sens1_g7(View view){
        // звук:
        playSound(mError);

        error35++;
        if(error35 >= 3){
            // перехід на activity з помилкою
            Intent questionIntent = new Intent(sens1_g7.this, ErrorThreeActivity.class);
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

    public void go_sens1_g7_2(View view){
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
                setContentView(R.layout.sens1_g7_2);
                // шрифт:
                Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
                TextView textView1 = (TextView) findViewById(R.id.textView69);
                textView1.setTypeface(typeFace);
                Button button44 = (Button) findViewById(R.id.button50);
                button44.setTypeface(typeFace);
                Button button45 = (Button) findViewById(R.id.button51);
                button45.setTypeface(typeFace);
            }
        }, 250);
    }

    public void go_sens1_g7_s(View view){
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
                setContentView(R.layout.sens1_g7_s);
                // шрифт:
                Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
                TextView textView4 = (TextView) findViewById(R.id.textView70);
                textView4.setTypeface(typeFace);
            }
        }, 250);
    }

    public void toMain_sens1_g7(View view){
        // перехід на головну з анімацією:
        Intent questionIntent = new Intent(sens1_g7.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
        finish();
    }

    public void go_sens1_g8_1(View view){
        // перехід на 2 гру з анімацією:
        Intent questionIntent = new Intent(sens1_g7.this, sens1_g8.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
        finish();
    }
}
