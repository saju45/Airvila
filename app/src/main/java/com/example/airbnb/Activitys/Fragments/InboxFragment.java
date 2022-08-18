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
    ArrayList<AllMessageModel> list;

    public InboxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentInboxBinding.inflate(inflater, container, false);

        clickListener();
        list=new ArrayList<>();

        AllMessageAdapter adapter=new AllMessageAdapter(getContext(),list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.allMessageRv.setLayoutManager(layoutManager);
        binding.allMessageRv.setHasFixedSize(true);
        binding.allMessageRv.setAdapter(adapter);


        return binding.getRoot();
    }

    public void clickListener(){

        binding.searchImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.searchImg.setVisibility(View.GONE);
                binding.menu.setVisibility(View.GONE);
                binding.title.setVisibility(View.GONE);
                binding.editLayout.setVisibility(View.VISIBLE);
            }
        });

        binding.leftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editLayout.setVisibility(View.GONE);
                binding.searchImg.setVisibility(View.VISIBLE);
                binding.title.setVisibility(View.VISIBLE);
                binding.menu.setVisibility(View.VISIBLE);
            }
        });


        binding.editLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.editLayout.setVisibility(View.GONE);
            }
        });
    }

    public void addItem(){

        list.add(new AllMessageModel(R.drawable.photo,"withdrawn","Tanvir","new Event","Aug 19-23 luxury comfort and royal A","sat"));
        list.add(new AllMessageModel(R.drawable.photo,"Awaiting guest review","Chowdhury Husnine","Airbnb update: Reminder-Leave a","Aug 19-23 luxury comfort and royal A","fri"));
        list.add(new AllMessageModel(R.drawable.photo,"canceled by guest","Kazi Mustafizur","Thank you","Aug 19-23 luxury comfort and royal A","sat"));
        list.add(new AllMessageModel(R.drawable.photo,"Past guest","Reashad Hossain","new Event","Aug 19-23 luxury comfort and royal A","sat"));
        list.add(new AllMessageModel(R.drawable.photo,"withdrawn","Tanvir","new Event","Aug 19-23 luxury comfort and royal A","sat"));
        list.add(new AllMessageModel(R.drawable.photo,"Awaiting guest review","Chowdhury Husnine","Airbnb update: Reminder-Leave a","Aug 19-23 luxury comfort and royal A","fri"));
        list.add(new AllMessageModel(R.drawable.photo,"canceled by guest","Kazi Mustafizur","Thank you","Aug 19-23 luxury comfort and royal A","sat"));
        list.add(new AllMessageModel(R.drawable.photo,"Past guest","Reashad Hossain","new Event","Aug 19-23 luxury comfort and royal A","sat"));

    }
}