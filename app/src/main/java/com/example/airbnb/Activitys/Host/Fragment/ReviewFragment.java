package com.example.airbnb.Activitys.Host.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentReviewBinding;


public class ReviewFragment extends Fragment {

    FragmentReviewBinding binding;
    public ReviewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentReviewBinding.inflate(inflater,container, false);


        return binding.getRoot();
    }
}