package org.izv.pmdm.jmunoz.balls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button easy, normal, hard;
    private Intent i;
    private MediaPlayer sound;
    public static int mode, numBlue, numYellow, numGreen, numRed;
    public static boolean win;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        easy.setOnClickListener(v -> {
            mode = 1;
            numBlue = -1;
            numYellow = -1;
            numGreen = -1;
            numRed = -1;
            sound.start();
            startActivity(i);
        });

        normal.setOnClickListener(v -> {
            mode = 2;
            sound.start();
            startActivity(i);
        });

        hard.setOnClickListener(v -> {
            mode = 3;
            sound.start();
            startActivity(i);
        });

    }

    private void init(){

        easy = findViewById(R.id.btEasy);
        normal = findViewById(R.id.btNormal);
        hard = findViewById(R.id.btHard);
        sound = MediaPlayer.create(this, R.raw.boton_click);
        mode = -1;
        win=false;
        i = new Intent(this, GameActivity.class);

    }

}