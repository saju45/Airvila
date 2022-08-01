package com.example.airbnb.Activitys.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentOfferAndUpdateBinding;


public class OfferAndUpdateFragment extends Fragment {

    FragmentOfferAndUpdateBinding binding;

    public OfferAndUpdateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentOfferAndUpdateBinding.inflate(inflater, container, false);


        clickListener();

        return binding.getRoot();
    }

    public void clickListener(){



        binding.offerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BottomSheetFragment bottomSheetFragment=new BottomSheetFragment();
                bottomSheetFragment.show(getFragmentManager(),bottomSheetFragment.getTag());
            }
        });

        binding.tripLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                BottomSheetFragment bottomSheetFragment=new BottomSheetFragment();
                bottomSheetFragment.show(getFragmentManager(),bottomSheetFragment.getTag());
            }
        });


        binding.newsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BottomSheetFragment bottomSheetFragment=new BottomSheetFragment();
                bottomSheetFragment.show(getFragmentManager(),bottomSheetFragment.getTag());
            }
        });


        binding.feedbackLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BottomSheetFragment bottomSheetFragment=new BottomSheetFragment();
                bottomSheetFragment.show(getFragmentManager(),bottomSheetFragment.getTag());
            }
        });


        binding.travelLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BottomSheetFragment bottomSheetFragment=new BottomSheetFragment();
                bottomSheetFragment.show(getFragmentManager(),bottomSheetFragment.getTag());

            }
        });

    }
}