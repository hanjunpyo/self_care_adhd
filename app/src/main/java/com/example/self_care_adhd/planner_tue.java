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

public class planner_tue extends AppCompatActivity {

    //쉐어드 프리퍼런스 사용 변수
    SharedPreferences pref_tue;
    SharedPreferences.Editor editor_tue;

    //저장될 스트링
    String my_plan_s_tue, class_of_plan_s_tue;

    //스트링 표시 EditText
    TextInputEditText my_plan_tue, class_of_plan_tue;

    //버튼
    LinearLayout add_plan_tue, back_to_calendar_tue;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planner_tue);
        Intent intent_tue = getIntent();


        //쉐어드 프리퍼런스 초기화
        pref_tue = getSharedPreferences("planner3", MODE_PRIVATE);
        editor_tue = pref_tue.edit();

        //저장 값 불러오기
        my_plan_s_tue = pref_tue.getString("my_plan_tue", "NO_PLAN");
        class_of_plan_s_tue = pref_tue.getString("class_of_plan_tue", "NO_CLASS");


        //레이아웃 변수 초기화
        my_plan_tue = findViewById(R.id.my_plan_tue); class_of_plan_tue = findViewById(R.id.class_of_plan_tue);
        add_plan_tue = findViewById(R.id.add_plan_tue); back_to_calendar_tue = findViewById(R.id.back_to_calendar_tue);

        //앱 시동 시 이전 저장 값 표시
        my_plan_tue.setText(String.valueOf(my_plan_s_tue));
        class_of_plan_tue.setText(String.valueOf(class_of_plan_s_tue));

        add_plan_tue.setClickable(true); back_to_calendar_tue.setClickable(true);

        //계획 수정에 대한 버튼
        add_plan_tue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_plan_s_tue = my_plan_tue.getText().toString();
                class_of_plan_s_tue = class_of_plan_tue.getText().toString();
                editor_tue.putString("my_plan_tue", my_plan_s_tue);
                editor_tue.putString("class_of_plan_tue", class_of_plan_s_tue);
                editor_tue.apply();
                Intent intent = new Intent(planner_tue.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //취소(뒤로가기)에 대한 버튼
        back_to_calendar_tue.setOnClickListener(new View.OnClickListener() {
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
