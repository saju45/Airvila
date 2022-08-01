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
    ArrayList<ItemModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=new ArrayList<>();
        addItem();
        ItemAdapter itemAdapter=new ItemAdapter(this,list);

        
        

     /*   LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        binding.itemRecycler.setLayoutManager(layoutManager);
        binding.itemRecycler.setHasFixedSize(true);
        binding.itemRecycler.setAdapter(itemAdapter);
        binding.itemRecycler.setNestedScrollingEnabled(true);
        itemAdapter.notifyDataSetChanged();*/

        

        
        

        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new Mainragment()).commit();

        binding.bottomBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               // Fragment fragment= null;

                if (item.getItemId()==R.id.explore)
                {
                    //fragment=new Mainragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new Mainragment()).commit();

                }
                if (item.getItemId()==R.id.wishlists)
                {
                   // fragment=new WhitelistFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new WhitelistFragment()).commit();

                }
                if (item.getItemId()==R.id.trips)
                {
                   // fragment=new TripsFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new TripsFragment()).commit();

                }
                if (item.getItemId()==R.id.inbox)
                {
                   // fragment=new InboxFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new InboxFragment()).commit();

                }
                if (item.getItemId()==R.id.profile)
                {
                    //fragment=new ProfileFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new ProfileFragment()).commit();

                }

               // getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,fragment).commit();


                return false;
            }
        });

    }


    public void addItem()
    {

        list.add(new ItemModel(R.drawable.island,"Islands"));
        list.add(new ItemModel(R.drawable.national_park,"National parks"));
        list.add(new ItemModel(R.drawable.amazin_pool,"Amazing pools"));
        list.add(new ItemModel(R.drawable.surprised,"OMG!"));
        list.add(new ItemModel(R.drawable.arctic,"Arctic"));
        list.add(new ItemModel(R.drawable.cabin,"Cabins"));
        list.add(new ItemModel(R.drawable.stairs,"Design"));
        list.add(new ItemModel(R.drawable.beach,"Beach"));
        list.add(new ItemModel(R.drawable.tiny,"Tiny homes"));
        list.add(new ItemModel(R.drawable.lake,"Lakefront"));
        list.add(new ItemModel(R.drawable.surfboard,"Surfing"));
        list.add(new ItemModel(R.drawable.cup,"Bed breakfasts"));
        list.add(new ItemModel(R.drawable.cave,"Caves"));
        list.add(new ItemModel(R.drawable.camping,"Camping"));
        list.add(new ItemModel(R.drawable.home_2,"Shared homes"));
        list.add(new ItemModel(R.drawable.earth_home,"Earth homes"));
        list.add(new ItemModel(R.drawable.golf,"Golfing"));
        list.add(new ItemModel(R.drawable.countryside,"Countryside"));
        list.add(new ItemModel(R.drawable.luxe,"Luxe"));
        list.add(new ItemModel(R.drawable.tropical,"Tropical"));
        list.add(new ItemModel(R.drawable.frame,"A-frames"));
        list.add(new ItemModel(R.drawable.castle,"Castles"));
        list.add(new ItemModel(R.drawable.view,"Amazing view"));
        list.add(new ItemModel(R.drawable.mansion,"Mansions"));
        list.add(new ItemModel(R.drawable.farms,"Farms"));
        list.add(new ItemModel(R.drawable.historical_homes,"Historical homes"));
        list.add(new ItemModel(R.drawable.windmill,"Windmills"));
        list.add(new ItemModel(R.drawable.skiing,"Skiing"));
        list.add(new ItemModel(R.drawable.cycladic_home,"Cycladic homes"));
        list.add(new ItemModel(R.drawable.beach_fornt,"Beachfront"));
        list.add(new ItemModel(R.drawable.cities,"Iconic cities"));
        list.add(new ItemModel(R.drawable.chef,"Chef's"));
        list.add(new ItemModel(R.drawable.treehouse,"Treehouse"));
        list.add(new ItemModel(R.drawable.campers,"Campers"));
        list.add(new ItemModel(R.drawable.shop,"Ryokans"));
        list.add(new ItemModel(R.drawable.brans,"Barns"));
        list.add(new ItemModel(R.drawable.vineyards,"Vineyards"));
        list.add(new ItemModel(R.drawable.wardrobe,"Minsus"));
        list.add(new ItemModel(R.drawable.tower,"tower"));
        list.add(new ItemModel(R.drawable.home_2,"Kezhans"));
        list.add(new ItemModel(R.drawable.dome,"Homes"));
        list.add(new ItemModel(R.drawable.casa,"Casas particulares"));
        list.add(new ItemModel(R.drawable.desert,"Desert"));
        list.add(new ItemModel(R.drawable.bus,"Shepherd's huts"));
        list.add(new ItemModel(R.drawable.yurt,"Yurts"));
        list.add(new ItemModel(R.drawable.house_boat,"Houseboats"));
        list.add(new ItemModel(R.drawable.boat,"Boats"));
        list.add(new ItemModel(R.drawable.gird_off,"off-the-gird"));
        list.add(new ItemModel(R.drawable.container,"Containers"));
        list.add(new ItemModel(R.drawable.piano,"Grand piano"));
        list.add(new ItemModel(R.drawable.paint,"Creative spaces"));
        list.add(new ItemModel(R.drawable.riads,"Riads"));
        list.add(new ItemModel(R.drawable.trulli,"Trulli"));
        list.add(new ItemModel(R.drawable.dammusos,"Dammusos"));
        list.add(new ItemModel(R.drawable.lake_1,"Lake"));

    }


}