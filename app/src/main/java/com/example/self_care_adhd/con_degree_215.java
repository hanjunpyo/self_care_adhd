package com.example.self_care_adhd;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class con_degree_215 extends AppCompatActivity {
    //다음 버튼
    LinearLayout next_q;

    //라디오그룹
    RadioGroup answer_1;
    int check_radio = 1;

    //정답 및 문제 개수 체크 변수
    int get_o = 0;
    int count = 0;

    //random
    Random random;
    int randomValue;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.con_degree_215);
        Intent intent = getIntent();
        get_o = getIntent().getIntExtra("get_o", 0);
        count = getIntent().getIntExtra("count", 0);
        System.out.println(count);

        //랜덤변수
        random = new Random();
        randomValue = random.nextInt(15)+1;


        //라디오그룹 선언
        answer_1 = findViewById(R.id.answer_1);

        //체크 확인
        answer_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.right_answer){
                    check_radio = 1;
                    System.out.println(check_radio);
                }else{
                    check_radio = 2;
                    System.out.println(check_radio);
                }
            }
        });

        //버튼 선언
        next_q = findViewById(R.id.next_q);
        next_q.setClickable(true);

        //onClick
        next_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count += 1;
                System.out.println(count);

                if(check_radio == 1){
                    get_o += 1;
                    Toast.makeText(getApplicationContext(), "정답입니다.  " +(5-count) + "문제 남음", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "오답입니다.  "+(5-count) + "문제 남음", Toast.LENGTH_SHORT).show();
                }
                if(count >= 5){
                    Intent end_intent = new Intent(con_degree_215.this, con_degree1_result.class);
                    end_intent.putExtra("get_o", get_o);
                    startActivity(end_intent);
                }else{
                    if (randomValue == 1){
                        Intent intent_next1 = new Intent(con_degree_215.this, con_degree_21.class);
                        intent_next1.putExtra("count", count);
                        intent_next1.putExtra("get_o", get_o);
                        startActivity(intent_next1);
                    }else if(randomValue == 2){
                        Intent intent_next2 = new Intent(con_degree_215.this, con_degree_22.class);
                        intent_next2.putExtra("count", count);
                        intent_next2.putExtra("get_o", get_o);
                        startActivity(intent_next2);
                    }else if(randomValue == 3){
                        Intent intent_next3 = new Intent(con_degree_215.this, con_degree_23.class);
                        intent_next3.putExtra("count", count);
                        intent_next3.putExtra("get_o", get_o);
                        startActivity(intent_next3);
                    }else if(randomValue == 4){
                        Intent intent_next4 = new Intent(con_degree_215.this, con_degree_24.class);
                        intent_next4.putExtra("count", count);
                        intent_next4.putExtra("get_o", get_o);
                        startActivity(intent_next4);
                    }else if(randomValue == 5){
                        Intent intent_next5 = new Intent(con_degree_215.this, con_degree_25.class);
                        intent_next5.putExtra("count", count);
                        intent_next5.putExtra("get_o", get_o);
                        startActivity(intent_next5);
                    }else if(randomValue == 6){
                        Intent intent_next6 = new Intent(con_degree_215.this, con_degree_26.class);
                        intent_next6.putExtra("count", count);
                        intent_next6.putExtra("get_o", get_o);
                        startActivity(intent_next6);
                    }else if(randomValue == 7){
                        Intent intent_next7 = new Intent(con_degree_215.this, con_degree_27.class);
                        intent_next7.putExtra("count", count);
                        intent_next7.putExtra("get_o", get_o);
                        startActivity(intent_next7);
                    }else if(randomValue == 8){
                        Intent intent_next8 = new Intent(con_degree_215.this, con_degree_28.class);
                        intent_next8.putExtra("count", count);
                        intent_next8.putExtra("get_o", get_o);
                        startActivity(intent_next8);
                    }else if(randomValue == 9){
                        Intent intent_next9 = new Intent(con_degree_215.this, con_degree_29.class);
                        intent_next9.putExtra("count", count);
                        intent_next9.putExtra("get_o", get_o);
                        startActivity(intent_next9);
                    }else if(randomValue == 10){
                        Intent intent_next10 = new Intent(con_degree_215.this, con_degree_210.class);
                        intent_next10.putExtra("count", count);
                        intent_next10.putExtra("get_o", get_o);
                        startActivity(intent_next10);
                    }else if(randomValue == 11){
                        Intent intent_next11 = new Intent(con_degree_215.this, con_degree_211.class);
                        intent_next11.putExtra("count", count);
                        intent_next11.putExtra("get_o", get_o);
                        startActivity(intent_next11);
                    }else if(randomValue == 12){
                        Intent intent_next12 = new Intent(con_degree_215.this, con_degree_212.class);
                        intent_next12.putExtra("count", count);
                        intent_next12.putExtra("get_o", get_o);
                        startActivity(intent_next12);
                    }else if(randomValue == 13){
                        Intent intent_next13 = new Intent(con_degree_215.this, con_degree_213.class);
                        intent_next13.putExtra("count", count);
                        intent_next13.putExtra("get_o", get_o);
                        startActivity(intent_next13);
                    }else if(randomValue == 14){
                        Intent intent_next14 = new Intent(con_degree_215.this, con_degree_214.class);
                        intent_next14.putExtra("count", count);
                        intent_next14.putExtra("get_o", get_o);
                        startActivity(intent_next14);
                    }else{
                        Intent intent_next15 = new Intent(con_degree_215.this, con_degree_2.class);
                        intent_next15.putExtra("count", count);
                        intent_next15.putExtra("get_o", get_o);
                        startActivity(intent_next15);
                    }
                }



            }
        });









    }
}