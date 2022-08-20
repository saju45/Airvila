package com.example.airbnb.Activitys.Host.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Host.Adapter.CleaningListAdapter;
import com.example.airbnb.Activitys.Host.Adapter.TipCleaningAdapter;
import com.example.airbnb.Activitys.Host.Model.CleaningListModel;
import com.example.airbnb.Activitys.Host.Model.TipsCleaningModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentCleaningBinding;

import java.util.ArrayList;


public class CleaningFragment extends Fragment {


    FragmentCleaningBinding binding;
    ArrayList<CleaningListModel> list;
    ArrayList<TipsCleaningModel> list1;

    public CleaningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentCleaningBinding.inflate(inflater, container, false);

        list=new ArrayList<>();
        list1=new ArrayList<>();
        addData();


        CleaningListAdapter adapter=new CleaningListAdapter(getContext(),list);
        TipCleaningAdapter tipCleaningAdapter=new TipCleaningAdapter(getContext(),list1);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        binding.cleaningListRv.setLayoutManager(layoutManager);
        binding.cleaningListRv.setHasFixedSize(true);
        binding.cleaningListRv.setAdapter(adapter);


        LinearLayoutManager layoutManager1=new LinearLayoutManager(getContext());
        layoutManager1.setOrientation(LinearLayoutManager.VERTICAL);
        binding.cleaningTipsRv.setLayoutManager(layoutManager1);
        binding.cleaningTipsRv.setHasFixedSize(true);
        binding.cleaningTipsRv.setAdapter(tipCleaningAdapter);


       return binding.getRoot();
    }

    public void addData(){

        list.add(new CleaningListModel(R.drawable.book,"Cleaning","CheckLists"));
        list.add(new CleaningListModel(R.drawable.work_space,"Supplies and","services"));
        list.add(new CleaningListModel(R.drawable.notes,"Resources","  "));

        list1.add(new TipsCleaningModel(R.drawable.book,"Download the cleaning handbook","This comprehensive resource includes expert-backed guidance, safety tips, and checklists."));
        list1.add(new TipsCleaningModel(R.drawable.book,"Share your cleaning checklists","Easily share your custom checklists with your cleaning partner, even if they don't have an airbnb account,"));
        list1.add(new TipsCleaningModel(R.drawable.book,"Set out a cleaning kit","Most guests like having access to cleaning supplies to use during their stay put together a cleaning care package for your next guest. "));
        list1.add(new TipsCleaningModel(R.drawable.book,"Encourage distancing with self\ncheck-in","More guests than ever are searching for listings that offer self check0in Add a self check-in method,such as a lockbox or keypad."));

    }
}