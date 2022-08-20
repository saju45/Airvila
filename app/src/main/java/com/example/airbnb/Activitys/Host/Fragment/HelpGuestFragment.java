package com.example.airbnb.Activitys.Host.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Host.Adapter.HostingUpdateAdapter;
import com.example.airbnb.Activitys.Host.Adapter.SettingAdapter;
import com.example.airbnb.Activitys.Host.Model.HostingUpdatesModel;
import com.example.airbnb.Activitys.Host.Model.SettingModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentHelpGuestBinding;

import java.util.ArrayList;


public class HelpGuestFragment extends Fragment {

    FragmentHelpGuestBinding binding;
    ArrayList<SettingModel> list;
    ArrayList<HostingUpdatesModel> list1;
    public HelpGuestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentHelpGuestBinding.inflate(inflater, container, false);


        list=new ArrayList<>();
        list1=new ArrayList<>();
        addData();

        SettingAdapter adapter=new SettingAdapter(getContext(),list);
        HostingUpdateAdapter adapter1=new HostingUpdateAdapter(getContext(),list1);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.guestRv.setLayoutManager(layoutManager);
        binding.guestRv.setHasFixedSize(true);
        binding.guestRv.setAdapter(adapter);


        LinearLayoutManager layoutManager1=new LinearLayoutManager(getContext());
        layoutManager1.setOrientation(LinearLayoutManager.VERTICAL);
        binding.guestExploreRv.setLayoutManager(layoutManager1);
        binding.guestExploreRv.setHasFixedSize(true);
        binding.guestExploreRv.setAdapter(adapter1);

        return binding.getRoot();
    }
    public void addData(){


        list.add(new SettingModel(R.drawable.work_space,"Getting started on Airbnb"));
        list.add(new SettingModel(R.drawable.search,"Finding a stay that's right for you"));
        list.add(new SettingModel(R.drawable.card32,"Paying for your trip"));
        list.add(new SettingModel(R.drawable.home_2,"Getting protected through AirCover"));
        list.add(new SettingModel(0,"Browse all topics"));


        list1.add(new HostingUpdatesModel(R.drawable.bed2,"oUr community \npolicies\nhow we build a foundation"));
        list1.add(new HostingUpdatesModel(R.drawable.bed2,"Safety trips and \nguidelines\n Resources to help travel.."));

    }
}