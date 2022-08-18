package com.example.airbnb.Activitys.Host.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Host.Adapter.ElegantAdapter;
import com.example.airbnb.Activitys.Host.Model.ElegantModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentCalendarBinding;

import java.util.ArrayList;


public class CalendarFragment extends Fragment {


    FragmentCalendarBinding binding;
    ArrayList<ElegantModel> list;
    public CalendarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentCalendarBinding.inflate(inflater, container, false);

        list=new ArrayList<>();
        addItem();


        ElegantAdapter adapter=new ElegantAdapter(getContext(),list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.elegantRv.setLayoutManager(layoutManager);
        binding.elegantRv.setHasFixedSize(true);
        binding.elegantRv.setAdapter(adapter);

        return binding.getRoot();
    }

    public void addItem(){

        list.add(new ElegantModel("Sunday, Aug 28","check-in","Mayn",5,3,R.drawable.photo1));
        list.add(new ElegantModel("Sunday, Aug 28","check-in","Mayn",5,3,R.drawable.user));
        list.add(new ElegantModel("Sunday, Aug 28","check-in","Mayn",5,3,R.drawable.photo));
        list.add(new ElegantModel("Sunday, Aug 28","check-in","Mayn",5,3,R.drawable.photo1));
        list.add(new ElegantModel("Sunday, Aug 28","check-in","Mayn",5,3,R.drawable.photo1));


    }
}