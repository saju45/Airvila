package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.airbnb.Activitys.Host.Adapter.ScenicViewAdapter;
import com.example.airbnb.Activitys.Host.Model.ScenicViewmodel;
import com.example.airbnb.databinding.ActivityScenicViewsBinding;

import java.util.ArrayList;

public class ScenicViewsActivity extends AppCompatActivity {

    ActivityScenicViewsBinding binding;
    ArrayList<ScenicViewmodel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityScenicViewsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=new ArrayList<>();
        addItem();

        ScenicViewAdapter adapter=new ScenicViewAdapter(this,list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.scenicRv.setLayoutManager(layoutManager);
        binding.scenicRv.setHasFixedSize(true);
        binding.scenicRv.setAdapter(adapter);

    }

    public void addItem(){

        list.add(new ScenicViewmodel("dkdfd","Bay view"));
        list.add(new ScenicViewmodel("","Beach view"));
        list.add(new ScenicViewmodel("","Canal view"));
        list.add(new ScenicViewmodel("","City skyline view"));
        list.add(new ScenicViewmodel("","Countryard view"));
        list.add(new ScenicViewmodel("","Desert view"));
        list.add(new ScenicViewmodel("","Garden view"));
        list.add(new ScenicViewmodel("","Golf course view"));
        list.add(new ScenicViewmodel("","Harbor view"));
        list.add(new ScenicViewmodel("","Lake view"));
        list.add(new ScenicViewmodel("","Marina view "));
        list.add(new ScenicViewmodel("","Mountain view"));
        list.add(new ScenicViewmodel("","Ocean view"));
        list.add(new ScenicViewmodel("","Park view"));
        list.add(new ScenicViewmodel("","Pool view "));
        list.add(new ScenicViewmodel("","Resort view"));
        list.add(new ScenicViewmodel("","River view "));
        list.add(new ScenicViewmodel("","Sea view"));
        list.add(new ScenicViewmodel("","Valley view"));
        list.add(new ScenicViewmodel("","Vineyard view"));


    }
}