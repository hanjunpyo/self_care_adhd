package com.example.self_care_adhd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView botnavi;
    calendar calendar;
    impulsivity impulsivity;
    concentration concentration;
    pills_menu pills_menu;

    //모든 쉐어드 프리퍼런스 선언(초기화를 위해서)
    SharedPreferences pref_d1;
    SharedPreferences.Editor editor_d1;
    SharedPreferences pref_d2;
    SharedPreferences.Editor editor_d2;
    SharedPreferences pref_d3;
    SharedPreferences.Editor editor_d3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botnavi = findViewById(R.id.navi1);



        //쉐어드프리퍼런스 초기화
        pref_d1 = getSharedPreferences("con_d1", MODE_PRIVATE);
        editor_d1 = pref_d1.edit();
        pref_d2 = getSharedPreferences("con_d2", MODE_PRIVATE);
        editor_d2 = pref_d2.edit();
        pref_d3 = getSharedPreferences("con_d3", MODE_PRIVATE);
        editor_d3 = pref_d3.edit();
        editor_d1.putInt("con_d1_c", 0);
        editor_d2.putInt("con_d2_c", 0);
        editor_d3.putInt("con_d3_c", 0);
        editor_d1.putInt("con_d1_step", 0);
        editor_d2.putInt("con_d2_step", 0);
        editor_d3.putInt("con_d3_step", 0);


        //프래그먼트 생성
        calendar = new calendar();
        impulsivity = new impulsivity();
        concentration = new concentration();
        pills_menu = new pills_menu();


        //먼저 띄워줄 화면
        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout,calendar).commitAllowingStateLoss();

        botnavi.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.menu1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, calendar).commitAllowingStateLoss();
                        return true;
                    case R.id.menu2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, concentration).commitAllowingStateLoss();
                        return true;
                    case R.id.menu3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, impulsivity).commitAllowingStateLoss();
                        return true;
                    case R.id.menu4:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, pills_menu).commitAllowingStateLoss();
                        return true;
                    default:
                        return false;

                }
            }
        });

    }
}