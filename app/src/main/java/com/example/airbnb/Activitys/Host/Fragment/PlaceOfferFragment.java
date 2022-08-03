package com.example.airbnb.Activitys.Host.Fragment;

import android.os.Binder;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Host.Adapter.GuestFvtAdapter;
import com.example.airbnb.Activitys.Host.Adapter.PlaceOfferAdapter;
import com.example.airbnb.Activitys.Host.Adapter.SafetyItemAdapter;
import com.example.airbnb.Activitys.Host.Model.GuestFvtModel;
import com.example.airbnb.Activitys.Host.Model.PlaceOfferModel;
import com.example.airbnb.Activitys.Host.Model.SafetyItemModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentPlaceOfferBinding;

import java.util.ArrayList;


public class PlaceOfferFragment extends Fragment {


    FragmentPlaceOfferBinding binding;
    ArrayList<PlaceOfferModel> list;
    ArrayList<SafetyItemModel> list2;
    ArrayList<GuestFvtModel> list1;

    public PlaceOfferFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentPlaceOfferBinding.inflate(inflater,container, false);

        list=new ArrayList<>();
        list1=new ArrayList<>();
        list2=new ArrayList<>();

        addItem();
        addFvtItem();
        addSafetyItem();


        PlaceOfferAdapter adapter=new PlaceOfferAdapter(getContext(),list);
        GuestFvtAdapter guestFvtAdapter=new GuestFvtAdapter(getContext(),list1);
        SafetyItemAdapter safetyItemAdapter=new SafetyItemAdapter(getContext(),list2);

        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        binding.placeOfferRv.setHasFixedSize(true);
        binding.placeOfferRv.setLayoutManager(layoutManager);
        binding.placeOfferRv.setAdapter(adapter);


        StaggeredGridLayoutManager layoutManager1=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        binding.favoriteRv.setLayoutManager(layoutManager1);
        binding.favoriteRv.setHasFixedSize(true);
        binding.favoriteRv.setAdapter(guestFvtAdapter);

        StaggeredGridLayoutManager layoutManager2=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        binding.safeteItemRv.setLayoutManager(layoutManager2);
        binding.safeteItemRv.setHasFixedSize(true);
        binding.safeteItemRv.setAdapter(safetyItemAdapter);

        return binding.getRoot();
    }

    public void addItem(){

        list.add(new PlaceOfferModel(R.drawable.pool,"Pool"));
        list.add(new PlaceOfferModel(R.drawable.hot_cup,"Hot tub"));
        list.add(new PlaceOfferModel(R.drawable.patio,"Patio"));
        list.add(new PlaceOfferModel(R.drawable.barbecue,"BBQ grill"));
        list.add(new PlaceOfferModel(R.drawable.fire_pit,"Fire pit"));
        list.add(new PlaceOfferModel(R.drawable.pool_table,"Pool table"));
        list.add(new PlaceOfferModel(R.drawable.indoor_fir,"Indoor fireplace"));
        list.add(new PlaceOfferModel(R.drawable.dining_table,"Outdoor dinning\n       area"));
        list.add(new PlaceOfferModel(R.drawable.exercise,"Excercise \nequipment "));

    }

    public void addFvtItem(){
        list1.add(new GuestFvtModel(R.drawable.wifi,"Wifi"));
        list1.add(new GuestFvtModel(R.drawable.television,"Tv"));
        list1.add(new GuestFvtModel(R.drawable.kitchen,"Kitchen"));
        list1.add(new GuestFvtModel(R.drawable.washer,"Washer"));
        list1.add(new GuestFvtModel(R.drawable.electric_car,"Free parking on\n  premises"));
        list1.add(new GuestFvtModel(R.drawable.permisess,"Paid parking on\n  premises"));
        list1.add(new GuestFvtModel(R.drawable.air,"Air conditioning"));
        list1.add(new GuestFvtModel(R.drawable.work_space,"Dedicated\nworkspace"));
        list1.add(new GuestFvtModel(R.drawable.shower,"outdoor shower"));
    }

    public void addSafetyItem(){

        list2.add(new SafetyItemModel(R.drawable.smoke,"Smoke alarm"));
        list2.add(new SafetyItemModel(R.drawable.first_aid,"First aid kit"));
        list2.add(new SafetyItemModel(R.drawable.carbon,"      Carbon \nmonoxide alarm"));
        list2.add(new SafetyItemModel(R.drawable.fire_extinguisher,"Fire extinguisher"));

    }
}