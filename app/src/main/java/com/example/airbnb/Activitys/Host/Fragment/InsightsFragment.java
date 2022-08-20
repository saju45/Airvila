package com.example.airbnb.Activitys.Host.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentInsightsBinding;


public class InsightsFragment extends Fragment {


    FragmentInsightsBinding binding;
    public InsightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentInsightsBinding.inflate(inflater, container, false);
        clickListener();
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.insightsFrameLayout,new OrrortunitiesFragment()).commit();

        return binding.getRoot();

    }

    public void clickListener(){


        binding.opportunitiesText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.opportunitiesView.setVisibility(View.VISIBLE);
                binding.statsView.setVisibility(View.GONE);
                binding.cleanigView.setVisibility(View.GONE);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.insightsFrameLayout,new OrrortunitiesFragment()).commit();


            }
        });
        binding.statsText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.statsView.setVisibility(View.VISIBLE);
                binding.opportunitiesView.setVisibility(View.GONE);
                binding.cleanigView.setVisibility(View.GONE);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.insightsFrameLayout,new StatsFragment()).commit();

            }
        });

        binding.cleaningText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.cleanigView.setVisibility(View.VISIBLE);
                binding.opportunitiesView.setVisibility(View.GONE);
                binding.statsView.setVisibility(View.GONE);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.insightsFrameLayout,new CleaningFragment()).commit();

            }
        });

    }
}