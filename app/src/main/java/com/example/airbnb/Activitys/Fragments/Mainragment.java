package com.example.airbnb.Activitys.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Activity.MainActivity;
import com.example.airbnb.Activitys.Activity.SearchActivity;
import com.example.airbnb.Activitys.Adapter.ItemAdapter;
import com.example.airbnb.Activitys.Adapter.MainRvAdapter;
import com.example.airbnb.Activitys.Models.ItemModel;
import com.example.airbnb.Activitys.Models.MainRvModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentMainragmentBinding;
import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.ArrayList;
import java.util.List;


public class Mainragment extends Fragment {

    FragmentMainragmentBinding binding;
    ArrayList<MainRvModel> list;
    ArrayList<ItemModel> list1;
    public Mainragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentMainragmentBinding.inflate(inflater, container, false);

        list=new ArrayList<>();
        addData();
        MainRvAdapter adapter=new MainRvAdapter(getContext(),list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.mainRv.setHasFixedSize(true);
        binding.mainRv.setLayoutManager(layoutManager);
        binding.mainRv.setAdapter(adapter);
        adapter.notifyDataSetChanged();



        list1=new ArrayList<>();
        addItem();
        ItemAdapter itemAdapter=new ItemAdapter(getContext(),list1);

        LinearLayoutManager layoutManager1=new LinearLayoutManager(getContext());
        layoutManager1.setOrientation(RecyclerView.HORIZONTAL);
        binding.itemRecycler.setLayoutManager(layoutManager1);
        binding.itemRecycler.setHasFixedSize(true);
        binding.itemRecycler.setAdapter(itemAdapter);
        binding.itemRecycler.setNestedScrollingEnabled(true);
        itemAdapter.notifyDataSetChanged();

        /*binding.shimmerFrameLayoutId.stopShimmer();
        binding.shimmerFrameLayoutId.setVisibility(View.GONE);*/


        binding.cardSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), SearchActivity.class));

            }
        });


        return binding.getRoot();
    }

    public void addItem() {

        list1.add(new ItemModel(R.drawable.island, "Islands"));
        list1.add(new ItemModel(R.drawable.national_park, "National parks"));
        list1.add(new ItemModel(R.drawable.amazin_pool, "Amazing pools"));
        list1.add(new ItemModel(R.drawable.surprised, "OMG!"));
        list1.add(new ItemModel(R.drawable.arctic, "Arctic"));
        list1.add(new ItemModel(R.drawable.cabin, "Cabins"));
        list1.add(new ItemModel(R.drawable.stairs, "Design"));
        list1.add(new ItemModel(R.drawable.beach, "Beach"));
        list1.add(new ItemModel(R.drawable.tiny, "Tiny homes"));
        list1.add(new ItemModel(R.drawable.lake, "Lakefront"));
        list1.add(new ItemModel(R.drawable.surfboard, "Surfing"));
        list1.add(new ItemModel(R.drawable.cup, "Bed breakfasts"));
        list1.add(new ItemModel(R.drawable.cave, "Caves"));
        list1.add(new ItemModel(R.drawable.camping, "Camping"));
        list1.add(new ItemModel(R.drawable.home_2, "Shared homes"));
        list1.add(new ItemModel(R.drawable.earth_home, "Earth homes"));
        list1.add(new ItemModel(R.drawable.golf, "Golfing"));
        list1.add(new ItemModel(R.drawable.countryside, "Countryside"));
        list1.add(new ItemModel(R.drawable.luxe, "Luxe"));
        list1.add(new ItemModel(R.drawable.tropical, "Tropical"));
        list1.add(new ItemModel(R.drawable.frame, "A-frames"));
        list1.add(new ItemModel(R.drawable.castle, "Castles"));
        list1.add(new ItemModel(R.drawable.view, "Amazing view"));
        list1.add(new ItemModel(R.drawable.mansion, "Mansions"));
        list1.add(new ItemModel(R.drawable.farms, "Farms"));
        list1.add(new ItemModel(R.drawable.historical_homes, "Historical homes"));
        list1.add(new ItemModel(R.drawable.windmill, "Windmills"));
        list1.add(new ItemModel(R.drawable.skiing, "Skiing"));
        list1.add(new ItemModel(R.drawable.cycladic_home, "Cycladic homes"));
        list1.add(new ItemModel(R.drawable.beach_fornt, "Beachfront"));
        list1.add(new ItemModel(R.drawable.cities, "Iconic cities"));
        list1.add(new ItemModel(R.drawable.chef, "Chef's"));
        list1.add(new ItemModel(R.drawable.treehouse, "Treehouse"));
        list1.add(new ItemModel(R.drawable.campers, "Campers"));
        list1.add(new ItemModel(R.drawable.shop, "Ryokans"));
        list1.add(new ItemModel(R.drawable.brans, "Barns"));
        list1.add(new ItemModel(R.drawable.vineyards, "Vineyards"));
        list1.add(new ItemModel(R.drawable.wardrobe, "Minsus"));
        list1.add(new ItemModel(R.drawable.tower, "tower"));
        list1.add(new ItemModel(R.drawable.home_2, "Kezhans"));
        list1.add(new ItemModel(R.drawable.dome, "Homes"));
        list1.add(new ItemModel(R.drawable.casa, "Casas particulares"));
        list1.add(new ItemModel(R.drawable.desert, "Desert"));
        list1.add(new ItemModel(R.drawable.bus, "Shepherd's huts"));
        list1.add(new ItemModel(R.drawable.yurt, "Yurts"));
        list1.add(new ItemModel(R.drawable.house_boat, "Houseboats"));
        list1.add(new ItemModel(R.drawable.boat, "Boats"));
        list1.add(new ItemModel(R.drawable.gird_off, "off-the-gird"));
        list1.add(new ItemModel(R.drawable.container, "Containers"));
        list1.add(new ItemModel(R.drawable.piano, "Grand piano"));
        list1.add(new ItemModel(R.drawable.paint, "Creative spaces"));
        list1.add(new ItemModel(R.drawable.riads, "Riads"));
        list1.add(new ItemModel(R.drawable.trulli, "Trulli"));
        list1.add(new ItemModel(R.drawable.dammusos, "Dammusos"));
        list1.add(new ItemModel(R.drawable.lake_1, "Lake"));

    }
        public void addData(){
        list.add(new MainRvModel("Shanawaj hossain saju","564 kimomitar","25 jun 2031","https://www.google.com/imgres?imgurl=https%3A%2F%2Fi.ytimg.com%2Fvi%2FJkm9RdIlgX0%2Fmaxresdefault.jpg&imgrefurl=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DJkm9RdIlgX0&tbnid=cnoKVFl-EH8wLM&vet=12ahUKEwj_nbnK2p35AhWsidgFHfDoBGwQMygAegUIARDYAQ..i&docid=aCulbV3Rh9gWTM&w=1280&h=720&q=natural%20place&client=ubuntu&ved=2ahUKEwj_nbnK2p35AhWsidgFHfDoBGwQMygAegUIARDYAQ",0));
        list.add(new MainRvModel("Jomidar Bari","874 kilomitar","15july 455","https://www.google.com/imgres?imgurl=https%3A%2F%2Fi.ytimg.com%2Fvi%2FKpRHRh9PaRU%2Fmaxresdefault.jpg&imgrefurl=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DKpRHRh9PaRU&tbnid=kKPxJcJtPASe7M&vet=12ahUKEwj_nbnK2p35AhWsidgFHfDoBGwQMygMegUIARDwAQ..i&docid=A7Co-YpHWjx6MM&w=1280&h=720&q=natural%20place&client=ubuntu&ved=2ahUKEwj_nbnK2p35AhWsidgFHfDoBGwQMygMegUIARDwAQ",0));
        list.add(new MainRvModel("Chikli water park","66944 kilomitar","16july2012","https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.cnn.com%2Fcnnnext%2Fdam%2Fassets%2F150123193006-unesco-less-known-jiuzhaigou-full-169.jpg&imgrefurl=https%3A%2F%2Fwww.cnn.com%2Ftravel%2Farticle%2Fnatural-wonder-bucket-list%2Findex.html&tbnid=sTxr5knCXDrOIM&vet=12ahUKEwj_nbnK2p35AhWsidgFHfDoBGwQMygcegUIARCWAg..i&docid=Om0o_4KUWXrIfM&w=1600&h=900&q=natural%20place&client=ubuntu&ved=2ahUKEwj_nbnK2p35AhWsidgFHfDoBGwQMygcegUIARCWAg",0));
        list.add(new MainRvModel("Rangpur Zoo","56 Kilomitar","5-sep-2324","https://www.insider.com/beautiful-natural-wonders-2018-7",0));
        list.add(new MainRvModel("lfdlekjfd ","dfdfdfd","dfdfd","https://www.cntraveler.com/galleries/2015-11-27/the-50-most-beautiful-places-in-the-world",0));
        list.add(new MainRvModel("dff dfde ","dfdd d"," ddd","https://www.travelchannel.com/interests/outdoors-and-adventure/photos/top-10-natural-wonders",0));
        list.add(new MainRvModel("d eef ddf","dkjdkf e","","https://www.treehugger.com/must-see-places-in-us-for-nature-lovers-4868975",0));
        list.add(new MainRvModel("d eearerere dfda","d dfea","","https://www.cntraveler.com/galleries/2015-11-27/the-50-most-beautiful-places-in-the-world",0));
        list.add(new MainRvModel("d erefdfd dfdfearga ","dfhhtrs","","https://globalgrasshopper.com/destinations/asia/10-beautiful-places-visit-laos/",0));
        list.add(new MainRvModel("asdf fdsa","df","dfd","https://www.cntraveler.com/galleries/2015-11-27/the-50-most-beautiful-places-in-the-world",0));

    }
}