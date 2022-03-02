package org.izv.pmdm.jmunoz.balls;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;


public class GameActivity extends AppCompatActivity{

    private MediaPlayer sound;
    private GraphicView graphicView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        sound = MediaPlayer.create(this, R.raw.tetris);
        sound.start();

        Hilo h = new Hilo();
        h.start();
    }

    class Hilo extends Thread{

        @Override
        public void run() {
            try {
                sleep(5000);
                sound.stop();
                startActivity(new Intent(GameActivity.this, ChooseActivity.class));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}