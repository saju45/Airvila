package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.airbnb.Activitys.Host.Adapter.AmenitiesAdapter;
import com.example.airbnb.Activitys.Host.Model.AmenitiesModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityAmenitiesBinding;

import java.util.ArrayList;

public class AmenitiesActivity extends AppCompatActivity {

    ActivityAmenitiesBinding binding;
    ArrayList<AmenitiesModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAmenitiesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=new ArrayList<>();
        addItem();

        AmenitiesAdapter adapter=new AmenitiesAdapter(this,list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        binding.amenitiesRv.setLayoutManager(layoutManager);
        binding.amenitiesRv.setHasFixedSize(true);
        binding.amenitiesRv.setAdapter(adapter);


    }

    public void addItem(){


        list.add(new AmenitiesModel("","Essentials","Towels bed sheets, soap, toilet paper, and pillows",""));
        list.add(new AmenitiesModel("","Air conditioning","","add details"));
        list.add(new AmenitiesModel("","Cleaning products","",""));
        list.add(new AmenitiesModel("","Cooking basics","Pots and pans,oils ,salt and pepper",""));
        list.add(new AmenitiesModel("","Dedicated workspace","Guests have a desk or table that's used just for working along with a comfortable chair.",""));
        list.add(new AmenitiesModel("","Dishes and silverware","Bowls, chopsticks,  plates, cups, etc.",""));
        list.add(new AmenitiesModel("","Dryer","",""));
        list.add(new AmenitiesModel("","Hair dryer","",""));
        list.add(new AmenitiesModel("","Heating","",""));
        list.add(new AmenitiesModel("","Hot tub","",""));
        list.add(new AmenitiesModel("","Kitchen","Space where guests can cook their own meals",""));
        list.add(new AmenitiesModel("","Pool","",""));
        list.add(new AmenitiesModel("","Tv","","add"));
        list.add(new AmenitiesModel("","Washer","",""));
        list.add(new AmenitiesModel("","Wifi","Available throughout the listing ","add"));
        list.add(new AmenitiesModel("Bathroom","bathtub","",""));
        list.add(new AmenitiesModel("","Body soap","",""));
        list.add(new AmenitiesModel("","Cleaning products","",""));
        list.add(new AmenitiesModel("","Conditioner","",""));
        list.add(new AmenitiesModel("","Hair dryer","",""));
        list.add(new AmenitiesModel("","Hot water","",""));
        list.add(new AmenitiesModel("","outdoor shower","",""));
        list.add(new AmenitiesModel("","Shampoo","","add"));
        list.add(new AmenitiesModel("","Shower gel","",""));
        list.add(new AmenitiesModel("Bedroom and laundry","essential ","Towels, bed sheets, soap, toilet, paper, and pillows",""));
        list.add(new AmenitiesModel("","Bed lines","",""));
        list.add(new AmenitiesModel("","Clothing storage","",""));
        list.add(new AmenitiesModel("","Dryer","",""));
        list.add(new AmenitiesModel("","Extra pillows and blankets","",""));
        list.add(new AmenitiesModel("","Hangers","",""));
        list.add(new AmenitiesModel("","Iron","",""));
        list.add(new AmenitiesModel("","Mosquito net","",""));
        list.add(new AmenitiesModel("","Room-darkening shades","",""));
        list.add(new AmenitiesModel("","safe","",""));
        list.add(new AmenitiesModel("","washer","",""));
        list.add(new AmenitiesModel("Entertainment","Books and reading material","",""));
        list.add(new AmenitiesModel("","Ethernet connection","",""));
        list.add(new AmenitiesModel("","Exercise equipment","",""));
        list.add(new AmenitiesModel("","Game console","",""));
        list.add(new AmenitiesModel("","Piano","",""));
        list.add(new AmenitiesModel("","Ping pong table","",""));
        list.add(new AmenitiesModel("","Pool table","",""));
        list.add(new AmenitiesModel("","Record player","",""));
        list.add(new AmenitiesModel("","Sound system","",""));
        list.add(new AmenitiesModel("","Tv","","add"));
        list.add(new AmenitiesModel("Family","Baby monitor","",""));
        list.add(new AmenitiesModel("","Baby safety gates","",""));
        list.add(new AmenitiesModel("","Babysitter recommendations","",""));
        list.add(new AmenitiesModel("","Board games","",""));
        list.add(new AmenitiesModel("","Children's dinnerware","",""));
        list.add(new AmenitiesModel("","Crib","",""));
        list.add(new AmenitiesModel("","Fireplace guards","",""));
        list.add(new AmenitiesModel("","High chair","",""));
        list.add(new AmenitiesModel("","Outlet covers","",""));
        list.add(new AmenitiesModel("","Pack'n paly/Travel crib","",""));
        list.add(new AmenitiesModel("","Table corner guards","",""));
        list.add(new AmenitiesModel("","Window guards","",""));
        list.add(new AmenitiesModel("Heating and cooling ","Air condition","","add details"));
        list.add(new AmenitiesModel("","Ceiling fan","",""));
        list.add(new AmenitiesModel("","Heating","",""));
        list.add(new AmenitiesModel("","Indoor fireplace","","add details"));
        list.add(new AmenitiesModel("","Portable fans","",""));
        list.add(new AmenitiesModel("Home safety","Carbon monoxide alarm"," check your local laws, which may require a working carbon monoxide detection in  every room",""));
        list.add(new AmenitiesModel("","Fire extinguisher","",""));
        list.add(new AmenitiesModel("","Fist aid kit","",""));
        list.add(new AmenitiesModel("","Lock on bedroom door","Private room can be locked for safety and privacy",""));
        list.add(new AmenitiesModel("","Smoke","Check your local laws which may require a working smoke detection in every room",""));
        list.add(new AmenitiesModel("Internet and office","Dedicated workspace","Guests have or table that's used just for working, along with a comfortable chair",""));
        list.add(new AmenitiesModel("","Pocket wifi","",""));
        list.add(new AmenitiesModel("","Wifi","Available throughout the listing","add details"));
        list.add(new AmenitiesModel("Kitchen and dining","Baking sheet","",""));
        list.add(new AmenitiesModel("","Barbecue utensils","Grill, charcoal, bamboo skewers/iron skewers, etc",""));
        list.add(new AmenitiesModel("","Bread maker","",""));
        list.add(new AmenitiesModel("","Blender","",""));
        list.add(new AmenitiesModel("","Coffee","",""));
        list.add(new AmenitiesModel("","Coffee maker","",""));
        list.add(new AmenitiesModel("","cooking basics","Posts and pans oil, salt and pepper",""));
        list.add(new AmenitiesModel("","Dining table","",""));
        list.add(new AmenitiesModel("","Dishes and silverware","Bowls chopsticks, plates, cups, etc.",""));
        list.add(new AmenitiesModel("","Dishwasher","",""));
        list.add(new AmenitiesModel("","Freezer","",""));
        list.add(new AmenitiesModel("","Hot water kettle","",""));
        list.add(new AmenitiesModel("","kitchen","space where guests can cook",""));
        list.add(new AmenitiesModel("","Microwave","",""));
        list.add(new AmenitiesModel("","Mini fridge","",""));
        list.add(new AmenitiesModel("","Oven","",""));
        list.add(new AmenitiesModel("","Refrigerator","",""));
        list.add(new AmenitiesModel("","Rice maker","",""));
        list.add(new AmenitiesModel("","stove","",""));
        list.add(new AmenitiesModel("","Toaster","",""));
        list.add(new AmenitiesModel("","Trash compactor","",""));
        list.add(new AmenitiesModel("","Wine glasses","",""));
        list.add(new AmenitiesModel("Location features","Beach access","Guests can enjoy a nearby  beach",""));
        list.add(new AmenitiesModel("","Lake access","Guests can get to a lake using path or dock",""));
        list.add(new AmenitiesModel("","Laundromat nearby","",""));
        list.add(new AmenitiesModel("","Private entrance","Separate street or building entrance",""));
        list.add(new AmenitiesModel("","Resort access","Guests can use nearby resort facilities",""));
        list.add(new AmenitiesModel("","Ski-in/Ski-ou","Guests can access ski lifts without driving or taking paid transportation",""));
        list.add(new AmenitiesModel("","Waterfront","Right next to a body of water",""));
        list.add(new AmenitiesModel("Outdoor","Backyard","An open space on the property usually",""));
        list.add(new AmenitiesModel("","BBQ grill","",""));
        list.add(new AmenitiesModel("","Beach essential","Beach, towels,umbrella, beach blanket, snorkeling gear",""));
        list.add(new AmenitiesModel("","Bikes ","",""));
        list.add(new AmenitiesModel("","Boat slip","",""));
        list.add(new AmenitiesModel("","Fire pit","",""));
        list.add(new AmenitiesModel("","Hammock","",""));
        list.add(new AmenitiesModel("","Kayak","",""));
        list.add(new AmenitiesModel("","Outdoor furniture","",""));
        list.add(new AmenitiesModel("","Outdoor kitchen","",""));
        list.add(new AmenitiesModel("","Patio or balcony","",""));
        list.add(new AmenitiesModel("Parking and facilities","Elevator","The home or building has an elevator that's at least 52 inches deep and a doorway at least 32 inches wide.",""));
        list.add(new AmenitiesModel("","Ev charger","Guests can charge their electric Vehicles on the property",""));
        list.add(new AmenitiesModel("","Free parking on premises","",""));
        list.add(new AmenitiesModel("","Free street parking","",""));
        list.add(new AmenitiesModel("","Gym","",""));
        list.add(new AmenitiesModel("","Hot tub","",""));
        list.add(new AmenitiesModel("","Paid parking off premises","",""));
        list.add(new AmenitiesModel("","Paid parking on premises ","",""));
        list.add(new AmenitiesModel("","Pool","",""));
        list.add(new AmenitiesModel("","private living room","",""));
        list.add(new AmenitiesModel("","Sauna","",""));
        list.add(new AmenitiesModel("","Single level home","",""));
        list.add(new AmenitiesModel("Services","Breakfast","Breakfast is provided",""));
        list.add(new AmenitiesModel("","Cleaning before checkout","",""));
        list.add(new AmenitiesModel("","Long term stay allowed","Allow stay for 28 days or more",""));
        list.add(new AmenitiesModel("","Luggage dropoff allowed","For guests convenience whe tey have early arrival or late departure",""));



    }
}