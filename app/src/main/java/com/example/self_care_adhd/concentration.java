package com.example.self_care_adhd;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class concentration extends Fragment {
    ViewGroup viewGroup;
    LinearLayout degree_1, degree_2, degree_3, con_tips;
    Random random;
    int randomValue = 0;
    int randomValue2 = 0;
    int randomValue3 = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.concentration, container, false);

        //버튼 설정 및 클릭 활성화
        degree_1 = viewGroup.findViewById(R.id.degree_1);
        degree_2 = viewGroup.findViewById(R.id.degree_2);
        degree_3 = viewGroup.findViewById(R.id.degree_3);
        con_tips = viewGroup.findViewById(R.id.con_tips);
        degree_1.setClickable(true); degree_2.setClickable(true); degree_3.setClickable(true);
        con_tips.setClickable(true);

        //문제를 위한 랜덤 변수 생성
        random = new Random();
        randomValue = random.nextInt(12) + 1;
        randomValue2 = random.nextInt(16) + 1;
        randomValue3 = random.nextInt(24) + 1;
        System.out.println(randomValue);
        System.out.println(randomValue2);
        System.out.println(randomValue3);


        //초급 activity 버튼
        degree_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent_d1 = new Intent(getActivity(), con_degree_1.class);
                //startActivity(intent_d1);
                if(randomValue == 1){
                    Intent intent_d1 = new Intent(getActivity(), con_degree_1.class);
                    intent_d1.putExtra("get_o", 0);
                    intent_d1.putExtra("count", 0);
                    startActivity(intent_d1);
                }else if(randomValue == 2){
                    Intent intent_d11 = new Intent(getActivity(), con_degree_11.class);
                    intent_d11.putExtra("get_o", 0);
                    intent_d11.putExtra("count", 0);
                    startActivity(intent_d11);
                }else if(randomValue == 3){
                    Intent intent_d12 = new Intent(getActivity(), con_degree_12.class);
                    intent_d12.putExtra("get_o", 0);
                    intent_d12.putExtra("count", 0);
                    startActivity(intent_d12);
                }else if(randomValue == 4){
                    Intent intent_d13 = new Intent(getActivity(), con_degree_13.class);
                    intent_d13.putExtra("get_o", 0);
                    intent_d13.putExtra("count", 0);
                    startActivity(intent_d13);
                }else if(randomValue == 5){
                    Intent intent_d14 = new Intent(getActivity(), con_degree_14.class);
                    intent_d14.putExtra("get_o", 0);
                    intent_d14.putExtra("count", 0);
                    startActivity(intent_d14);
                }else if(randomValue == 6){
                    Intent intent_d15 = new Intent(getActivity(), con_degree_15.class);
                    intent_d15.putExtra("get_o", 0);
                    intent_d15.putExtra("count", 0);
                    startActivity(intent_d15);
                }else if(randomValue == 7){
                    Intent intent_d16 = new Intent(getActivity(), con_degree_16.class);
                    intent_d16.putExtra("get_o", 0);
                    intent_d16.putExtra("count", 0);
                    startActivity(intent_d16);
                }else if(randomValue == 8){
                    Intent intent_d17 = new Intent(getActivity(), con_degree_17.class);
                    intent_d17.putExtra("get_o", 0);
                    intent_d17.putExtra("count", 0);
                    startActivity(intent_d17);
                }else if(randomValue == 9){
                    Intent intent_d18 = new Intent(getActivity(), con_degree_18.class);
                    intent_d18.putExtra("get_o", 0);
                    intent_d18.putExtra("count", 0);
                    startActivity(intent_d18);
                }else if(randomValue == 10){
                    Intent intent_d19 = new Intent(getActivity(), con_degree_19.class);
                    intent_d19.putExtra("get_o", 0);
                    intent_d19.putExtra("count", 0);
                    startActivity(intent_d19);
                }else if(randomValue == 11){
                    Intent intent_d110 = new Intent(getActivity(), con_degree_110.class);
                    intent_d110.putExtra("get_o", 0);
                    intent_d110.putExtra("count", 0);
                    startActivity(intent_d110);
                }else if(randomValue == 12){
                    Intent intent_d111 = new Intent(getActivity(), con_degree_111.class);
                    intent_d111.putExtra("get_o", 0);
                    intent_d111.putExtra("count", 0);
                    startActivity(intent_d111);
                }
            }
        });

        /*
        degree_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_d2 = new Intent(getActivity(), con_degree_2.class);
                intent_d2.putExtra("get_o", 0);
                intent_d2.putExtra("count", 0);
                startActivity(intent_d2);
            }
        });*/


        //중급 버튼
        degree_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent_d1 = new Intent(getActivity(), con_degree_2.class);
                //startActivity(intent_d1);
                if(randomValue2 == 1){
                    Intent intent_d2 = new Intent(getActivity(), con_degree_2.class);
                    intent_d2.putExtra("get_o", 0);
                    intent_d2.putExtra("count", 0);
                    startActivity(intent_d2);
                }else if(randomValue2 == 2){
                    Intent intent_d21 = new Intent(getActivity(), con_degree_21.class);
                    intent_d21.putExtra("get_o", 0);
                    intent_d21.putExtra("count", 0);
                    startActivity(intent_d21);
                }else if(randomValue2 == 3){
                    Intent intent_d22 = new Intent(getActivity(), con_degree_22.class);
                    intent_d22.putExtra("get_o", 0);
                    intent_d22.putExtra("count", 0);
                    startActivity(intent_d22);
                }else if(randomValue2 == 4){
                    Intent intent_d23 = new Intent(getActivity(), con_degree_23.class);
                    intent_d23.putExtra("get_o", 0);
                    intent_d23.putExtra("count", 0);
                    startActivity(intent_d23);
                }else if(randomValue2 == 5){
                    Intent intent_d24 = new Intent(getActivity(), con_degree_24.class);
                    intent_d24.putExtra("get_o", 0);
                    intent_d24.putExtra("count", 0);
                    startActivity(intent_d24);
                }else if(randomValue2 == 6){
                    Intent intent_d25 = new Intent(getActivity(), con_degree_25.class);
                    intent_d25.putExtra("get_o", 0);
                    intent_d25.putExtra("count", 0);
                    startActivity(intent_d25);
                }else if(randomValue2 == 7){
                    Intent intent_d26 = new Intent(getActivity(), con_degree_26.class);
                    intent_d26.putExtra("get_o", 0);
                    intent_d26.putExtra("count", 0);
                    startActivity(intent_d26);
                }else if(randomValue2 == 8){
                    Intent intent_d27 = new Intent(getActivity(), con_degree_27.class);
                    intent_d27.putExtra("get_o", 0);
                    intent_d27.putExtra("count", 0);
                    startActivity(intent_d27);
                }else if(randomValue2 == 9){
                    Intent intent_d28 = new Intent(getActivity(), con_degree_28.class);
                    intent_d28.putExtra("get_o", 0);
                    intent_d28.putExtra("count", 0);
                    startActivity(intent_d28);
                }else if(randomValue2 == 10){
                    Intent intent_d29 = new Intent(getActivity(), con_degree_29.class);
                    intent_d29.putExtra("get_o", 0);
                    intent_d29.putExtra("count", 0);
                    startActivity(intent_d29);
                }else if(randomValue2 == 11){
                    Intent intent_d210 = new Intent(getActivity(), con_degree_210.class);
                    intent_d210.putExtra("get_o", 0);
                    intent_d210.putExtra("count", 0);
                    startActivity(intent_d210);
                }else if(randomValue2 == 12){
                    Intent intent_d211 = new Intent(getActivity(), con_degree_211.class);
                    intent_d211.putExtra("get_o", 0);
                    intent_d211.putExtra("count", 0);
                    startActivity(intent_d211);
                }else if(randomValue2 == 13){
                    Intent intent_d212 = new Intent(getActivity(), con_degree_212.class);
                    intent_d212.putExtra("get_o", 0);
                    intent_d212.putExtra("count", 0);
                    startActivity(intent_d212);
                }else if(randomValue2 == 14){
                    Intent intent_d213 = new Intent(getActivity(), con_degree_213.class);
                    intent_d213.putExtra("get_o", 0);
                    intent_d213.putExtra("count", 0);
                    startActivity(intent_d213);
                }else if(randomValue2 == 15){
                    Intent intent_d214 = new Intent(getActivity(), con_degree_214.class);
                    intent_d214.putExtra("get_o", 0);
                    intent_d214.putExtra("count", 0);
                    startActivity(intent_d214);
                }else{
                    Intent intent_d215 = new Intent(getActivity(), con_degree_215.class);
                    intent_d215.putExtra("get_o", 0);
                    intent_d215.putExtra("count", 0);
                    startActivity(intent_d215);
                }
            }
        });



        //고급 버튼
        degree_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomValue3 == 1){
                    Intent intent_d3 = new Intent(getActivity(), con_degree_3.class);
                    intent_d3.putExtra("get_o", 0);
                    intent_d3.putExtra("count", 0);
                    startActivity(intent_d3);
                }else if(randomValue3 == 2){
                    Intent intent_d31 = new Intent(getActivity(), con_degree_31.class);
                    intent_d31.putExtra("get_o", 0);
                    intent_d31.putExtra("count", 0);
                    startActivity(intent_d31);
                }else if(randomValue3 == 3){
                    Intent intent_d32 = new Intent(getActivity(), con_degree_32.class);
                    intent_d32.putExtra("get_o", 0);
                    intent_d32.putExtra("count", 0);
                    startActivity(intent_d32);
                }else if(randomValue3 == 4){
                    Intent intent_d33 = new Intent(getActivity(), con_degree_33.class);
                    intent_d33.putExtra("get_o", 0);
                    intent_d33.putExtra("count", 0);
                    startActivity(intent_d33);
                }else if(randomValue3 == 5){
                    Intent intent_d34 = new Intent(getActivity(), con_degree_34.class);
                    intent_d34.putExtra("get_o", 0);
                    intent_d34.putExtra("count", 0);
                    startActivity(intent_d34);
                }else if(randomValue3 == 6){
                    Intent intent_d35 = new Intent(getActivity(), con_degree_35.class);
                    intent_d35.putExtra("get_o", 0);
                    intent_d35.putExtra("count", 0);
                    startActivity(intent_d35);
                }else if(randomValue3 == 7){
                    Intent intent_d36 = new Intent(getActivity(), con_degree_36.class);
                    intent_d36.putExtra("get_o", 0);
                    intent_d36.putExtra("count", 0);
                    startActivity(intent_d36);
                }else if(randomValue3 == 8){
                    Intent intent_d37 = new Intent(getActivity(), con_degree_37.class);
                    intent_d37.putExtra("get_o", 0);
                    intent_d37.putExtra("count", 0);
                    startActivity(intent_d37);
                }else if(randomValue3 == 9){
                    Intent intent_d38 = new Intent(getActivity(), con_degree_38.class);
                    intent_d38.putExtra("get_o", 0);
                    intent_d38.putExtra("count", 0);
                    startActivity(intent_d38);
                }else if(randomValue3 == 10){
                    Intent intent_d39 = new Intent(getActivity(), con_degree_39.class);
                    intent_d39.putExtra("get_o", 0);
                    intent_d39.putExtra("count", 0);
                    startActivity(intent_d39);
                }else if(randomValue3 == 11){
                    Intent intent_d310 = new Intent(getActivity(), con_degree_310.class);
                    intent_d310.putExtra("get_o", 0);
                    intent_d310.putExtra("count", 0);
                    startActivity(intent_d310);
                }else if(randomValue3 == 12){
                    Intent intent_d311 = new Intent(getActivity(), con_degree_311.class);
                    intent_d311.putExtra("get_o", 0);
                    intent_d311.putExtra("count", 0);
                    startActivity(intent_d311);
                }else if(randomValue3 == 13){
                    Intent intent_d312 = new Intent(getActivity(), con_degree_312.class);
                    intent_d312.putExtra("get_o", 0);
                    intent_d312.putExtra("count", 0);
                    startActivity(intent_d312);
                }else if(randomValue3 == 14){
                    Intent intent_d313 = new Intent(getActivity(), con_degree_313.class);
                    intent_d313.putExtra("get_o", 0);
                    intent_d313.putExtra("count", 0);
                    startActivity(intent_d313);
                }else if(randomValue3 == 15){
                    Intent intent_d314 = new Intent(getActivity(), con_degree_314.class);
                    intent_d314.putExtra("get_o", 0);
                    intent_d314.putExtra("count", 0);
                    startActivity(intent_d314);
                }else if(randomValue3 == 16){
                    Intent intent_d315 = new Intent(getActivity(), con_degree_315.class);
                    intent_d315.putExtra("get_o", 0);
                    intent_d315.putExtra("count", 0);
                    startActivity(intent_d315);
                }else if(randomValue3 == 17){
                    Intent intent_d316 = new Intent(getActivity(), con_degree_316.class);
                    intent_d316.putExtra("get_o", 0);
                    intent_d316.putExtra("count", 0);
                    startActivity(intent_d316);
                }else if(randomValue3 == 18){
                    Intent intent_d317 = new Intent(getActivity(), con_degree_317.class);
                    intent_d317.putExtra("get_o", 0);
                    intent_d317.putExtra("count", 0);
                    startActivity(intent_d317);
                }else if(randomValue3 == 19){
                    Intent intent_d318 = new Intent(getActivity(), con_degree_318.class);
                    intent_d318.putExtra("get_o", 0);
                    intent_d318.putExtra("count", 0);
                    startActivity(intent_d318);
                }else if(randomValue3 == 20){
                    Intent intent_d319 = new Intent(getActivity(), con_degree_319.class);
                    intent_d319.putExtra("get_o", 0);
                    intent_d319.putExtra("count", 0);
                    startActivity(intent_d319);
                }else if(randomValue3 == 21){
                    Intent intent_d320 = new Intent(getActivity(), con_degree_320.class);
                    intent_d320.putExtra("get_o", 0);
                    intent_d320.putExtra("count", 0);
                    startActivity(intent_d320);
                }else if(randomValue3 == 22){
                    Intent intent_d321 = new Intent(getActivity(), con_degree_321.class);
                    intent_d321.putExtra("get_o", 0);
                    intent_d321.putExtra("count", 0);
                    startActivity(intent_d321);
                }else if(randomValue3 == 23){
                    Intent intent_d322 = new Intent(getActivity(), con_degree_322.class);
                    intent_d322.putExtra("get_o", 0);
                    intent_d322.putExtra("count", 0);
                    startActivity(intent_d322);
                }else{
                    Intent intent_d323 = new Intent(getActivity(), con_degree_323.class);
                    intent_d323.putExtra("get_o", 0);
                    intent_d323.putExtra("count", 0);
                    startActivity(intent_d323);
                }
            }
        });



        
        

        
        
        //tips activity 버튼
        con_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_t = new Intent(getActivity(), con_tips.class);
                startActivity(intent_t);
            }
        });





        return viewGroup;
    }

}
