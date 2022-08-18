package com.example.airbnb.Activitys.Host.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Host.Activity.CreateNewListingActivity;
import com.example.airbnb.Activitys.Host.Activity.ListingsActivity;
import com.example.airbnb.Activitys.Host.Activity.WelcomeActivity;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentMenuBinding;


public class MenuFragment extends Fragment {

    FragmentMenuBinding binding;
    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentMenuBinding.inflate(inflater, container, false);


        clickListener();

        return binding.getRoot();
    }


    public void clickListener(){

        binding.cardListing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ListingsActivity.class));
            }
        });

        binding.listingLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), WelcomeActivity.class));
            }
        });

    }
}