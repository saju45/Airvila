package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityHouseBinding;

public class HouseRulesActivity extends AppCompatActivity {


    ActivityHouseBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHouseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        clickListener();

    }

    public void clickListener(){

    }
}