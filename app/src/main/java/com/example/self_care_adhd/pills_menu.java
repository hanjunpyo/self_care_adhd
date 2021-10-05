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


public class pills_menu extends Fragment{
    ViewGroup viewGroup;
    LinearLayout penid, metadate, conserta, medikinet;

    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState){
        viewGroup = (ViewGroup) inflater.inflate(R.layout.pills_menu, container, false);

        //버튼 초기화
        penid = viewGroup.findViewById(R.id.penid);
        metadate = viewGroup.findViewById(R.id.metadate);
        conserta = viewGroup.findViewById(R.id.conserta);
        medikinet = viewGroup.findViewById(R.id.medikinet);
        penid.setClickable(true);
        metadate.setClickable(true);
        conserta.setClickable(true);
        medikinet.setClickable(true);

        //각 약 메뉴 이동
        penid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_penid = new Intent(getActivity(), penid.class);
                startActivity(intent_penid);
            }
        });
        metadate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_metadate = new Intent(getActivity(), metadate.class);
                startActivity(intent_metadate);
            }
        });
        medikinet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_medikinet = new Intent(getActivity(), medikinet.class);
                startActivity(intent_medikinet);
            }
        });
        conserta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_conserta = new Intent(getActivity(), conserta.class);
                startActivity(intent_conserta);
            }
        });


        return viewGroup;
    }
}