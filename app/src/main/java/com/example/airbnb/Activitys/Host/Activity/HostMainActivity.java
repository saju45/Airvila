package com.example.airbnb.Activitys.Host.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.airbnb.Activitys.Fragments.InboxFragment;
import com.example.airbnb.Activitys.Fragments.Mainragment;
import com.example.airbnb.Activitys.Fragments.ProfileFragment;
import com.example.airbnb.Activitys.Fragments.TripsFragment;
import com.example.airbnb.Activitys.Fragments.WhitelistFragment;
import com.example.airbnb.Activitys.Host.Fragment.CalendarFragment;
import com.example.airbnb.Activitys.Host.Fragment.HostInboxFragment;
import com.example.airbnb.Activitys.Host.Fragment.InsightsFragment;
import com.example.airbnb.Activitys.Host.Fragment.MenuFragment;
import com.example.airbnb.Activitys.Host.Fragment.TodayFragment;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityHostMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HostMainActivity extends AppCompatActivity {

    ActivityHostMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHostMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        clickListener();
        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new TodayFragment()).commit();

    }

    public void clickListener(){

        binding.bottomBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId()==R.id.today)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new TodayFragment()).commit();

                }
                if (item.getItemId()==R.id.inbox)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new HostInboxFragment()).commit();

                }
                if (item.getItemId()==R.id.calendar)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout, new CalendarFragment()).commit();

                }
                if (item.getItemId()==R.id.insights)
                {

                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new InsightsFragment()).commit();

                }
                if (item.getItemId()==R.id.menu)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new MenuFragment()).commit();

                }


                return false;
            }
        });

    }
}