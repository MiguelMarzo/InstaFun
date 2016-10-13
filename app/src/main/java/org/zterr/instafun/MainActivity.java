package org.zterr.instafun;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = (ImageView) findViewById(R.id.imageView1);
        image2 = (ImageView) findViewById(R.id.imageView2);
        image3 = (ImageView) findViewById(R.id.imageView3);
        image4 = (ImageView) findViewById(R.id.imageView4);
        image5 = (ImageView) findViewById(R.id.imageView5);
        image6 = (ImageView) findViewById(R.id.imageView6);

    }

    public void playSound1(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.surprise);
        mp.start();
    }
    public void playSound2(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.whatislove);
        mp.start();
    }
    public void playSound3(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.idontwanttoliveinthisplanetanymore);
        mp.start();
    }
    public void playSound4(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.bite);
        mp.start();
    }
    public void playSound5(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.irony);
        mp.start();
    }
    public void playSound6(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.hey);
        mp.start();
    }

}
