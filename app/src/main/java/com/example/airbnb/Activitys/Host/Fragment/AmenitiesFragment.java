package com.example.airbnb.Activitys.Host.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.example.airbnb.Activitys.Host.Adapter.ExpandalbeAdapter;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentAmenitiesBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class AmenitiesFragment extends Fragment {


    FragmentAmenitiesBinding binding;
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;
    private ExpandalbeAdapter adapter;
    int isExpanded=-1;


    public AmenitiesFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentAmenitiesBinding.inflate(inflater, container, false);



        preparingListData();


        adapter=new ExpandalbeAdapter(getContext(),listDataHeader,listDataChild);
        binding.expandableList.setAdapter(adapter);

        binding.expandableList.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {

                String headerName=listDataHeader.get(groupPosition);

                return false;
            }
        });

        binding.expandableList.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {

                String headerName=listDataHeader.get(groupPosition);

            }
        });

        binding.expandableList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {


                String childName=listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition);

                return false;
            }
        });

        binding.expandableList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {

                if (isExpanded!=-1 && isExpanded!=groupPosition){

                   binding.expandableList.collapseGroup(isExpanded);
                }
                isExpanded=groupPosition;
            }
        });



        return binding.getRoot();
    }


    public void preparingListData(){

        //    String[] groupString=getResources().getStringArray(R.array.create_listing_group);
        //  String[] childString=getResources().getStringArray(R.array.create_listing_header_apartment);

        listDataHeader=new ArrayList<>();
        listDataChild=new HashMap<>();

        listDataHeader.add("Most Popular");
        listDataHeader.add("Bathroom");
        listDataHeader.add("Bedroom");
        listDataHeader.add("Entertainment");
        listDataHeader.add("Family");
        listDataHeader.add("Heating & Cooling");
        listDataHeader.add("Home safety");
        listDataHeader.add("Internet & office");
        listDataHeader.add("Kitchen & Dining");
        listDataHeader.add("Location Features");
        listDataHeader.add("Outdoor");
        listDataHeader.add("Parking & Facilities");
        listDataHeader.add("Service");


        List<String> popular=new ArrayList<>();

        popular.add("Air-Conditioning");
        popular.add("Cleaning items");
        popular.add("Wifi");
        popular.add("Tv");
        popular.add("Movie/Theater Access(netflix,amazon prime video etc)");
        popular.add("Essential(Towel,B|ed sheets, soap,toilet paper & pillows");
        popular.add("Car Rental");
        popular.add("Cooking Basics");
        popular.add("Dedicated Workstation");
        popular.add("Barbecue Utensils");
        popular.add("Hair Dryer");
        popular.add("Iron");
        popular.add("Shampoo");
        popular.add("Hand Washing Soap");
        popular.add("Kitchen Swimming Pool");
        popular.add("Baby Safety Gates");
        popular.add("Oven");
        popular.add("Geezer");
        popular.add("Exercise Equipments");
        popular.add("Fire Extinguisher");



        List<String> bathroom=new ArrayList<>();

        bathroom.add("Bathtub");
        bathroom.add("Body Soap");
        bathroom.add("Shower Gel");
        bathroom.add("Hand Washing Soap");
        bathroom.add("Cleaning Products");
        bathroom.add("Shampoo");
        bathroom.add("Hair Dryer");
        bathroom.add("High Commode");
        bathroom.add("Geezer");


        List<String> bedroom=new ArrayList<>();

       bedroom.add("Air-Conditioning");
        bedroom.add("Essentials(Towel,Bed,sheets,soap,toilet paper,& pillows");
        bedroom.add("Bed Linens");
        bedroom.add("Clothing Storage");
        bedroom.add("Tissues");
        bedroom.add("Hair Dryer");
        bedroom.add("Extra mattress");
        bedroom.add("Extra Bed Sheets");
        bedroom.add("Extra Towels");
        bedroom.add("Extra Pillows");
        bedroom.add("Extra Blankets");
        bedroom.add("Hangers");
        bedroom.add("Iron");
        bedroom.add("Mosquito Net");
        bedroom.add("Mosquito Killing Gel/Aerosol");

        List<String> entertainment=new ArrayList<>();

        entertainment.add("TV");
        entertainment.add("Wifi");
        entertainment.add("Movie/Theater Access(netflix,amazon prime video etc)");
        entertainment.add("Gaming Zone");
        entertainment.add("Exercise Equipment");
        entertainment.add("Piano");
        entertainment.add("Guitar");
        entertainment.add("Pol Table");
        entertainment.add("Sound System");


        List<String> family=new ArrayList<>();

        family.add("Baby Bath");
        family.add("Baby Safety Gates");
        family.add("Baby Game Zone");
        family.add("Changing Table");
        family.add("High Chair");
        family.add("TAble Corner Guard");
        family.add("Window Guards");

        List<String> heating=new ArrayList<>();

        heating.add("Air-Conditioning");
        heating.add("Ceiling Fan");
        heating.add("Indoor Fireplace");
        heating.add("Portable Fans");

        List<String> home=new ArrayList<>();

        home.add("CC Camera");
        home.add("Carbon Manoxide Alarm");
        home.add("Fire Extinguisher");
        home.add("First Aid Kit");
        home.add("Smoke Alarm");

        List<String> internet=new ArrayList<>();

        internet.add("Dedicated Workplace");
        internet.add("Pocket Wifi");
        internet.add("Wifi");


        List<String> kitchen=new ArrayList<>();

        kitchen.add("Kitchen");
        kitchen.add("Baking Sheet");
        kitchen.add("Barbecue Utensils");
        kitchen.add("Bread Maker");
        kitchen.add("Bender");
        kitchen.add("Coffee Maker");
        kitchen.add("Cooking Basics");
        kitchen.add("Dining Table");
        kitchen.add("Dishwasher");
        kitchen.add("Freezer");
        kitchen.add("Hot water Kettle");
        kitchen.add("Microwave");
        kitchen.add("Mini Fridge");
        kitchen.add("Oven");
        kitchen.add("Refrigerator");
        kitchen.add("Rice Cooker");
        kitchen.add("Stove");
        kitchen.add("Toaster");
        kitchen.add("Trash compactor");
        kitchen.add("Enough Plates, Glasses, Spoons & others etc.");

        List<String> location=new ArrayList<>();

        location.add("Beach Access");
        location.add("Lake Access");
        location.add("Resort Access");
        location.add("Private Entrance");
        location.add("Waterfront");


        List<String> outdoor=new ArrayList<>();

        outdoor.add("Backyard");
        outdoor.add("BBQ Grill");
        outdoor.add("Beach Essentials");
        outdoor.add("Bikes ");
        outdoor.add("Boats Slip");
        outdoor.add("Kayak");
        outdoor.add("Outdoor Dining Area");
        outdoor.add("Outdoor Furniture");
        outdoor.add("Outdoor Kitchen");
        outdoor.add("Patio or Balcony");


        List<String> parking=new ArrayList<>();

       parking.add("Elevator");
       parking.add("EV Charger");
       parking.add("Generator Facilities");
        parking.add("Fre parking On Premises");
        parking.add("Free Street Parking ");
        parking.add("Paid Parking On Premises");
        parking.add("Paid Parking Off Premises");
        parking.add("Gym");
        parking.add("Pool");
        parking.add("Single Level Home");


        List<String> services=new ArrayList<>();

        services.add("Breakfast");
        services.add("Cleaning after checkout");
        services.add("Cleaning before check in ");
        services.add("Long-term stay allowed");
        services.add("Car Rental");
        services.add("Laundry");
        services.add("Food Delivery");
        services.add("Luggage drop off allowed");


        listDataChild.put(listDataHeader.get(0),popular);
        listDataChild.put(listDataHeader.get(1),bathroom);
        listDataChild.put(listDataHeader.get(2),bedroom);
        listDataChild.put(listDataHeader.get(3),entertainment);
        listDataChild.put(listDataHeader.get(4),family);
        listDataChild.put(listDataHeader.get(5),heating);
        listDataChild.put(listDataHeader.get(6),home);
        listDataChild.put(listDataHeader.get(7),internet);
        listDataChild.put(listDataHeader.get(8),kitchen);
        listDataChild.put(listDataHeader.get(9),location);
        listDataChild.put(listDataHeader.get(10),outdoor);
        listDataChild.put(listDataHeader.get(11),parking);
        listDataChild.put(listDataHeader.get(12),services);




    }

}