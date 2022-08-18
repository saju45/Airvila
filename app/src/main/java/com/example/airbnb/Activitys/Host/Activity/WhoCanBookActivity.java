package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityWhoCanBookBinding;

public class WhoCanBookActivity extends AppCompatActivity {

    ActivityWhoCanBookBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityWhoCanBookBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        clickListener();
    }

    public void clickListener(){

        binding.houseRulesText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WhoCanBookActivity.this,HouseRulesActivity.class));
            }
        });

        binding.guestRequirements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WhoCanBookActivity.this,GuestRequrmentsActivity.class));
            }
        });
    }
}