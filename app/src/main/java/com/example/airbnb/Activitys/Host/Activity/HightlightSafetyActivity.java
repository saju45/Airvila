package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.airbnb.Activitys.Host.Adapter.SafetyPropertyAdapter;
import com.example.airbnb.Activitys.Host.Model.SafetyPropertyModel;
import com.example.airbnb.databinding.ActivityHightlightSafetyBinding;

import java.util.ArrayList;

public class HightlightSafetyActivity extends AppCompatActivity {

    ActivityHightlightSafetyBinding binding;
    ArrayList<SafetyPropertyModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHightlightSafetyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=new ArrayList<>();
        addItem();

        SafetyPropertyAdapter adapter=new SafetyPropertyAdapter(this,list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        binding.safetyPropertyRv.setLayoutManager(layoutManager);
        binding.safetyPropertyRv.setHasFixedSize(true);
        binding.safetyPropertyRv.setAdapter(adapter);


    }

    public void addItem(){

        list.add(new SafetyPropertyModel("dk","Safety considerations","Response required","Pool/hot tub without a gate or lock","Guests will have direct access to an ungated / unlocked in-ground or above-ground swimming pool or hot tub.",""));
        list.add(new SafetyPropertyModel("","","","Nearby lake, river, other body or water","Guests will have direct, unrestricted access to any permanent natural or artificial body of water located directly on or next to the property. Ex: ocean/beach, pond, creek, wetlands.",""));
        list.add(new SafetyPropertyModel("","","","Climbing or play structure","Guests (including children) will have access to structures or items intended for climbing or playing on,Ex: swing, slide, playset, climbing ropes, ",""));
        list.add(new SafetyPropertyModel("","","","Heights without rails or protection","Guests will have access to an area or structure that reaches a height or more than 1.4 meters/4.6 feet and does not have a rail or other protection Ex:  balcony, roof,terrace.",""));
        list.add(new SafetyPropertyModel("","","","Potentially dangerous animal","Guests(and their pets) will be around or near wide or domesticated animals that could cause harm because of their behavior or size. Ex: horse, mountain lion, dog that growls or bites.","dkd"));
        list.add(new SafetyPropertyModel("","Safety devices","","Security Cameras/audio recording devices","The property has a security camera or recoding device capable of recording or sending video, audio or still images. Airbnb requires hosts to inform guests of nay such camera or device located in a common area even if will be turned off during a guests stay. Airbnb prohibits security cameras or recording devices in private spaces like bedroom bathroom, or sleeping areas. ","kddk"));
        list.add(new SafetyPropertyModel("","","","Carbon","The property has an alarm about the detects and warns about the presence of carbon monoxide ga. Check your local laws for specific requirements","dk"));
        list.add(new SafetyPropertyModel("","","","Smoke alarm","The property has an alarm that detects and warns about the presence of smoke and fire. Check your local laws for specific requirements",""));
        list.add(new SafetyPropertyModel("","Property info","","Must climb stairs","Guests can expect to walk up and down stairs during their stay.",""));
        list.add(new SafetyPropertyModel("","","","Potential for noise ","Guests can expect to hear some noise during their stay. Ex: traffic construction, nearby businesses.",""));
        list.add(new SafetyPropertyModel("","","","Pet(s) live on property","Guests may come across pets and experience a little animal love during their stay.",""));
        list.add(new SafetyPropertyModel("","","","Some spaces are shared","Guests can expect to share spaces with other people during their stay. Ex: kitchen, bathroom, patio.",""));
        list.add(new SafetyPropertyModel("","","","Amenity limitation","Guests shouldn't expect some essential they may be used to having when traveling Ex: wifi, running water, indoor shower.",""));
        list.add(new SafetyPropertyModel("","","","Weapons or property","Guests should be aware that there is at least one weapon stored on this property. Airbnb requires all weapons to be properly stored and secured","dkd"));


    }
}