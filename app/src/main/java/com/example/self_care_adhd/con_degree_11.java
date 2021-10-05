package com.example.self_care_adhd;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class con_degree_11 extends AppCompatActivity {
    //다음 버튼
    LinearLayout next_q;

    //라디오그룹
    RadioGroup answer_1;
    int check_radio = 1;

    //쉐어드 프리퍼런스
    SharedPreferences pref_d1;
    SharedPreferences.Editor editor_d1;


    //check
    int check_answer_d11;
    int check_step_d11;

    //random
    Random random_d11;
    int randomValue_d11;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.con_degree_11);
        Intent intent = getIntent();

        random_d11 = new Random();
        randomValue_d11 = random_d11.nextInt(11);

        //쉐어드 프리퍼런스 초기화
        pref_d1 = getSharedPreferences("con_d1", MODE_PRIVATE);
        editor_d1 = pref_d1.edit();
        check_answer_d11 = pref_d1.getInt("con_d1_c",0);
        check_step_d11 = pref_d1.getInt("con_d1_step",0);


        //라디오그룹 선언
        answer_1 = findViewById(R.id.answer_1);

        //체크 확인
        answer_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.right_answer){
                    check_radio = 1;
                    System.out.println(check_radio);
                }else if(checkedId == R.id.wrong_1){
                    check_radio = 2;
                    System.out.println(check_radio);
                }else if(checkedId == R.id.wrong_2){
                    check_radio = 3;
                    System.out.println(check_radio);
                }else{
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
                editor_d1.putInt("con_d1_c", check_answer_d11+1);
                Intent intent_next = new Intent(con_degree_11.this, con_degree_12.class);
                startActivity(intent_next);
            }
        });

        /*
        //onclick
        next_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check_radio == 1) {
                    editor_d1.putInt("con_d1_c", check_answer+1);
                    System.out.println(check_answer+1);
                    Intent intent_next_o = new Intent(con_degree_11.this, planner.class);
                    startActivity(intent_next_o);
                }else{
                    editor_d1.putInt("con_d1_c", check_answer);
                    System.out.println(check_answer);
                    Intent intent_next_x = new Intent(con_degree_11.this, con_degree1_result.class);
                    startActivity(intent_next_x);
                }

            }
        });


         */

