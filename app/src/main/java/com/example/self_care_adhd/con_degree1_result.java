package com.example.self_care_adhd;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class con_degree1_result extends AppCompatActivity {
    TextView result_d1;
    LinearLayout to_main, check_result_d1;

    int d1_result;

    //쉐어드 프리퍼런스
    SharedPreferences pref_d1;
    SharedPreferences.Editor editor_d1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.con_degree1_result);
        Intent intent = getIntent();


        //쉐어드 프리퍼런스 초기화
        pref_d1 = getSharedPreferences("con_d1", MODE_PRIVATE);
        editor_d1 = pref_d1.edit();
        d1_result = pref_d1.getInt("con_d1_c",0);

        //버튼 선언
        to_main = findViewById(R.id.to_main);
        check_result_d1 = findViewById(R.id.check_result_d1);
        to_main.setClickable(true);
        check_result_d1.setClickable(true);

        //점수 표시창 선언
        result_d1 = findViewById(R.id.result_d1);

        //점수 확인버튼 기능
        check_result_d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_d1.setText("점수 : "+ d1_result);

            }
        });

        //처음으로 돌아가기 버튼 기능
        to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_to_main = new Intent(con_degree1_result.this, MainActivity.class);
                startActivity(intent_to_main);
            }
        });


    }
}
