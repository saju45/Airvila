package com.example.airbnb.Activitys.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.airbnb.Activitys.Fragments.AccountFragment;
import com.example.airbnb.Activitys.Fragments.Mainragment;
import com.example.airbnb.Activitys.Fragments.OfferAndUpdateFragment;
import com.example.airbnb.Activitys.Fragments.ProfileFragment;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityNotificationBinding;

public class NotificationActivity extends AppCompatActivity {

    ActivityNotificationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityNotificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        clickListener();

    }

    public void clickListener(){


        getSupportFragmentManager().beginTransaction().replace(R.id.ntfFrameLayout,new OfferAndUpdateFragment()).commit();



        binding.offerAndUpdates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.ntfFrameLayout,new OfferAndUpdateFragment()).commit();
                binding.offerView.setVisibility(View.VISIBLE);
                binding.accountView.setVisibility(View.GONE);

            }
        });

        binding.accountText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.ntfFrameLayout,new AccountFragment()).commit();
                binding.accountView.setVisibility(View.VISIBLE);
                binding.offerView.setVisibility(View.GONE);

            }
        });


        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });


    }
}