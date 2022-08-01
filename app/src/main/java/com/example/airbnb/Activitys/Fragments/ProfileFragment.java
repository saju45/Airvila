package com.example.airbnb.Activitys.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Activity.EditPersonalInfoActivity;
import com.example.airbnb.Activitys.Activity.NotificationActivity;
import com.example.airbnb.Activitys.Activity.PrivacyActivity;
import com.example.airbnb.Activitys.Activity.TranslationActivity;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {


    FragmentProfileBinding binding;

    public ProfileFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentProfileBinding.inflate(inflater, container, false);


        clickListener();



        return binding.getRoot();
    }


    public void clickListener(){

        binding.cardPersonalInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), EditPersonalInfoActivity.class));
            }
        });

        binding.cardTranslation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), TranslationActivity.class));
            }
        });

        binding.cardNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), NotificationActivity.class));
            }
        });

        binding.cardPrivacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), PrivacyActivity.class));
            }
        });


    }
}