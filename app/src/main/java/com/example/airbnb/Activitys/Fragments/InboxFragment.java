package com.example.airbnb.Activitys.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Host.Adapter.AllMessageAdapter;
import com.example.airbnb.Activitys.Host.Model.AllMessageModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentInboxBinding;

import java.util.ArrayList;


public class InboxFragment extends Fragment {


    FragmentInboxBinding binding;


    public InboxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentInboxBinding.inflate(inflater, container, false);




        return binding.getRoot();
    }


}