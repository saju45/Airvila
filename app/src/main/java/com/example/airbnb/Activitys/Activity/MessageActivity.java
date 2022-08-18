package com.example.airbnb.Activitys.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityMessageBinding;

public class MessageActivity extends AppCompatActivity {

    ActivityMessageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        clickListener();

    }

    public void clickListener(){


        binding.inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.inbox.setVisibility(View.GONE);
                binding.galleryImg.setVisibility(View.GONE);
                binding.chat.setVisibility(View.GONE);
                binding.view4.setVisibility(View.GONE);
                binding.messageEt.setVisibility(View.VISIBLE);
                binding.view3.setVisibility(View.VISIBLE);
            }
        });

    }
}