package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.airbnb.Activitys.Host.Adapter.CheckInInstructionAdapter;
import com.example.airbnb.Activitys.Host.Model.CheckInInstructionModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityCheckInInstructionBinding;

import java.util.ArrayList;

public class CheckInInstructionActivity extends AppCompatActivity {

    ActivityCheckInInstructionBinding binding;
    ArrayList<CheckInInstructionModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCheckInInstructionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=new ArrayList<>();
        addIItem();

        CheckInInstructionAdapter adapter=new CheckInInstructionAdapter(this,list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        binding.checkInRv.setLayoutManager(layoutManager);
        binding.checkInRv.setHasFixedSize(true);
        binding.checkInRv.setAdapter(adapter);


    }
    public void addIItem(){


        list.add(new CheckInInstructionModel(1,"What should guests look for to know they're in the right place?"));
        list.add(new CheckInInstructionModel(2,"What should guests do next?"));
        list.add(new CheckInInstructionModel(3,"Whats should guest to next?"));


    }
}