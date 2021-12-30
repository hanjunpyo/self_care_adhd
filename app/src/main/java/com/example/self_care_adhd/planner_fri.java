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

public class planner_fri extends AppCompatActivity {

    //쉐어드 프리퍼런스 사용 변수
    SharedPreferences pref_fri;
    SharedPreferences.Editor editor_fri;

    //저장될 스트링
    String my_plan_s_fri, class_of_plan_s_fri;

    //스트링 표시 EditText
    TextInputEditText my_plan_fri, class_of_plan_fri;

    //버튼
    LinearLayout add_plan_fri, back_to_calendar_fri;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planner_fri);
        Intent intent_fri = getIntent();


        //쉐어드 프리퍼런스 초기화
        pref_fri = getSharedPreferences("planner1", MODE_PRIVATE);
        editor_fri = pref_fri.edit();

        //저장 값 불러오기
        my_plan_s_fri = pref_fri.getString("my_plan_fri", "NO_PLAN");
        class_of_plan_s_fri = pref_fri.getString("class_of_plan_fri", "NO_CLASS");


        //레이아웃 변수 초기화
        my_plan_fri = findViewById(R.id.my_plan_fri); class_of_plan_fri = findViewById(R.id.class_of_plan_fri);
        add_plan_fri = findViewById(R.id.add_plan_fri); back_to_calendar_fri = findViewById(R.id.back_to_calendar_fri);

        //앱 시동 시 이전 저장 값 표시
        my_plan_fri.setText(String.valueOf(my_plan_s_fri));
        class_of_plan_fri.setText(String.valueOf(class_of_plan_s_fri));

        add_plan_fri.setClickable(true); back_to_calendar_fri.setClickable(true);

        //계획 수정에 대한 버튼
        add_plan_fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_plan_s_fri = my_plan_fri.getText().toString();
                class_of_plan_s_fri = class_of_plan_fri.getText().toString();
                editor_fri.putString("my_plan_fri", my_plan_s_fri);
                editor_fri.putString("class_of_plan_fri", class_of_plan_s_fri);
                editor_fri.apply();
                Intent intent = new Intent(planner_fri.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //취소(뒤로가기)에 대한 버튼
        back_to_calendar_fri.setOnClickListener(new View.OnClickListener() {
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