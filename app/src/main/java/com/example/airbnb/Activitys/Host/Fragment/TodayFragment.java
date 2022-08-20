package com.example.airbnb.Activitys.Host.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Host.Adapter.HostingUpdateAdapter;
import com.example.airbnb.Activitys.Host.Adapter.NextStepAdapter;
import com.example.airbnb.Activitys.Host.Adapter.ReservationAdapter;
import com.example.airbnb.Activitys.Host.Model.HostingUpdatesModel;
import com.example.airbnb.Activitys.Host.Model.NextStepModel;
import com.example.airbnb.Activitys.Host.Model.ReservationModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentTodayBinding;

import java.util.ArrayList;


public class TodayFragment extends Fragment {

    FragmentTodayBinding binding;
    ArrayList<ReservationModel> list;
    ArrayList<NextStepModel> nextStepModelArrayList;
    ArrayList<HostingUpdatesModel> list2;
    public TodayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentTodayBinding.inflate(inflater, container, false);


        list=new ArrayList<>();
        nextStepModelArrayList=new ArrayList<>();
        list2=new ArrayList<>();
        reservationItem();

        clickListener();

        ReservationAdapter adapter=new ReservationAdapter(getContext(),list);
        NextStepAdapter adapter1=new NextStepAdapter(getContext(),nextStepModelArrayList);
        HostingUpdateAdapter adapter2=new HostingUpdateAdapter(getContext(),list2);



        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.reservationRv.setLayoutManager(layoutManager);
        binding.reservationRv.setHasFixedSize(true);
        binding.reservationRv.setAdapter(adapter);



        LinearLayoutManager layoutManager1=new LinearLayoutManager(getContext());
        layoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        binding.nextStepRv.setLayoutManager(layoutManager1);
        binding.nextStepRv.setHasFixedSize(true);
        binding.nextStepRv.setAdapter(adapter1);

        LinearLayoutManager layoutManager2=new LinearLayoutManager(getContext());
        layoutManager2.setOrientation(LinearLayoutManager.VERTICAL);
        binding.hostingUpdateRv.setLayoutManager(layoutManager2);
        binding.hostingUpdateRv.setHasFixedSize(true);
        binding.hostingUpdateRv.setAdapter(adapter2);

        return binding.getRoot();
    }

    public void clickListener(){

        binding.reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void reservationItem(){


        list.add(new ReservationModel(10, R.drawable.photo,"Elegant Ac stay at Bashundhara","Saju","Aug23-23"));
        list.add(new ReservationModel(48, R.drawable.photo1,"Elegant Ac stay at Bashundhara","Mohammad","Aug23-23"));
        list.add(new ReservationModel(5, R.drawable.photo,"Elegant Ac stay at Bashundhara","sohrab","Aug23-23"));


        nextStepModelArrayList.add(new NextStepModel(R.drawable.wifi,"Luxury,comfort and royal Ac stay","Let guests know how fast your wifi is","Test your wifi speed and we'll\nshare it with guests."));
        nextStepModelArrayList.add(new NextStepModel(R.drawable.fire_pit,"Luxury ,comfort and royal Ac stay","Do you have a dedicated\n workspace?","This means that guest have a desk or table that's used just for working, along with a comfortable chair."));
        nextStepModelArrayList.add(new NextStepModel(R.drawable.hair_dryer,"Luxury,comfort and royal Ac stay","Do you have a dryer?",""));
        nextStepModelArrayList.add(new NextStepModel(R.drawable.washer,"Luxury,comfort and royal Ac stay","Do you have a washer",""));


        list2.add(new HostingUpdatesModel(R.drawable.photo1,"How to get pad for \nhosting"));
        list2.add(new HostingUpdatesModel(R.drawable.photo,"Improved protections\nfor Hosts and guests"));
        list2.add(new HostingUpdatesModel(R.drawable.photo1,"Inclusive hosting tips \nfor giving every guest\na 5-start stay"));


    }

}