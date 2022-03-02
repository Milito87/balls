package org.izv.pmdm.jmunoz.balls;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView tvResult;
    private Button btRetry;
    private AlertDialog.Builder alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        tvResult = findViewById(R.id.tvResult);
        btRetry = findViewById(R.id.btRetry);

        if(MainActivity.win){
            tvResult.setText("YOU WIN !!!");
            tvResult.setOnClickListener(v -> {

            });
        }
        else{
            tvResult.setText("...YOU LOSE...");
        }

        btRetry.setOnClickListener(v -> {
                    alert = new AlertDialog.Builder(this);
                    alert.setTitle("CHOOSE YOUR LEVEL").setPositiveButton("HARD", (dialog, which) -> {
                        MainActivity.mode = 3;
                        startActivity(new Intent(InfoActivity.this, GameActivity.class));
                    }).setNegativeButton("NORMAL", (dialog, which) -> {
                        MainActivity.mode = 2;
                        startActivity(new Intent(InfoActivity.this, GameActivity.class));
                    }).setNeutralButton("EASY", (dialog, which) -> {
                        MainActivity.mode = 1;
                        startActivity(new Intent(InfoActivity.this, GameActivity.class));
                    }).show();
        });

    }
}