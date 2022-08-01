package com.example.airbnb.Activitys.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.DatePicker;

import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityEditPersonalInfoBinding;

import java.util.Calendar;

public class EditPersonalInfoActivity extends AppCompatActivity {

    ActivityEditPersonalInfoBinding binding;
    DatePickerDialog.OnDateSetListener setListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityEditPersonalInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Calendar calendar=Calendar.getInstance();
        final  int year=calendar.get(Calendar.YEAR);
        final  int month=calendar.get(Calendar.MONTH);
        final  int day=calendar.get(Calendar.DAY_OF_MONTH);

        binding.birthLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog datePickerDialog=new DatePickerDialog(

                        EditPersonalInfoActivity.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth
                        ,setListener,year,month,day);

                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                datePickerDialog.show();
            }
        });

        setListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                month=month+1;
                String date=day+"/"+month+"/"+year;
                binding.birthDateEt.setText(date);
            }
        };
    }
}