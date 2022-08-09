package com.example.airbnb.Activitys.Host.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Host.Activity.AboutPricingActivity;
import com.example.airbnb.Activitys.Host.Activity.AdditionalActivity;
import com.example.airbnb.Activitys.Host.Activity.AvailablilitySettingActivity;
import com.example.airbnb.Activitys.Host.Activity.CancellationPolicyActivity;
import com.example.airbnb.Activitys.Host.Activity.CheckInSettingActivity;
import com.example.airbnb.Activitys.Host.Activity.CurrencyActivity;
import com.example.airbnb.Activitys.Host.Activity.GuestBookActivity;
import com.example.airbnb.Activitys.Host.Activity.GuestRequrmentsActivity;
import com.example.airbnb.Activitys.Host.Activity.HelpfulRulesCalendarActivity;
import com.example.airbnb.Activitys.Host.Activity.HouseRulesActivity;
import com.example.airbnb.Activitys.Host.Activity.LengthActivity;
import com.example.airbnb.Activitys.Host.Activity.LinkAirbnbCalendarActivity;
import com.example.airbnb.Activitys.Host.Activity.PrevieWhatGuestActivity;
import com.example.airbnb.Activitys.Host.Activity.TripLengthActivity;
import com.example.airbnb.Activitys.Host.Activity.WhoCanBookActivity;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentBookingBinding;


public class BookingFragment extends Fragment {


    FragmentBookingBinding binding;
    public BookingFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentBookingBinding.inflate(inflater, container, false);


        clickListener();

        return binding.getRoot();
    }

    public void clickListener(){

        binding.bedLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), PrevieWhatGuestActivity.class));
            }
        });

        binding.nightlyLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   startActivity(new Intent(getContext(),NightlYPriceActivity.class));
            }
        });

        binding.currencyLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), CurrencyActivity.class));
            }
        });

        binding.additionalLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), AdditionalActivity.class));
            }
        });

        binding.lengthLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), LengthActivity.class));
            }
        });

        binding.learMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), AboutPricingActivity.class));
            }
        });


        binding.bookLyout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), GuestBookActivity.class));
            }
        });

        binding.cardLearMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), WhoCanBookActivity.class));
            }
        });

        binding.guestRequirementsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), GuestRequrmentsActivity.class));

            }
        });

        binding.homeRulesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), HouseRulesActivity.class));
            }
        });


        binding.policyLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), CancellationPolicyActivity.class));
            }
        });

        binding.availabilitySettingLyout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), AvailablilitySettingActivity.class));
            }
        });

        binding.calendarLearnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), HelpfulRulesCalendarActivity.class));
            }
        });

        binding.tripLengthLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), TripLengthActivity.class));
            }
        });

        binding.checkInCheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), CheckInSettingActivity.class));
            }
        });

        binding.linkAirbnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), LinkAirbnbCalendarActivity.class));
            }
        });
    }
}