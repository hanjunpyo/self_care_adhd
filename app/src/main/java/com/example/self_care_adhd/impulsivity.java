package com.example.self_care_adhd;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class impulsivity extends Fragment{
    ViewGroup viewGroup;
    LinearLayout imp_program, meditation, imp_tips;
    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState){
        viewGroup = (ViewGroup) inflater.inflate(R.layout.implusivity, container, false);

        //버튼 설정 및 클릭활성화
        imp_program = viewGroup.findViewById(R.id.imp_program);
        meditation = viewGroup.findViewById(R.id.meditation);
        imp_tips = viewGroup.findViewById(R.id.imp_tips);
        imp_program.setClickable(true);
        meditation.setClickable(true);
        imp_tips.setClickable(true);

        //충동성 억제 프로그램 onclick
        imp_program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_game = new Intent(getActivity(), imp_game1.class);
                startActivity(intent_game);
            }
        });

        //명상 onclick
        meditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_medi = new Intent(getActivity(), meditation.class);
                startActivity(intent_medi);
            }
        });


        //충동성 억제 팁 onclick
        imp_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_tips = new Intent(getActivity(), imp_tips.class);
                startActivity(intent_tips);
            }
        });

        return viewGroup;
    }
}