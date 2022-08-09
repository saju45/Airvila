package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityHouseBinding;

public class HouseActivity extends AppCompatActivity {

    ActivityHouseBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHouseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent=getIntent();

        int value=intent.getIntExtra("name",1);

        if (intent!=null)
        {
            if (value==1)
            {

                binding.headerText.setText("Directions");
                binding.editText.setHint("Share directions to your place, and public transportation parking tips,");

            }
        }

    }
}