package com.example.airbnb.Activitys.Host.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Host.Adapter.AreaAdapter;
import com.example.airbnb.Activitys.Host.Adapter.HostingAdapter;
import com.example.airbnb.Activitys.Host.Adapter.NearAdaptAdapter;
import com.example.airbnb.Activitys.Host.Model.AreaModel;
import com.example.airbnb.Activitys.Host.Model.HostingModel;
import com.example.airbnb.Activitys.Host.Model.NearAdaptModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentOrrortunitiesBinding;

import java.util.ArrayList;


public class OrrortunitiesFragment extends Fragment {

    FragmentOrrortunitiesBinding binding;
    ArrayList<NearAdaptModel> list;
    ArrayList<AreaModel> list2;
    ArrayList<HostingModel> list3;
    public OrrortunitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentOrrortunitiesBinding.inflate(inflater, container, false);

        list=new ArrayList<>();
        list2=new ArrayList<>();
        list3=new ArrayList<>();
        addData();


        NearAdaptAdapter adapter=new NearAdaptAdapter(getContext(),list);
        AreaAdapter areaAdapter=new AreaAdapter(getContext(),list2);
        HostingAdapter hostingAdapter=new HostingAdapter(getContext(),list3);


        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),2);
        //layoutManager.setOrientation();
        binding.nearRv.setLayoutManager(layoutManager);
        binding.nearRv.setHasFixedSize(true);
        binding.nearRv.setAdapter(adapter);


        LinearLayoutManager layoutManager1=new LinearLayoutManager(getContext());
        layoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        binding.areaRv.setLayoutManager(layoutManager1);
        binding.areaRv.setHasFixedSize(true);
        binding.areaRv.setAdapter(areaAdapter);


        LinearLayoutManager layoutManager2=new LinearLayoutManager(getContext());
        layoutManager2.setOrientation(LinearLayoutManager.VERTICAL);
        binding.hostingRv.setLayoutManager(layoutManager2);
        binding.hostingRv.setHasFixedSize(true);
        binding.hostingRv.setAdapter(hostingAdapter);

        return binding.getRoot();
    }

    public void addData(){


        list.add(new NearAdaptModel(R.drawable.heart,"Popular","amenities",4,7));
        list.add(new NearAdaptModel(R.drawable.notes,"Flexible","Stays",2,5));
        list.add(new NearAdaptModel(R.drawable.car_crash,"Family","travel",3,4));
        list.add(new NearAdaptModel(R.drawable.lake_1,"Remote ","workspaces",3,6));
        list.add(new NearAdaptModel(R.drawable.island,"Longer","Stays",4,5));
        list.add(new NearAdaptModel(R.drawable.heart,"Advance","booking",4,5));


        list2.add(new AreaModel("Searches for stays in your area have increased 289% compared to this time last year."));
        list2.add(new AreaModel("26% of travelers to your area come from less than 300 miles away."));
        list2.add(new AreaModel("Most wanted amenities: child-friendly, wireless internet, and ac."));
        list2.add(new AreaModel("28% of trips to your area are booked less than a week before check-in. "));
        list2.add(new AreaModel("The average length of trips to your area is 8 nights."));


        list3.add(new HostingModel(R.drawable.photo1,"Why it's smart to offer","flexible cancellations right"));
        list3.add(new HostingModel(R.drawable.photo1,"Getting started with","Airbnb's cleaning protocol"));
        list3.add(new HostingModel(R.drawable.photo1,"The do's and don'ts  of","providing self check-in"));

    }
}