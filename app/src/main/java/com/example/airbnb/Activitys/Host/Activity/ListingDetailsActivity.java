package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.airbnb.Activitys.Host.Fragment.BookingFragment;
import com.example.airbnb.Activitys.Host.Fragment.HowManyGuestFragment;
import com.example.airbnb.Activitys.Host.Fragment.ListingDetailsFragment;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityListingDetailsBinding;

public class ListingDetailsActivity extends AppCompatActivity {

    ActivityListingDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityListingDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        clickListener();

        getSupportFragmentManager().beginTransaction().replace(R.id.listingFrameLayout,new ListingDetailsFragment()).commit();


    }

    public void clickListener(){

        binding.listingText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             //   getSupportFragmentManager().beginTransaction().replace(R.id.welcomeFrameLayout,new HowManyGuestFragment()).commit();
                getSupportFragmentManager().beginTransaction().replace(R.id.listingFrameLayout,new ListingDetailsFragment()).commit();
                binding.listingView.setVisibility(View.VISIBLE);
                binding.bookingView.setVisibility(View.GONE);

            }
        });

        binding.bookingText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.listingFrameLayout,new BookingFragment()).commit();
                binding.listingView.setVisibility(View.GONE);
                binding.bookingView.setVisibility(View.VISIBLE);


            }
        });
    }
}