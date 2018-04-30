package net.hwork.edugamev3;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class dod1_g2 extends AppCompatActivity {

    private SoundPool mSoundPool;
    private AssetManager mAssetManager;
    private int mStreamID, mOne, mTwo, mThree, mFour, mFive, mSix, mSeven, mEight, mNine, mNull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dod1_g2);
        // приховує верхній бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує тайтлбар:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // шрифт:
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
        TextView textView11 = (TextView) findViewById(R.id.textView200);
        textView11.setTypeface(typeFace);
        TextView textView0 = (TextView) findViewById(R.id.textView201);
        textView0.setTypeface(typeFace);
        TextView textView1 = (TextView) findViewById(R.id.textView205);
        textView1.setTypeface(typeFace);
        TextView textView2 = (TextView) findViewById(R.id.textView207);
        textView2.setTypeface(typeFace);
        TextView textView3 = (TextView) findViewById(R.id.textView209);
        textView3.setTypeface(typeFace);
        TextView textView4 = (TextView) findViewById(R.id.textView211);
        textView4.setTypeface(typeFace);
        TextView textView41 = (TextView) findViewById(R.id.textView213);
        textView41.setTypeface(typeFace);
        TextView textView42 = (TextView) findViewById(R.id.textView215);
        textView42.setTypeface(typeFace);
        TextView textView43 = (TextView) findViewById(R.id.textView217);
        textView43.setTypeface(typeFace);
        TextView textView44 = (TextView) findViewById(R.id.textView218);
        textView44.setTypeface(typeFace);
        TextView textView45 = (TextView) findViewById(R.id.textView221);
        textView45.setTypeface(typeFace);
        TextView textView46 = (TextView) findViewById(R.id.textView223);
        textView46.setTypeface(typeFace);

        // звуки:
        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            // Для пристроїв до Android 5
            createOldSoundPool();
        } else {
            // Для нових пристроїв
            createNewSoundPool();
        }
        // звуки;
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
        mSoundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
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
        mOne = loadSound("one.mp3");
        mTwo = loadSound("two.mp3");
        mThree = loadSound("three.mp3");
        mFour = loadSound("four.mp3");
        mFive = loadSound("five.mp3");
        mSix = loadSound("six.mp3");
        mSeven = loadSound("seven.mp3");
        mEight = loadSound("eight.mp3");
        mNine = loadSound("nine.mp3");
        mNull = loadSound("null.mp3");
    }
    @Override
    protected void onPause() {
        super.onPause();
        mSoundPool.release();
        mSoundPool = null;
    }
    // звуки;

    public void dod1_g2_playOne(View view){
        // звук:
        playSound(mOne);
    }

    public void dod1_g2_playTwo(View view){
        // звук:
        playSound(mTwo);
    }

    public void dod1_g2_playThree(View view){
        // звук:
        playSound(mThree);
    }

    public void dod1_g2_playFour(View view){
        // звук:
        playSound(mFour);
    }

    public void dod1_g2_playFive(View view){
        // звук:
        playSound(mFive);
    }

    public void dod1_g2_playSix(View view){
        // звук:
        playSound(mSix);
    }

    public void dod1_g2_playSeven(View view){
        // звук:
        playSound(mSeven);
    }

    public void dod1_g2_playEight(View view){
        // звук:
        playSound(mEight);
    }

    public void dod1_g2_playNine(View view){
        // звук:
        playSound(mNine);
    }

    public void dod1_g2_playNull(View view){
        // звук:
        playSound(mNull);
    }

    public void toMain_dod1_g2(View view){
        // перехід на головну з анімацією:
        Intent questionIntent = new Intent(dod1_g2.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void to_dod1_g3(View view){
        // перехід на кольори
        Intent questionIntent = new Intent(dod1_g2.this, dod1_g3.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
        finish();
    }

    @Override
    public void onStop(){
        super.onStop();
        finish();
    }
}