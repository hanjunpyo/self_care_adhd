package com.example.self_care_adhd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class con_tips extends AppCompatActivity {
    BottomNavigationView navi_con_tips;
    con_tip1 con_tip1;
    con_tip2 con_tip2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.con_tips);
        Intent intent = getIntent();

        //navigation 선언
        navi_con_tips = findViewById(R.id.navi_con_tips);

        //프래그먼트 생성
        con_tip1 = new con_tip1();
        con_tip2 = new con_tip2();



        //먼저 띄워줄 화면
        getSupportFragmentManager().beginTransaction().replace(R.id.con_tips_scr,con_tip1).commitAllowingStateLoss();



        //navigation 화살표 클릭 시 설정
        navi_con_tips.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.menu_back:
                        getSupportFragmentManager().beginTransaction().replace(R.id.con_tips_scr, con_tip1).commitAllowingStateLoss();
                        return true;
                    case R.id.menu_next:
                        getSupportFragmentManager().beginTransaction().replace(R.id.con_tips_scr, con_tip2).commitAllowingStateLoss();
                        return true;
                    default:
                        return false;

                }
            }
        });



    }
}