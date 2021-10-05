package com.example.self_care_adhd;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class con_degree_13 extends AppCompatActivity {

    //다음 버튼
    LinearLayout next_q;

    //라디오그룹
    RadioGroup answer_1;
    int check_radio = 1;

    //쉐어드 프리퍼런스
    SharedPreferences pref_d1;
    SharedPreferences.Editor editor_d1;


    //check
    int check_answer_d13;
    int check_step_d13;

    //random
    Random random_d13;
    int randomValue_d13;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.con_degree_13);
        Intent intent = getIntent();

        random_d13 = new Random();
        randomValue_d13 = random_d13.nextInt(11);

        //쉐어드 프리퍼런스 초기화
        pref_d1 = getSharedPreferences("con_d1", MODE_PRIVATE);
        editor_d1 = pref_d1.edit();
        check_answer_d13 = pref_d1.getInt("con_d1_c", 0);
        check_step_d13 = pref_d1.getInt("con_d1_step", 0);


        //라디오그룹 선언
        answer_1 = findViewById(R.id.answer_1);

        //체크 확인
        answer_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.right_answer) {
                    check_radio = 1;
                    System.out.println(check_radio);
                } else if (checkedId == R.id.wrong_1) {
                    check_radio = 2;
                    System.out.println(check_radio);
                } else if (checkedId == R.id.wrong_2) {
                    check_radio = 3;
                    System.out.println(check_radio);
                } else {
                    check_radio = 4;
                    System.out.println(check_radio);
                }
            }
        });

        //버튼 선언
        next_q = findViewById(R.id.next_q);
        next_q.setClickable(true);

        //onclick
        next_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor_d1.putInt("con_d1_c", check_answer_d13 + 1);
                Intent intent_next = new Intent(con_degree_13.this, con_degree_14.class);
                startActivity(intent_next);
            }
        });
    }

}