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
    int randomValue=0;

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
        randomValue = random.nextInt(12);


        //초급 activity 버튼
        degree_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_d1 = new Intent(getActivity(), con_degree_1.class);
                startActivity(intent_d1);
            }
        });

        /*
        degree_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent_d_1 = new Intent(getActivity(), con_degree_1.class);
                //startActivity(intent_d_1);
                System.out.println(randomValue);
                switch(randomValue){
                    case 1:
                        Intent intent_d_11 = new Intent(getActivity(), con_degree_1.class);
                        startActivity(intent_d_11);
                        break;
                    case 2:
                        Intent intent_d_12 = new Intent(getActivity(), con_degree_1.class);
                        startActivity(intent_d_12);
                        break;
                    case 3:
                        Intent intent_d_13 = new Intent(getActivity(), con_degree_1.class);
                        startActivity(intent_d_13);
                        break;
                    case 4:
                        Intent intent_d_14 = new Intent(getActivity(), con_degree_1.class);
                        startActivity(intent_d_14);
                        break;
                    case 5:
                        Intent intent_d_15 = new Intent(getActivity(), con_degree_1.class);
                        startActivity(intent_d_15);
                        break;
                    case 6:
                        Intent intent_d_16 = new Intent(getActivity(), con_degree_1.class);
                        startActivity(intent_d_16);
                        break;
                    case 7:
                        Intent intent_d_17 = new Intent(getActivity(), con_degree_1.class);
                        startActivity(intent_d_17);
                        break;
                    case 8:
                        Intent intent_d_18 = new Intent(getActivity(), con_degree_1.class);
                        startActivity(intent_d_18);
                        break;
                    case 9:
                        Intent intent_d_19 = new Intent(getActivity(), con_degree_1.class);
                        startActivity(intent_d_19);
                        break;
                    case 10:
                        Intent intent_d_110 = new Intent(getActivity(), con_degree_1.class);
                        startActivity(intent_d_110);
                        break;
                    case 11:
                        Intent intent_d_111 = new Intent(getActivity(), con_degree_1.class);
                        startActivity(intent_d_111);
                        break;
                    case 12:
                        Intent intent_d_112 = new Intent(getActivity(), con_degree_1.class);
                        startActivity(intent_d_112);
                        break;
                    default:
                        Intent intent_d_113 = new Intent(getActivity(), con_degree_1.class);
                        startActivity(intent_d_113);
                        break;
                }
            }
        });

         */

        
        

        
        
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
