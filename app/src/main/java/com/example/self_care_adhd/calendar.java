package com.example.self_care_adhd;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

public class calendar extends Fragment{
    ViewGroup viewGroup;
    CalendarView plan_calendar;
    TextView plan_month;
    LinearLayout plan_check;

    String test_week;
    long day_week;
    Calendar calendar_for_week;
    Date date = null;
    int day_result;









    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        viewGroup = (ViewGroup) inflater.inflate(R.layout.calendar, container, false);

        //viewgroup에서 값 가져오기
        plan_month = viewGroup.findViewById(R.id.plan_month);
        plan_calendar = viewGroup.findViewById(R.id.plan_calendar);
        plan_check = viewGroup.findViewById(R.id.plan_check);
        plan_check.setClickable(true);

        Bundle bundle = getArguments();

        date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyymmdd");
        calendar_for_week = Calendar.getInstance();



        //월변환


        //plan_month.setText(formatter.format(date));


        //Calendar calendar = Calendar.getInstance();
        //day_week = calendar.get(Calendar.DAY_OF_WEEK);
        //day_week = calendar.get(Calendar.DAY_OF_WEEK);


        plan_calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String day;
                day = year+"년"+(month+1)+"월"+dayOfMonth+"일";
                plan_month.setText(day);


                test_week = year+""+String.format("%02d", (month+1))+String.format("%02d", dayOfMonth);
                System.out.println(test_week);
                try {
                    date = simpleDateFormat.parse(test_week);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                calendar_for_week.setTime(date);
                day_result = calendar_for_week.get(Calendar.DAY_OF_WEEK);
                System.out.println(day_result);



            }

        });











        /*
        String day_week_check = String.valueOf(day_week);

        DateFormat dateFormat = new SimpleDateFormat("yyyymmdd");
        try {
            Date date = dateFormat.parse(day_week_check);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(day_week);
        */


    /*
        plan_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), planner.class);
                startActivity(intent);
            }
        });
    */




        plan_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (day_result){
                    case 3:
                        System.out.println(day_result);
                        Intent intent = new Intent(getActivity(), planner.class);
                        startActivity(intent);
                        break;
                    case 4:
                        System.out.println(day_result);
                        Intent intent_mon = new Intent(getActivity(), planner_mon.class);
                        startActivity(intent_mon);
                        break;
                    case 5:
                        System.out.println(day_result);
                        Intent intent_tue = new Intent(getActivity(), planner_tue.class);
                        startActivity(intent_tue);
                        break;
                    case 6:
                        System.out.println(day_result);
                        Intent intent_wed = new Intent(getActivity(), planner_wed.class);
                        startActivity(intent_wed);
                        break;
                    case 7:
                        System.out.println(day_result);
                        Intent intent_thu = new Intent(getActivity(), planner_thu.class);
                        startActivity(intent_thu);
                        break;
                    case 1:
                        System.out.println(day_result);
                        Intent intent_fri = new Intent(getActivity(), planner_fri.class);
                        startActivity(intent_fri);
                        break;
                    case 2:
                        System.out.println(day_result);
                        Intent intent_sat = new Intent(getActivity(), planner_sat.class);
                        startActivity(intent_sat);
                        break;
                    default:
                        Intent intent_err = new Intent(getActivity(), MainActivity.class);
                        startActivity(intent_err);
                        break;
                }
            }
        });





        return viewGroup;
    }

}
/*
    public class calendar extends AppCompatActivity {
        CalendarView plan_calendar;
        TextView plan_month;
        LinearLayout plan_check;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.calendar);

            //시작한 후 Intent 받아오기
            Intent intent = getIntent();




            plan_month = (TextView)findViewById(R.id.plan_month);
            plan_calendar = findViewById(R.id.plan_calendar);

            plan_check = findViewById(R.id.plan_check);
            plan_check.setClickable(true);
            plan_check.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(calendar.this, planner.class);
                    startActivity(intent);
                }
            });

            //월변환
            //DateFormat formatter = new SimpleDateFormat("mm월");
            //Date date = new Date(plan_calendar.getDate());
            //plan_month.setText(formatter.format(date));
            plan_calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
                @Override
                public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                    String day;
                    day = (month+1)+"월"+dayOfMonth+"일";
                    plan_month.setText(day);
                }
            });




         }

}
*/