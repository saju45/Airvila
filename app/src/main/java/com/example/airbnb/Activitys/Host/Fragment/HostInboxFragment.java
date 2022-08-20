package com.example.airbnb.Activitys.Host.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Host.Adapter.AllMessageAdapter;
import com.example.airbnb.Activitys.Host.Model.AllMessageModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentHostInboxBinding;

import java.util.ArrayList;


public class HostInboxFragment extends Fragment {


    FragmentHostInboxBinding binding;
    ArrayList<AllMessageModel> list;
    public HostInboxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentHostInboxBinding.inflate(inflater, container, false);


        clickListener();

        list=new ArrayList<>();

        addItem();

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

        list.add(new AllMessageModel(R.drawable.photo1,"withdrawn","Tanvir","new Event","Aug 19 23 luxury comfort and royal A","sat"));
        list.add(new AllMessageModel(R.drawable.photo,"Awaiting guest review","Chowdhury Husnine","Airbnb update: Reminder-Leave a","Aug 19-23 luxury comfort and royal A","fri"));
        list.add(new AllMessageModel(R.drawable.photo1,"canceled by guest","Kazi Mustafizur","Thank you","Aug 19-23 luxury comfort and royal A","sat"));
        list.add(new AllMessageModel(R.drawable.photo,"Past guest","Reashad Hossain","new Event","Aug 19-23 luxury comfort and royal A","sat"));
        list.add(new AllMessageModel(R.drawable.photo1,"withdrawn","Tanvir","new Event","Aug 19-23 luxury comfort and royal A","sat"));
        list.add(new AllMessageModel(R.drawable.photo,"Awaiting guest review","Chowdhury Husnine","Airbnb update: Reminder-Leave a","Aug 19-23 luxury comfort and royal A","fri"));
        list.add(new AllMessageModel(R.drawable.photo1,"canceled by guest","Kazi Mustafizur","Thank you","Aug 19-23 luxury comfort and royal A","sat"));
        list.add(new AllMessageModel(R.drawable.photo,"Past guest","Reashad Hossain","new Event","Aug 19-23 luxury comfort and royal A","sat"));

    }
}