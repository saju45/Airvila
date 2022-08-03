package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.airbnb.Activitys.Host.Adapter.InProgressAdapter;
import com.example.airbnb.Activitys.Host.Adapter.ListedAdapter;
import com.example.airbnb.Activitys.Host.Adapter.UnlistedAdapter;
import com.example.airbnb.Activitys.Host.Model.UnlistedModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityListingsBinding;

import java.util.ArrayList;

public class ListingsActivity extends AppCompatActivity {

    ActivityListingsBinding binding;
    ArrayList<UnlistedModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityListingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        clickListener();
        list=new ArrayList<>();
        addData();

        UnlistedAdapter adapter=new UnlistedAdapter(this,list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.unlistedRV.setLayoutManager(layoutManager);
        binding.unlistedRV.setHasFixedSize(true);
        binding.unlistedRV.setAdapter(adapter);

        InProgressAdapter inProgressAdapter=new InProgressAdapter(this,list);
        LinearLayoutManager layoutManager1=new LinearLayoutManager(this);
        layoutManager1.setOrientation(LinearLayoutManager.VERTICAL);

       binding.inProgressRv.setLayoutManager(layoutManager1);
        binding.inProgressRv.setHasFixedSize(true);
        binding.inProgressRv.setAdapter(inProgressAdapter);

        ListedAdapter listedAdapter=new ListedAdapter(this,list);
        LinearLayoutManager layoutManager2=new LinearLayoutManager(this);
        layoutManager2.setOrientation(LinearLayoutManager.VERTICAL);

        binding.listedRv.setLayoutManager(layoutManager2);
        binding.listedRv.setHasFixedSize(true);
        binding.listedRv.setAdapter(listedAdapter);



    }

    public void addData(){

        list.add(new UnlistedModel("https://hatil.com/bed-price-in-bangladesh","Affordable foreign stay with lux ..."));
        list.add(new UnlistedModel("http://www.home-designing.com/kids-beds-loft-and-bunk-bed-furniture-for-sale","Luxury,comfort and royal Ac st..."));
        list.add(new UnlistedModel("https://www.dreams.co.uk/murphy-upholstered-ottoman-bed-frame-with-bedside-tables/p/251-00322-configurable","private room in Data"));


    }

    public void clickListener(){

        binding.listAnotherCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ListingsActivity.this,WelcomeActivity.class));
            }
        });

    }
}