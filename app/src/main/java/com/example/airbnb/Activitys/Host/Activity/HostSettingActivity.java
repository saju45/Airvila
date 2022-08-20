package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.airbnb.Activitys.Host.Adapter.SettingAdapter;
import com.example.airbnb.Activitys.Host.Model.SettingModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityHostSettingBinding;

import java.util.ArrayList;

public class HostSettingActivity extends AppCompatActivity {

    ActivityHostSettingBinding binding;
    ArrayList<SettingModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHostSettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=new ArrayList<>();
        addData();
        SettingAdapter adapter=new SettingAdapter(this,list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.settingRv.setLayoutManager(layoutManager);
        binding.settingRv.setHasFixedSize(true);
        binding.settingRv.setAdapter(adapter);

    }

    public void addData(){

        list.add(new SettingModel(R.drawable.user32,"Edit personal information"));
        list.add(new SettingModel(R.drawable.card32,"Payments & payouts"));
        list.add(new SettingModel(R.drawable.padlock,"Privacy & sharing"));
        list.add(new SettingModel(R.drawable.translation,"Translation"));
        list.add(new SettingModel(R.drawable.message,"Notification settings"));
        list.add(new SettingModel(R.drawable.work_space,"Travel for work"));


    }
}