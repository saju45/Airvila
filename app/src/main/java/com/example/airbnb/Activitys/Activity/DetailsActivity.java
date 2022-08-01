package com.example.airbnb.Activitys.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;

import android.os.Bundle;
import android.view.View;

import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityDetailsBinding;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

public class DetailsActivity extends AppCompatActivity {

    ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        MaterialDatePicker materialDatePicker=MaterialDatePicker.Builder.dateRangePicker().setSelection(Pair.create(MaterialDatePicker.thisMonthInUtcMilliseconds(),MaterialDatePicker.todayInUtcMilliseconds())).build();


        binding.cardAvailbility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                materialDatePicker.show(getSupportFragmentManager(),"Tag Picker");
                materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        binding.availabilityDate.setText(materialDatePicker.getHeaderText());
                    }
                });

            }
        });

    }
}