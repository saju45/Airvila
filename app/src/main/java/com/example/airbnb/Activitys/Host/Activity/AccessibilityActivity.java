package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.airbnb.Activitys.Host.Adapter.AccessibilityAdapter;
import com.example.airbnb.Activitys.Host.Model.AccessibilityModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityAccessibilityBinding;

import java.util.ArrayList;

public class AccessibilityActivity extends AppCompatActivity {

    ActivityAccessibilityBinding binding;
    ArrayList<AccessibilityModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAccessibilityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=new ArrayList<>();
        addItem();

        AccessibilityAdapter adapter=new AccessibilityAdapter(this,list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        binding.accessibilityRv.setLayoutManager(layoutManager);
        binding.accessibilityRv.setHasFixedSize(true);
        binding.accessibilityRv.setAdapter(adapter);




    }
    public void addItem()
    {

        list.add(new AccessibilityModel("Guest entrance and parking"));
        list.add(new AccessibilityModel("Bedroom"));
        list.add(new AccessibilityModel("Bedroom 2"));
        list.add(new AccessibilityModel("Bedroom 3"));
        list.add(new AccessibilityModel("Full bathroom"));
        list.add(new AccessibilityModel("Full bathroom 2"));
        list.add(new AccessibilityModel("Full bathroom 3"));
        list.add(new AccessibilityModel("Full Kitchen"));
        list.add(new AccessibilityModel("Kitchenette"));
        list.add(new AccessibilityModel("Living area"));
        list.add(new AccessibilityModel("Dining area"));
        list.add(new AccessibilityModel("Patio"));
        list.add(new AccessibilityModel("Garage "));
        list.add(new AccessibilityModel("Garage 2"));
        list.add(new AccessibilityModel("Adaptive equipment"));





    }
}