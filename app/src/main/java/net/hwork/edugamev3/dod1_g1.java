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

public class dod1_g1 extends AppCompatActivity {

    private SoundPool mSoundPool;
    private AssetManager mAssetManager;
    private int mStreamID, mRed, mGreen, mBlue, mYellow, mCyan, mOrange, mPurple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dod1_g1);
        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // шрифт:
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
        TextView textView = (TextView) findViewById(R.id.textView189);
        textView.setTypeface(typeFace);
        TextView textView0 = (TextView) findViewById(R.id.textView190);
        textView0.setTypeface(typeFace);
        TextView textView1 = (TextView) findViewById(R.id.textView191);
        textView1.setTypeface(typeFace);
        TextView textView2 = (TextView) findViewById(R.id.textView192);
        textView2.setTypeface(typeFace);
        TextView textView3 = (TextView) findViewById(R.id.textView193);
        textView3.setTypeface(typeFace);
        TextView textView4 = (TextView) findViewById(R.id.textView194);
        textView4.setTypeface(typeFace);
        TextView textView41 = (TextView) findViewById(R.id.textView199);
        textView41.setTypeface(typeFace);
        TextView textView42 = (TextView) findViewById(R.id.textView197);
        textView42.setTypeface(typeFace);
        TextView textView43 = (TextView) findViewById(R.id.textView198);
        textView43.setTypeface(typeFace);
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
        mRed = loadSound("red.mp3");
        mBlue = loadSound("blue.mp3");
        mGreen = loadSound("green.mp3");
        mYellow = loadSound("yellow.mp3");
        mCyan = loadSound("cyan.mp3");
        mOrange = loadSound("orange.mp3");
        mPurple = loadSound("purple.mp3");
    }
    @Override
    protected void onPause() {
        super.onPause();
        mSoundPool.release();
        mSoundPool = null;
    }
    // звуки;

    public void dod1_g1_playRed(View view){
        // звук:
        playSound(mRed);
    }

    public void dod1_g1_playGreen(View view){
        // звук:
        playSound(mGreen);
    }

    public void dod1_g1_playBlue(View view){
        // звук:
        playSound(mBlue);
    }
    public void dod1_g1_playYellow(View view){
        // звук:
        playSound(mYellow);
    }
    public void dod1_g1_playCyan(View view){
        // звук:
        playSound(mCyan);
    }
    public void dod1_g1_playOrange(View view){
        // звук:
        playSound(mOrange);
    }
    public void dod1_g1_playPurple(View view){
        // звук:
        playSound(mPurple);
    }

    public void toMain_dod1_g1(View view){
        // перехід на головну з анімацією:
        Intent questionIntent = new Intent(dod1_g1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
        finish();
    }

    public void to_dod1_g2(View view){
        // перехід на кольори
        Intent questionIntent = new Intent(dod1_g1.this, dod1_g2.class);
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