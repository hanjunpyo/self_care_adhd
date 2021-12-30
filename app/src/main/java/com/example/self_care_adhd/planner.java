package com.example.self_care_adhd;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class planner extends AppCompatActivity {

    //쉐어드 프리퍼런스 사용 변수
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    //저장될 스트링
    String my_plan_s, class_of_plan_s;

    //스트링 표시 EditText
    TextInputEditText my_plan, class_of_plan;

    //버튼
    LinearLayout add_plan, back_to_calendar;

    //알람 라디오버튼 및 버튼 확인 위한 변수
    RadioGroup alarm_check;
    int check_radio = 1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planner);
        Intent intent = getIntent();


        //쉐어드 프리퍼런스 초기화
        pref = getSharedPreferences("planner1", MODE_PRIVATE);
        editor = pref.edit();

        //저장 값 불러오기
        my_plan_s = pref.getString("my_plan", "계획 없음");
        class_of_plan_s = pref.getString("class_of_plan", "분류 없음");


        //레이아웃 변수 초기화
        my_plan = findViewById(R.id.my_plan); class_of_plan = findViewById(R.id.class_of_plan);
        add_plan = findViewById(R.id.add_plan); back_to_calendar = findViewById(R.id.back_to_calendar);

        //앱 시동 시 이전 저장 값 표시
        my_plan.setText(String.valueOf(my_plan_s));
        class_of_plan.setText(String.valueOf(class_of_plan_s));

        add_plan.setClickable(true); back_to_calendar.setClickable(true);

        //계획 수정에 대한 버튼
        add_plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_plan_s = my_plan.getText().toString();
                class_of_plan_s = class_of_plan.getText().toString();
                editor.putString("my_plan", my_plan_s);
                editor.putString("class_of_plan", class_of_plan_s);
                editor.apply();
                Intent intent = new Intent(planner.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //취소(뒤로가기)에 대한 버튼
        back_to_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        /*
        RadioGroup.OnCheckedChangeListener radioGroupClickListener = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.alarm_y) {
                    check_radio = 1;
                    Toast.makeText(planner.this , "1번 눌림", Toast.LENGTH_SHORT).show();
                }else if(checkedId == R.id.alarm_n){
                    check_radio = 2;
                }else{
                    check_radio = 3;
                }
            }
        };*/




    }

}
