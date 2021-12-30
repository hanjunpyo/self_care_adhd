package com.example.self_care_adhd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class imp_game3 extends AppCompatActivity {
    LinearLayout stop_game, next_q;
    RadioGroup answer_check;
    int check_radio = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imp_game3);
        Intent intent = getIntent();

        //라디오그룹
        answer_check = findViewById(R.id.answer_check);
        answer_check.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.right_answer){
                    check_radio = 1;
                    System.out.println(check_radio);
                }else{
                    check_radio = 2;
                }

            }
        });

        //버튼 초기화 및 설정
        stop_game = findViewById(R.id.stop_game); next_q = findViewById(R.id.next_q);
        stop_game.setClickable(true); next_q.setClickable(true);


        stop_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_stop = new Intent(imp_game3.this, MainActivity.class);
                startActivity(intent_stop);
            }
        });


        next_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check_radio == 1){
                    Toast.makeText(getApplicationContext(), "정답입니다.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "오답입니다.", Toast.LENGTH_SHORT).show();
                }
                Intent intent_next = new Intent(imp_game3.this, imp_game4.class);
                startActivity(intent_next);
            }
        });




    }
}
