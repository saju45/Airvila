package com.example.airbnb.Activitys.Host.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Host.Adapter.BestDescriptionPlaceAdapter;
import com.example.airbnb.Activitys.Host.Model.BestDescripPlaceModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentBestDescribePlaceragmentBinding;

import java.util.ArrayList;


public class BestDescribePlaceragment extends Fragment {


    FragmentBestDescribePlaceragmentBinding binding;
    ArrayList<BestDescripPlaceModel> list;

    public BestDescribePlaceragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentBestDescribePlaceragmentBinding.inflate(inflater, container, false);

        list=new ArrayList<>();

        addData();

        BestDescriptionPlaceAdapter adapter=new BestDescriptionPlaceAdapter(getContext(),list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        binding.bestPlaceRv.setLayoutManager(layoutManager);
        binding.bestPlaceRv.setHasFixedSize(true);
        binding.bestPlaceRv.setAdapter(adapter);

        return binding.getRoot();
    }
    public void addData(){


        list.add(new BestDescripPlaceModel("Born","A converted space in a building used at any time for grain, livestock, of farming."));
        list.add(new BestDescripPlaceModel("Boat","A boat, sailboat, or yacht moored during guest visits, Not a houseboat."));
        list.add(new BestDescripPlaceModel("Bus","A converted multi-passenger vehicle with a creatively reimagined interior."));
        list.add(new BestDescripPlaceModel("Camper/RV","A motorhome or camping trailer that's half-home and half-vehicle."));
        list.add(new BestDescripPlaceModel("Treehouse","A dwelling built into the trunk or branches of a tree, or sitting on stilts among trees."));
        list.add(new BestDescripPlaceModel("campsite","An area of land where guests can set up a tent, yurt, Rv,or tiny house"));
        list.add(new BestDescripPlaceModel("castle","A majestic, possibly historical building that may have towers and moats."));
        list.add(new BestDescripPlaceModel("cave","A natural or carved dwelling on in a hillside or cliff."));
        list.add(new BestDescripPlaceModel("Dome","A home with a domed roof oor spherical shape,such as a bubble home"));
        list.add(new BestDescripPlaceModel("Earthen home","A home built in the ground or made from materials like rammed earth."));
        list.add(new BestDescripPlaceModel("Farm stay","A rural stay where guests may spend time in an agricultural setting or with animals."));
        list.add(new BestDescripPlaceModel("Holiday park","A plot of land with cabins or campsites in Australia or New Zealand."));
        list.add(new BestDescripPlaceModel("Houseboat","A floating home constructed from similar material as a land based home."));
        list.add(new BestDescripPlaceModel("Hut","A home made of wood or mud that may have a thatched straw roof."));
        list.add(new BestDescripPlaceModel("Ice home","A dome shaped structure made of snow and ice-found in cold climates."));
        list.add(new BestDescripPlaceModel("Island ","A piece of land surrounded by water."));
        list.add(new BestDescripPlaceModel("Lighthouse","A tower near water with a bright light used at any point to help guide ships."));
        list.add(new BestDescripPlaceModel("Plane ","An aircraft that's been converted into a place to stay."));
        list.add(new BestDescripPlaceModel("Ranch ","A home on a large area of land used to raise livestock."));
        list.add(new BestDescripPlaceModel("Religious building","A converted space in a former place of worship like a church or mosque"));
        list.add(new BestDescripPlaceModel("Shepherd's hut"," A tiny wagon on wheels originally used to follow sheep herds"));
        list.add(new BestDescripPlaceModel("Shipping container","A converted steel container once used to transport goods."));
        list.add(new BestDescripPlaceModel("Tent ","A usually portable table, collapsible structure made from fabric and poles."));
        list.add(new BestDescripPlaceModel("Tiny home","A stand -alone house that's usually less than 400 square feet."));
        list.add(new BestDescripPlaceModel("Tipi ","A cone-shaped tent supported by poles with a flap door and open top"));
        list.add(new BestDescripPlaceModel("Tower A free standing structure that's several stories tall with a view.",""));
        list.add(new BestDescripPlaceModel("Train","A caboose, boxcar or other railroad car converted to a living space"));
        list.add(new BestDescripPlaceModel("Windmill","A living space in a structure used at any point to generate wind power"));
        list.add(new BestDescripPlaceModel("Yurt ","A round tent built on a collapsible wooden framework."));
        list.add(new BestDescripPlaceModel("Riad","A traditional home with an open-air countryard or garden in Morocco."));
        list.add(new BestDescripPlaceModel("Pension","A house with a barbeque and communal space in the country side of korea."));
        list.add(new BestDescripPlaceModel("Vacation home","A furnished rental property that includes a kitchen and bathroom and may offer some guest services, like a reception desk."));



    }
}