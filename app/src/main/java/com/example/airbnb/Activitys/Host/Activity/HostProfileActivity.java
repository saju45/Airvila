package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.airbnb.Activitys.Host.Adapter.FromGuestAdapter;
import com.example.airbnb.Activitys.Host.Adapter.UserListingAdapter;
import com.example.airbnb.Activitys.Host.Model.FromGuestsModel;
import com.example.airbnb.Activitys.Host.Model.UserListingModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityHostProfileBinding;

import java.util.ArrayList;

public class HostProfileActivity extends AppCompatActivity {

    ActivityHostProfileBinding binding;
    ArrayList<UserListingModel> list;
    ArrayList<FromGuestsModel> list1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHostProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=new ArrayList<>();
        list1=new ArrayList<>();
        addData();


        UserListingAdapter adapter=new UserListingAdapter(getApplicationContext(),list);
        FromGuestAdapter adapter1=new FromGuestAdapter(this,list1);


        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        binding.listingRv.setLayoutManager(layoutManager);
        binding.listingRv.setHasFixedSize(true);
        binding.listingRv.setAdapter(adapter);


        LinearLayoutManager layoutManager1=new LinearLayoutManager(getApplicationContext());
        layoutManager1.setOrientation(LinearLayoutManager.VERTICAL);
        binding.fromGuestRv.setLayoutManager(layoutManager1);
        binding.fromGuestRv.setHasFixedSize(true);
        binding.fromGuestRv.setAdapter(adapter1);

    }

    public void addData(){


        list.add(new UserListingModel(R.drawable.bed1,2,"Luxury, comfort and royal Ac stay"));
        list.add(new UserListingModel(R.drawable.bed2,3,"Elegant AC Stay at Bashundhara"));
        list.add(new UserListingModel(R.drawable.bed3,3,"Royal Impression near Airport And Diplo.."));


        list1.add(new FromGuestsModel(R.drawable.bed3,"Chowdhury,","New your,United States","Auguest 2022","IIt was an amazing experience"));
        list1.add(new FromGuestsModel(R.drawable.bed2,"Reashad,","Toronto,Canada","August 2022","Excellent host and very professional indivduals.Always replied =my quesries in a professional marner. highly recommend his place"));
        list1.add(new FromGuestsModel(R.drawable.bed2,"Fardeen","","August 2022","Great Stay, Every thing ws top notch, The apartment had all the necessary facilities. The owner has very considerate and help ful..Definitely would recommend"));


    }
}