package com.example.airbnb.Activitys.Activity;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Adapter.ItemAdapter;
import com.example.airbnb.Activitys.Fragments.InboxFragment;
import com.example.airbnb.Activitys.Fragments.Mainragment;
import com.example.airbnb.Activitys.Fragments.ProfileFragment;
import com.example.airbnb.Activitys.Fragments.TripsFragment;
import com.example.airbnb.Activitys.Fragments.WhitelistFragment;
import com.example.airbnb.Activitys.Models.ItemModel;
import com.example.airbnb.Activitys.Models.MainRvModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        

        
        

        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new Mainragment()).commit();

        binding.bottomBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                if (item.getItemId()==R.id.explore)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new Mainragment()).commit();

                }
                if (item.getItemId()==R.id.wishlists)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new WhitelistFragment()).commit();

                }
                if (item.getItemId()==R.id.trips)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new TripsFragment()).commit();

                }
                if (item.getItemId()==R.id.inbox)
                {

                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new InboxFragment()).commit();

                }
                if (item.getItemId()==R.id.profile)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new ProfileFragment()).commit();

                }


                return false;
            }
        });

    }

}