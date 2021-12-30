package com.example.self_care_adhd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


public class start_activity extends AppCompatActivity {
    LinearLayout start_app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        //시작버튼
        start_app = findViewById(R.id.start_app);
        start_app.setClickable(true);

        //onClick
        start_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(start_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
