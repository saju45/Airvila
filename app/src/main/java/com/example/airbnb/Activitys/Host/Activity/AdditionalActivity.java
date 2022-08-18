package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityAdditionalBinding;
import com.example.airbnb.databinding.ActivityListingDetailsBinding;

public class AdditionalActivity extends AppCompatActivity {


    ActivityAdditionalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAdditionalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        clickListener();


    }

    public void clickListener(){

        binding.cleaningFreeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        binding.petFeeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        binding.extraFeeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }
}