/*
        next_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor_d1.putInt("con_d1_step", check_step_d11+1);
                switch(randomValue_d11){
                    case 0:
                        if (check_radio == 1) {
                            editor_d1.putInt("con_d1_c", check_answer_d11+1);
                            System.out.println(check_answer_d11+1);
                            if ((check_step_d11+1) < 5 ){

                                Intent intent_next_o1 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_o1);
                            }else{
                                Intent intent_next_o2 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_o2);
                            }

                        }else{
                            System.out.println(check_answer_d11);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_x1 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_x1);
                            }else{
                                Intent intent_next_x2 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_x2);
                            }
                        }
                        break;
                    case 1:
                        if (check_radio == 1) {
                            editor_d1.putInt("con_d1_c", check_answer_d11+1);
                            System.out.println(check_answer_d11+1);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_o3 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_o3);
                            }else{
                                Intent intent_next_o4 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_o4);
                            }

                        }else{
                            System.out.println(check_answer_d11);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_x3 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_x3);
                            }else{
                                Intent intent_next_x4 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_x4);
                            }
                        }
                        break;
                    case 2:
                        if (check_radio == 1) {
                            editor_d1.putInt("con_d1_c", check_answer_d11+1);
                            System.out.println(check_answer_d11+1);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_o5 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_o5);
                            }else{
                                Intent intent_next_o6 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_o6);
                            }

                        }else{
                            System.out.println(check_answer_d11);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_x5 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_x5);
                            }else{
                                Intent intent_next_x6 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_x6);
                            }
                        }
                        break;
                    case 3:
                        if (check_radio == 1) {
                            editor_d1.putInt("con_d1_c", check_answer_d11+1);
                            System.out.println(check_answer_d11+1);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_o7 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_o7);
                            }else{
                                Intent intent_next_o8 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_o8);
                            }

                        }else{
                            System.out.println(check_answer_d11);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_x7 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_x7);
                            }else{
                                Intent intent_next_x8 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_x8);
                            }
                        }
                        break;
                    case 4:
                        if (check_radio == 1) {
                            editor_d1.putInt("con_d1_c", check_answer_d11+1);
                            System.out.println(check_answer_d11+1);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_o9 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_o9);
                            }else{
                                Intent intent_next_o10 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_o10);
                            }

                        }else{
                            System.out.println(check_answer_d11);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_x9 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_x9);
                            }else{
                                Intent intent_next_x10 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_x10);
                            }
                        }
                        break;
                    case 5:
                        if (check_radio == 1) {
                            editor_d1.putInt("con_d1_c", check_answer_d11+1);
                            System.out.println(check_answer_d11+1);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_o11 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_o11);
                            }else{
                                Intent intent_next_o12 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_o12);
                            }

                        }else{
                            System.out.println(check_answer_d11);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_x11 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_x11);
                            }else{
                                Intent intent_next_x12 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_x12);
                            }
                        }
                        break;
                    case 6:
                        if (check_radio == 1) {
                            editor_d1.putInt("con_d1_c", check_answer_d11+1);
                            System.out.println(check_answer_d11+1);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_o13 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_o13);
                            }else{
                                Intent intent_next_o14 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_o14);
                            }

                        }else{
                            System.out.println(check_answer_d11);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_x13 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_x13);
                            }else{
                                Intent intent_next_x14 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_x14);
                            }
                        }
                        break;
                    case 7:
                        if (check_radio == 1) {
                            editor_d1.putInt("con_d1_c", check_answer_d11+1);
                            System.out.println(check_answer_d11+1);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_o15 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_o15);
                            }else{
                                Intent intent_next_o16 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_o16);
                            }

                        }else{
                            System.out.println(check_answer_d11);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_x15 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_x15);
                            }else{
                                Intent intent_next_x16 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_x16);
                            }
                        }
                        break;
                    case 8:
                        if (check_radio == 1) {
                            editor_d1.putInt("con_d1_c", check_answer_d11+1);
                            System.out.println(check_answer_d11+1);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_o17 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_o17);
                            }else{
                                Intent intent_next_o18 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_o18);
                            }

                        }else{
                            System.out.println(check_answer_d11);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_x17 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_x17);
                            }else{
                                Intent intent_next_x18 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_x18);
                            }
                        }
                        break;
                    case 9:
                        if (check_radio == 1) {
                            editor_d1.putInt("con_d1_c", check_answer_d11+1);
                            System.out.println(check_answer_d11+1);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_o19 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_o19);
                            }else{
                                Intent intent_next_o20 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_o20);
                            }

                        }else{
                            System.out.println(check_answer_d11);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_x19 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_x19);
                            }else{
                                Intent intent_next_x20 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_x20);
                            }
                        }
                        break;
                    case 10:
                        if (check_radio == 1) {
                            editor_d1.putInt("con_d1_c", check_answer_d11+1);
                            System.out.println(check_answer_d11+1);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_o21 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_o21);
                            }else{
                                Intent intent_next_o22 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_o22);
                            }

                        }else{
                            System.out.println(check_answer_d11);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_x21 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_x21);
                            }else{
                                Intent intent_next_x22 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_x22);
                            }
                        }
                        break;
                    default:
                        if (check_radio == 1) {
                            editor_d1.putInt("con_d1_c", check_answer_d11+1);
                            System.out.println(check_answer_d11+1);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_o23 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_o23);
                            }else{
                                Intent intent_next_o24 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_o24);
                            }

                        }else{
                            System.out.println(check_answer_d11);
                            if ((check_step_d11+1) < 5 ){
                                Intent intent_next_x23 = new Intent(con_degree_11.this, con_degree_11.class);
                                startActivity(intent_next_x23);
                            }else{
                                Intent intent_next_x24 = new Intent(con_degree_11.this, con_degree1_result.class);
                                startActivity(intent_next_x24);
                            }
                        }
                        break;
                }
            }
        });



 */

    }
}