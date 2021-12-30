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

public class con_degree_316 extends AppCompatActivity {
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
        setContentView(R.layout.con_degree_316);
        Intent intent = getIntent();
        get_o = getIntent().getIntExtra("get_o", 0);
        count = getIntent().getIntExtra("count", 0);
        System.out.println(count);

        //랜덤변수
        random = new Random();
        randomValue = random.nextInt(23)+1;


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
                    Intent end_intent = new Intent(con_degree_316.this, con_degree1_result.class);
                    end_intent.putExtra("get_o", get_o);
                    startActivity(end_intent);
                }else{
                    if (randomValue == 1){
                        Intent intent_next1 = new Intent(con_degree_316.this, con_degree_31.class);
                        intent_next1.putExtra("count", count);
                        intent_next1.putExtra("get_o", get_o);
                        startActivity(intent_next1);
                    }else if(randomValue == 2){
                        Intent intent_next2 = new Intent(con_degree_316.this, con_degree_32.class);
                        intent_next2.putExtra("count", count);
                        intent_next2.putExtra("get_o", get_o);
                        startActivity(intent_next2);
                    }else if(randomValue == 3){
                        Intent intent_next3 = new Intent(con_degree_316.this, con_degree_33.class);
                        intent_next3.putExtra("count", count);
                        intent_next3.putExtra("get_o", get_o);
                        startActivity(intent_next3);
                    }else if(randomValue == 4){
                        Intent intent_next4 = new Intent(con_degree_316.this, con_degree_34.class);
                        intent_next4.putExtra("count", count);
                        intent_next4.putExtra("get_o", get_o);
                        startActivity(intent_next4);
                    }else if(randomValue == 5){
                        Intent intent_next5 = new Intent(con_degree_316.this, con_degree_35.class);
                        intent_next5.putExtra("count", count);
                        intent_next5.putExtra("get_o", get_o);
                        startActivity(intent_next5);
                    }else if(randomValue == 6){
                        Intent intent_next6 = new Intent(con_degree_316.this, con_degree_36.class);
                        intent_next6.putExtra("count", count);
                        intent_next6.putExtra("get_o", get_o);
                        startActivity(intent_next6);
                    }else if(randomValue == 7){
                        Intent intent_next7 = new Intent(con_degree_316.this, con_degree_37.class);
                        intent_next7.putExtra("count", count);
                        intent_next7.putExtra("get_o", get_o);
                        startActivity(intent_next7);
                    }else if(randomValue == 8){
                        Intent intent_next8 = new Intent(con_degree_316.this, con_degree_38.class);
                        intent_next8.putExtra("count", count);
                        intent_next8.putExtra("get_o", get_o);
                        startActivity(intent_next8);
                    }else if(randomValue == 9){
                        Intent intent_next9 = new Intent(con_degree_316.this, con_degree_39.class);
                        intent_next9.putExtra("count", count);
                        intent_next9.putExtra("get_o", get_o);
                        startActivity(intent_next9);
                    }else if(randomValue == 10){
                        Intent intent_next10 = new Intent(con_degree_316.this, con_degree_310.class);
                        intent_next10.putExtra("count", count);
                        intent_next10.putExtra("get_o", get_o);
                        startActivity(intent_next10);
                    }else if(randomValue == 11){
                        Intent intent_next11 = new Intent(con_degree_316.this, con_degree_311.class);
                        intent_next11.putExtra("count", count);
                        intent_next11.putExtra("get_o", get_o);
                        startActivity(intent_next11);
                    }else if(randomValue == 12){
                        Intent intent_next12 = new Intent(con_degree_316.this, con_degree_312.class);
                        intent_next12.putExtra("count", count);
                        intent_next12.putExtra("get_o", get_o);
                        startActivity(intent_next12);
                    }else if(randomValue == 13){
                        Intent intent_next13 = new Intent(con_degree_316.this, con_degree_313.class);
                        intent_next13.putExtra("count", count);
                        intent_next13.putExtra("get_o", get_o);
                        startActivity(intent_next13);
                    }else if(randomValue == 14){
                        Intent intent_next14 = new Intent(con_degree_316.this, con_degree_314.class);
                        intent_next14.putExtra("count", count);
                        intent_next14.putExtra("get_o", get_o);
                        startActivity(intent_next14);
                    }else if(randomValue == 15){
                        Intent intent_next15 = new Intent(con_degree_316.this, con_degree_315.class);
                        intent_next15.putExtra("count", count);
                        intent_next15.putExtra("get_o", get_o);
                        startActivity(intent_next15);
                    }else if(randomValue == 16){
                        Intent intent_next16 = new Intent(con_degree_316.this, con_degree_316.class);
                        intent_next16.putExtra("count", count);
                        intent_next16.putExtra("get_o", get_o);
                        startActivity(intent_next16);
                    }else if(randomValue == 17){
                        Intent intent_next17 = new Intent(con_degree_316.this, con_degree_317.class);
                        intent_next17.putExtra("count", count);
                        intent_next17.putExtra("get_o", get_o);
                        startActivity(intent_next17);
                    }else if(randomValue == 18){
                        Intent intent_next18 = new Intent(con_degree_316.this, con_degree_318.class);
                        intent_next18.putExtra("count", count);
                        intent_next18.putExtra("get_o", get_o);
                        startActivity(intent_next18);
                    }else if(randomValue == 19){
                        Intent intent_next19 = new Intent(con_degree_316.this, con_degree_319.class);
                        intent_next19.putExtra("count", count);
                        intent_next19.putExtra("get_o", get_o);
                        startActivity(intent_next19);
                    }else if(randomValue == 20){
                        Intent intent_next20 = new Intent(con_degree_316.this, con_degree_320.class);
                        intent_next20.putExtra("count", count);
                        intent_next20.putExtra("get_o", get_o);
                        startActivity(intent_next20);
                    }else if(randomValue == 21){
                        Intent intent_next21 = new Intent(con_degree_316.this, con_degree_321.class);
                        intent_next21.putExtra("count", count);
                        intent_next21.putExtra("get_o", get_o);
                        startActivity(intent_next21);
                    }else if(randomValue == 22){
                        Intent intent_next22 = new Intent(con_degree_316.this, con_degree_322.class);
                        intent_next22.putExtra("count", count);
                        intent_next22.putExtra("get_o", get_o);
                        startActivity(intent_next22);
                    }else if(randomValue == 23){
                        Intent intent_next23 = new Intent(con_degree_316.this, con_degree_323.class);
                        intent_next23.putExtra("count", count);
                        intent_next23.putExtra("get_o", get_o);
                        startActivity(intent_next23);
                    }
                }



            }
        });

    }
}