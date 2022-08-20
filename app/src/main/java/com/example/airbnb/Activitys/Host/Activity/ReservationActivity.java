package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.airbnb.Activitys.Host.Fragment.ReservationAllFragment;
import com.example.airbnb.Activitys.Host.Fragment.ReservationOngoingFragment;
import com.example.airbnb.Activitys.Host.Fragment.ReservationPendingFragment;
import com.example.airbnb.Activitys.Host.Fragment.ReservationPendingReviewFragment;
import com.example.airbnb.Activitys.Host.Fragment.ReservationUpcomingFragment;
import com.example.airbnb.Activitys.Host.Fragment.TodayFragment;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityReservationBinding;

public class ReservationActivity extends AppCompatActivity {

    ActivityReservationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityReservationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        clickListener();
        getSupportFragmentManager().beginTransaction().replace(R.id.reservationFrameLayout,new ReservationAllFragment()).commit();



    }

    public void clickListener(){

        binding.all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.reservationFrameLayout,new ReservationAllFragment()).commit();

            }
        });
        binding.pending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.reservationFrameLayout,new ReservationPendingFragment()).commit();

            }
        });
        binding.upcoming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.reservationFrameLayout,new ReservationUpcomingFragment()).commit();

            }
        });

        binding.ongoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.reservationFrameLayout,new ReservationOngoingFragment()).commit();

            }
        });
        binding.pendingReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.reservationFrameLayout,new ReservationPendingReviewFragment()).commit();

            }
        });

    }
}