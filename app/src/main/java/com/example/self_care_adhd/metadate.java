package com.example.self_care_adhd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class metadate extends AppCompatActivity {
    LinearLayout back_key;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metadate);
        Intent intent = getIntent();

        //뒤로가기 버튼
        back_key = findViewById(R.id.back_key);
        back_key.setClickable(true);
        back_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}