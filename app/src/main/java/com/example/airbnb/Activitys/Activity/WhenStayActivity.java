package com.example.airbnb.Activitys.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.airbnb.Activitys.Fragments.ChooseDatesFragment;
import com.example.airbnb.Activitys.Fragments.ImFlexibleFragment;
import com.example.airbnb.Activitys.Fragments.Mainragment;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityWhenStayBinding;

public class WhenStayActivity extends AppCompatActivity {

    ActivityWhenStayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityWhenStayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

      //  getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new ChooseDatesFragment()).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new ChooseDatesFragment()).commit();


        binding.chooseDates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new ChooseDatesFragment()).commit();
                binding.chooseDates.setBackground(getResources().getDrawable(R.drawable.search_bg));
            }
        });

        binding.felxible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new ImFlexibleFragment()).commit();
                binding.felxible.setBackground(getResources().getDrawable(R.drawable.search_bg));

            }
        });

    }
}