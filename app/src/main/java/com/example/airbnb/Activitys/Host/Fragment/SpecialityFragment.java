package com.example.airbnb.Activitys.Host.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Adapter.SpecialityItemAdapter;
import com.example.airbnb.Activitys.Models.SpecialityItemModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentSpecialityBinding;

import java.util.ArrayList;


public class SpecialityFragment extends Fragment {


    FragmentSpecialityBinding binding;
    ArrayList<SpecialityItemModel> list;

    public SpecialityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentSpecialityBinding.inflate(inflater,container, false);


        list=new ArrayList<>();

        SpecialityItemAdapter adapter=new SpecialityItemAdapter(getContext(),list);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.specialityRv.setLayoutManager(layoutManager);
        binding.specialityRv.setHasFixedSize(true);
        binding.specialityRv.setAdapter(adapter);



        return binding.getRoot();
    }

    public void addItem(){

        list.add(new SpecialityItemModel("Calm"));
        list.add(new SpecialityItemModel("Good for Family"));
        list.add(new SpecialityItemModel("Stylish"));
        list.add(new SpecialityItemModel("Central Area"));
        list.add(new SpecialityItemModel("Spacious"));
        list.add(new SpecialityItemModel("View "));
        list.add(new SpecialityItemModel("Natural Beauty"));
        list.add(new SpecialityItemModel("Open Area"));
        list.add(new SpecialityItemModel("Beach View"));
        list.add(new SpecialityItemModel("Lake View"));
        list.add(new SpecialityItemModel("Hill View"));



    }
}