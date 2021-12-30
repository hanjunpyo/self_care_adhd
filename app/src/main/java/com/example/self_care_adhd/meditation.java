package com.example.self_care_adhd;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class meditation extends AppCompatActivity {
    LinearLayout  back_to_main;
    MediaPlayer medi_song;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meditation);
        Intent intent = getIntent();

        //media player 초기화
        medi_song = MediaPlayer.create(meditation.this, R.raw.medi_song);
        medi_song.start();


        //버튼 초기화
        back_to_main = findViewById(R.id.back_to_main);back_to_main.setClickable(true);


        //처음으로
        back_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                medi_song.stop();
                medi_song.release();
                onBackPressed();
            }
        });
    }
}
