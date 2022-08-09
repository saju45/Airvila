package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityWifiBinding;

public class WifiActivity extends AppCompatActivity {

    ActivityWifiBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityWifiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }
}