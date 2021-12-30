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

public class planner_sat extends AppCompatActivity {

    //쉐어드 프리퍼런스 사용 변수
    SharedPreferences pref_sat;
    SharedPreferences.Editor editor_sat;

    //저장될 스트링
    String my_plan_s_sat, class_of_plan_s_sat;

    //스트링 표시 EditText
    TextInputEditText my_plan_sat, class_of_plan_sat;

    //버튼
    LinearLayout add_plan_sat, back_to_calendar_sat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planner_sat);
        Intent intent_sat = getIntent();



        //쉐어드 프리퍼런스 초기화
        pref_sat = getSharedPreferences("planner1", MODE_PRIVATE);
        editor_sat = pref_sat.edit();

        //저장 값 불러오기
        my_plan_s_sat = pref_sat.getString("my_plan_sat", "NO_PLAN");
        class_of_plan_s_sat = pref_sat.getString("class_of_plan_sat", "NO_CLASS");


        //레이아웃 변수 초기화
        my_plan_sat = findViewById(R.id.my_plan_sat); class_of_plan_sat = findViewById(R.id.class_of_plan_sat);
        add_plan_sat = findViewById(R.id.add_plan_sat); back_to_calendar_sat = findViewById(R.id.back_to_calendar_sat);

        //앱 시동 시 이전 저장 값 표시
        my_plan_sat.setText(String.valueOf(my_plan_s_sat));
        class_of_plan_sat.setText(String.valueOf(class_of_plan_s_sat));

        add_plan_sat.setClickable(true); back_to_calendar_sat.setClickable(true);

        //계획 수정에 대한 버튼
        add_plan_sat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_plan_s_sat = my_plan_sat.getText().toString();
                class_of_plan_s_sat = class_of_plan_sat.getText().toString();
                editor_sat.putString("my_plan_sat", my_plan_s_sat);
                editor_sat.putString("class_of_plan_sat", class_of_plan_s_sat);
                editor_sat.apply();
                Intent intent = new Intent(planner_sat.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //취소(뒤로가기)에 대한 버튼
        back_to_calendar_sat.setOnClickListener(new View.OnClickListener() {
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