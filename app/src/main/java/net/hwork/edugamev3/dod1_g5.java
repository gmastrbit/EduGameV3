package net.hwork.edugamev3;

import android.annotation.TargetApi;
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

public class dod1_g5 extends AppCompatActivity {

    private SoundPool mSoundPool;
    private AssetManager mAssetManager;
    private int mStreamID, mDo, mRe, mMi, mFa, mSol, mLa, mSi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dod1_g5);
        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // шрифт:
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "comic.ttf");
        TextView textView11 = (TextView) findViewById(R.id.textView203);
        textView11.setTypeface(typeFace);
        TextView textView0 = (TextView) findViewById(R.id.textView204);
        textView0.setTypeface(typeFace);
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
        mDo = loadSound("do.mp3");
        mRe = loadSound("re.mp3");
        mMi = loadSound("mi.mp3");
        mFa = loadSound("fa.mp3");
        mSol = loadSound("sol.mp3");
        mLa = loadSound("la.mp3");
        mSi = loadSound("si.mp3");
    }
    @Override
    protected void onPause() {
        super.onPause();
        mSoundPool.release();
        mSoundPool = null;
    }
    // звуки;

    public void dod1_g5_playDo(View view){
        // звук:
        playSound(mDo);
        TextView textView = findViewById(R.id.textView204);
        textView.setText("До");
    }

    public void dod1_g5_playRe(View view){
        // звук:
        playSound(mRe);
        TextView textView = findViewById(R.id.textView204);
        textView.setText("Ре");
    }

    public void dod1_g5_playMi(View view){
        // звук:
        playSound(mMi);
        TextView textView = findViewById(R.id.textView204);
        textView.setText("Мі");
    }

    public void dod1_g5_playFa(View view){
        // звук:
        playSound(mFa);
        TextView textView = findViewById(R.id.textView204);
        textView.setText("Фа");
    }

    public void dod1_g5_playSol(View view){
        // звук:
        playSound(mSol);
        TextView textView = findViewById(R.id.textView204);
        textView.setText("Соль");
    }

    public void dod1_g5_playLa(View view){
        // звук:
        playSound(mLa);
        TextView textView = findViewById(R.id.textView204);
        textView.setText("Ля");
    }

    public void dod1_g5_playSi(View view){
        // звук:
        playSound(mSi);
        TextView textView = findViewById(R.id.textView204);
        textView.setText("Сі");
    }

    @Override
    public void onStop(){
        super.onStop();
        finish();
    }
}