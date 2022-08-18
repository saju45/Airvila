package com.example.airbnb.Activitys.Host.Activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.example.airbnb.Activitys.Fragments.CreateListingFragment;
import com.example.airbnb.Activitys.Host.Fragment.BestDescribePlaceragment;
import com.example.airbnb.Activitys.Host.Fragment.GuestCapacityFragment;
import com.example.airbnb.Activitys.Host.Fragment.HowManyGuestFragment;
import com.example.airbnb.Activitys.Host.Fragment.ListingAddressFragment;
import com.example.airbnb.Activitys.Host.Fragment.ListingFragment;
import com.example.airbnb.Activitys.Host.Fragment.PlaceOfferFragment;
import com.example.airbnb.Activitys.Host.Fragment.SizeSqftFragment;
import com.example.airbnb.Activitys.Host.Fragment.SpecialityFragment;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityWelcomeBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class WelcomeActivity extends AppCompatActivity {

    ActivityWelcomeBinding binding;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        clickListener();

        int colorCode=getRandomColor();
        binding.layout1.setBackgroundColor(getResources().getColor(colorCode, null));


    }

    public void clickListener(){

        binding.cardCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             //   startActivity(new Intent(WelcomeActivity.this,CreateNewListingActivity.class));

                binding.welcomeText.setText("Create a new listing \n for your resort");
                binding.name.setVisibility(View.GONE);
                binding.layout1.setLayoutParams(new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, 300));
                binding.btnLayout.setVisibility(View.VISIBLE);
                getSupportFragmentManager().beginTransaction().replace(R.id.welcomeFrameLayout,new CreateListingFragment()).commit();
                binding.layout2.setVisibility(View.GONE);

            }
        });

        binding.cardListing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.welcomeText.setText("What king of space will \n guests have?");
                binding.name.setVisibility(View.GONE);
                binding.layout1.setLayoutParams(new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, 800));
               binding.btnLayout.setVisibility(View.VISIBLE);
                getSupportFragmentManager().beginTransaction().replace(R.id.welcomeFrameLayout,new CreateListingFragment()).commit();
                binding.layout2.setVisibility(View.GONE);


               // startActivity(new Intent(WelcomeActivity.this,CreateNewListingActivity.class));

            }
        });

        binding.cardListing2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.btnLayout.setVisibility(View.VISIBLE);
                binding.welcomeText.setText("Let guests know what \n your place has to offer");
                binding.name.setVisibility(View.GONE);
                binding.layout1.setLayoutParams(new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, 400));
                getSupportFragmentManager().beginTransaction().replace(R.id.welcomeFrameLayout,new PlaceOfferFragment()).commit();
                binding.layout2.setVisibility(View.GONE);

            }
        });

        binding.backText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.btnLayout.setVisibility(View.VISIBLE);
                binding.welcomeText.setText("How many guests would \n you like to welcome?");
                binding.name.setVisibility(View.GONE);
                binding.layout1.setLayoutParams(new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, 600));
                getSupportFragmentManager().beginTransaction().replace(R.id.welcomeFrameLayout,new HowManyGuestFragment()).commit();
                binding.layout2.setVisibility(View.GONE);

            }
        });



/*
        binding.nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.welcomeText.setText("Choose your Speciality");
                binding.name.setVisibility(View.GONE);
                binding.layout1.setLayoutParams(new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, 400));
                getSupportFragmentManager().beginTransaction().replace(R.id.welcomeFrameLayout,new SpecialityFragment()).commit();

            }
        });
*/


    }


    public int getRandomColor() {


        List<Integer> list = new ArrayList<>();

        list.add(R.color.gray);
        list.add(R.color.green);
        list.add(R.color.light_green);
        list.add(R.color.sky_blue);
        list.add(R.color.pink);
        list.add(R.color.color1);
        list.add(R.color.color2);
        list.add(R.color.color3);
        list.add(R.color.color4);
        list.add(R.color.color5);

        Random random = new Random();
        int number = random.nextInt(list.size());

        return list.get(number);

    }


}