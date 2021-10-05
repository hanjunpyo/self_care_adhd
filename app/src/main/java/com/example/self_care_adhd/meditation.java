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
    LinearLayout music_control_button, back_to_main;
    MediaPlayer medi_song;
    TextView music_control;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meditation);
        Intent intent = getIntent();

        //media player 초기화
        medi_song = MediaPlayer.create(meditation.this, R.raw.medi_song);
        medi_song.start();


        //버튼 및 textview 초기화
        music_control = findViewById(R.id.music_control);
        music_control_button = findViewById(R.id.music_control_button);
        back_to_main = findViewById(R.id.back_to_main);
        music_control_button.setClickable(true); back_to_main.setClickable(true);


        //음악 버튼 작동
        music_control_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                medi_song.stop();
                medi_song.release();
                medi_song = null;
            }
        });
        /*
        music_control_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(medi_song != null){
                    if(!medi_song.isPlaying()){
                        medi_song.start();
                        music_control.setText("음악정지");
                    }else{
                        music_control.setText("음악틀기");
                        medi_song.stop();
                        medi_song.release();
                        medi_song = null;
                    }
                }else{
                    medi_song = MediaPlayer.create(meditation.this, R.raw.medi_song);
                    if(!medi_song.isPlaying()){
                        medi_song.start();
                        music_control.setText("음악정지");
                    }else{
                        music_control.setText("음악틀기");
                        medi_song.stop();
                        medi_song.release();
                        medi_song = null;
                    }
                }
            }
        });*/


        //처음으로
        back_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                medi_song.stop();
                medi_song.release();
                Intent intent_back = new Intent(meditation.this, MainActivity.class);
                startActivity(intent_back);
            }
        });
    }
}
