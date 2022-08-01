package com.example.airbnb.Activitys.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Adapter.ChooseMonthAdapter;
import com.example.airbnb.Activitys.Models.ChooseMonthModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentImFlexibleBinding;

import java.util.ArrayList;


public class ImFlexibleFragment extends Fragment {


    FragmentImFlexibleBinding binding;
    ArrayList<ChooseMonthModel> list;

    public ImFlexibleFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentImFlexibleBinding.inflate(inflater, container, false);

        list=new ArrayList<>();
        addData();
        ChooseMonthAdapter adapter=new ChooseMonthAdapter(getContext(),list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        binding.recylceView.setLayoutManager(layoutManager);
        binding.recylceView.setHasFixedSize(true);
        binding.recylceView.setAdapter(adapter);


        return binding.getRoot();
    }


    public void addData(){

        list.add(new ChooseMonthModel("Septepbar","2020"));
        list.add(new ChooseMonthModel("January","2021"));
        list.add(new ChooseMonthModel("July","2023"));
        list.add(new ChooseMonthModel("Augest","2020"));
        list.add(new ChooseMonthModel("Jun","2202"));
        list.add(new ChooseMonthModel("March","2022"));
        list.add(new ChooseMonthModel("December","2025"));
        list.add(new ChooseMonthModel("february","2020"));
        list.add(new ChooseMonthModel("Septepbar","2020"));
        list.add(new ChooseMonthModel("January","2021"));
        list.add(new ChooseMonthModel("July","2023"));
        list.add(new ChooseMonthModel("Augest","2020"));
        list.add(new ChooseMonthModel("Jun","2202"));
        list.add(new ChooseMonthModel("March","2022"));
        list.add(new ChooseMonthModel("December","2025"));
        list.add(new ChooseMonthModel("february","2020"));
    }
}