package com.example.airbnb.Activitys.Host.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Host.Activity.AmenitiesActivity;
import com.example.airbnb.Activitys.Host.Activity.DescriptionActivity;
import com.example.airbnb.Activitys.Host.Activity.ListTitleActivity;
import com.example.airbnb.Activitys.Host.Activity.PhotoActivity;
import com.example.airbnb.Activitys.Host.Activity.PropertyAndGuestActivity;
import com.example.airbnb.Activitys.Host.Activity.RoomAndSpacesActivity;
import com.example.airbnb.Activitys.Host.Adapter.CoverPhotoAdapter;
import com.example.airbnb.Activitys.Host.Model.CoverPhoto;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentListingDetailsBinding;

import java.util.ArrayList;


public class ListingDetailsFragment extends Fragment {

    FragmentListingDetailsBinding binding;
    ArrayList<CoverPhoto> list;
    public ListingDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentListingDetailsBinding.inflate(inflater, container, false);

        clickListener();

        list=new ArrayList<>();
        addItem();

        CoverPhotoAdapter adapter=new CoverPhotoAdapter(getContext(),list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        binding.listingDetailsPhotoRv.setLayoutManager(layoutManager);
        binding.listingDetailsPhotoRv.setHasFixedSize(true);
        binding.listingDetailsPhotoRv.setAdapter(adapter);

        return binding.getRoot();
    }

    public void addItem(){

        list.add(new CoverPhoto(R.drawable.photo1,""));
        list.add(new CoverPhoto(R.drawable.photo,""));
        list.add(new CoverPhoto(R.drawable.photo1,""));
        list.add(new CoverPhoto(R.drawable.photo,""));
        list.add(new CoverPhoto(R.drawable.photo,""));
        list.add(new CoverPhoto(R.drawable.photo1,""));
        list.add(new CoverPhoto(R.drawable.photo1,""));
        list.add(new CoverPhoto(R.drawable.photo,""));
        list.add(new CoverPhoto(R.drawable.photo1,""));
        list.add(new CoverPhoto(R.drawable.photo1,""));
        list.add(new CoverPhoto(R.drawable.photo,""));
        list.add(new CoverPhoto(R.drawable.photo1,""));
        list.add(new CoverPhoto(R.drawable.photo1,""));
        list.add(new CoverPhoto(R.drawable.photo1,""));
        list.add(new CoverPhoto(R.drawable.photo1,""));
        list.add(new CoverPhoto(R.drawable.photo1,""));




    }

    public void clickListener(){

        binding.photoAddedLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), PhotoActivity.class));
            }
        });


        binding.listingTitleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ListTitleActivity.class));
            }
        });

        binding.descriptionLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), DescriptionActivity.class));
            }
        });

        binding.roomSpacelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), RoomAndSpacesActivity.class));
            }
        });

        binding.propertyLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), PropertyAndGuestActivity.class));

            }
        });

        binding.amenitiesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), AmenitiesActivity.class));
            }
        });
    }
}