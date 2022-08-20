package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.airbnb.Activitys.Host.Fragment.HelpExperienceHostFragment;
import com.example.airbnb.Activitys.Host.Fragment.HelpGuestFragment;
import com.example.airbnb.Activitys.Host.Fragment.HelpHostFragment;
import com.example.airbnb.Activitys.Host.Fragment.HelpTravelFragment;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityHostHelpBinding;

public class HostHelpActivity extends AppCompatActivity {

    ActivityHostHelpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHostHelpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        clickListener();

    }

    public void clickListener(){

        getSupportFragmentManager().beginTransaction().replace(R.id.helpFrameLayout,new HelpGuestFragment()).commit();


        binding.guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.guestView.setVisibility(View.VISIBLE);
                binding.hostView.setVisibility(View.GONE);
                binding.experienceHost.setVisibility(View.GONE);
                binding.travelAdminView.setVisibility(View.GONE);

               getSupportFragmentManager().beginTransaction().replace(R.id.helpFrameLayout,new HelpGuestFragment()).commit();
            }
        });
        binding.host.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.guestView.setVisibility(View.GONE);
                binding.hostView.setVisibility(View.VISIBLE);
                binding.experienceHost.setVisibility(View.GONE);
                binding.travelAdminView.setVisibility(View.GONE);
                getSupportFragmentManager().beginTransaction().replace(R.id.helpFrameLayout,new HelpHostFragment()).commit();

            }
        });
        binding.experienceHost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.guestView.setVisibility(View.GONE);
                binding.hostView.setVisibility(View.GONE);
                binding.experienceHost.setVisibility(View.VISIBLE);
                binding.travelAdminView.setVisibility(View.GONE);

                getSupportFragmentManager().beginTransaction().replace(R.id.helpFrameLayout,new HelpExperienceHostFragment()).commit();

            }
        });
        binding.travelAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.guestView.setVisibility(View.GONE);
                binding.hostView.setVisibility(View.GONE);
                binding.experienceHost.setVisibility(View.GONE);
                binding.travelAdminView.setVisibility(View.VISIBLE);

                getSupportFragmentManager().beginTransaction().replace(R.id.helpFrameLayout,new HelpTravelFragment()).commit();
            }
        });

    }
}