package org.izv.pmdm.jmunoz.balls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class ChooseActivity extends AppCompatActivity {

    private Button result;
    private MediaPlayer sound;
    private EditText etBlue, etYellow, etGreen, etRed;
    private TextInputLayout tvGreen, tvRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        init();

        result.setOnClickListener(v -> {
            compare();
            startActivity(new Intent(this, InfoActivity.class));
        });

    }

    private void init(){



        result = findViewById(R.id.btEnd);
        sound = MediaPlayer.create(this, R.raw.boton_click);

        etBlue = findViewById(R.id.etBallBlue);
        etYellow = findViewById(R.id.etBallYellow);
        etGreen = findViewById(R.id.etBallGreen);
        etRed = findViewById(R.id.etBallRed);
        tvGreen = findViewById(R.id.tvBallGreen);
        tvRed = findViewById(R.id.tvBallRed);

        if (MainActivity.mode == 1) {
            etGreen.setVisibility(View.INVISIBLE);
            etRed.setVisibility(View.INVISIBLE);
            tvGreen.setVisibility(View.INVISIBLE);
            tvRed.setVisibility(View.INVISIBLE);
        }
        else if(MainActivity.mode == 2){
            etRed.setVisibility(View.INVISIBLE);
            tvRed.setVisibility(View.INVISIBLE);
        }
        else{
            etGreen.setVisibility(View.VISIBLE);
            etRed.setVisibility(View.VISIBLE);
            tvGreen.setVisibility(View.VISIBLE);
            tvRed.setVisibility(View.VISIBLE);
        }

    }

    private void compare(){

        if(MainActivity.mode == 1){
            if(MainActivity.numBlue == Integer.parseInt(etBlue.getText().toString())  &&
                    MainActivity.numYellow == Integer.parseInt(etYellow.getText().toString()) ) {
                MainActivity.win = true;

            }
            else{
                MainActivity.win = false;
            }
        }
        else if(MainActivity.mode == 2){
            if(MainActivity.numBlue == Integer.parseInt(etBlue.getText().toString())  &&
                    MainActivity.numYellow == Integer.parseInt(etYellow.getText().toString()) &&
                    MainActivity.numGreen == Integer.parseInt(etGreen.getText().toString())) {
                MainActivity.win = true;
            }
            else{
                MainActivity.win = false;
            }
        }
        else if(MainActivity.mode == 3){
            if(MainActivity.numBlue == Integer.parseInt(etBlue.getText().toString())  &&
                    MainActivity.numYellow == Integer.parseInt(etYellow.getText().toString()) &&
                    MainActivity.numGreen == Integer.parseInt(etGreen.getText().toString()) &&
                    MainActivity.numRed == Integer.parseInt(etRed.getText().toString())) {
                MainActivity.win = true;
            }
            else{
                MainActivity.win = false;
            }
        }

    }

}