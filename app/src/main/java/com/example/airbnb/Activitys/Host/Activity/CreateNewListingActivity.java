package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import com.example.airbnb.Activitys.Host.Adapter.ExpandalbeAdapter;
import com.example.airbnb.Activitys.Host.Adapter.ThreeLevelListAdapter;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityCreateNewListingBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class CreateNewListingActivity extends AppCompatActivity {

    ActivityCreateNewListingBinding binding;

    List<String> listGroup;
    HashMap<String,List<String>> listDataChild;
    HashMap<String,List<String>> childMap;


    String[] parent = new String[]{"Apartment", "House", "Hotel Room","Secondary Unit","Resort","Uncommon Space"};
    String[] q1 = new String[]{"Serviced apartment", "Condo","Vacation","Rooftop"};
    String[] q2 = new String[]{"Home", "Cabin","Villa","Cottage","Bungalow","Farm House","Vacation Home"};
    String[] q3 = new String[]{"Hotel","Hostel","Lodge"};
    String[] q4=new String[]{"Entire Place","Private Room","Shared Room"};
    String[] q5=new String[]{"Entire Place","Private Room","Shared Room"};
    String[] q6=new String[]{"Tourist Boat","Cave","Earthen Home","Hut","Tent","Island Stay"};

    String[] desQ1 = new String[]{"Entire Place","Private Room","Shared Room"};
    String[] desQ12 = new String[]{"Entire Place","Private Room","Shared Room"};
    String[] desQ13=new String[]{"Entire Place","Private Room","Shared Room"};
    String[] desQ14=new String[]{"Entire Place","Private Room","Shared Room"};


    String[] desQ2 = new String[]{"Entire Place","Private Room","Shared Room"};
    String[] desQ21=new String[]{"Entire Place","Private Room","Shared Room"};
    String[] desQ22=new String[]{"Entire Place","Private Room","Shared Room"};
    String[] desQ23=new String[]{"Entire Place","Private Room","Shared Room"};
    String[] desQ24=new String[]{"Entire Place","Private Room","Shared Room"};
    String[] desQ25=new String[]{"Entire Place","Private Room","Shared Room"};
    String[] desQ26=new String[]{"Entire Place","Private Room","Shared Room"};


    String[] desQ3=new String[]{"Entire Place","Private Room","Shared Room"};
    String[] desQ31=new String[]{"Entire Place","Private Room","Shared Room"};
    String[] desQ32=new String[]{"Entire Place","Private Room","Shared Room"};


    String[] des4 = new String[]{"Entire Place","Private Room","Shared Room"};
    String[] des5 = new String[]{"Entire Place","Private Room","Shared Room"};

    LinkedHashMap<String, String[]> thirdLevelq1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelq2 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelq3 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelq4 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelq5= new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelq6= new LinkedHashMap<>();

    /**
     * Second level array list
     */
    List<String[]> secondLevel = new ArrayList<>();
    /**
     * Inner level data
     */
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    private ExpandalbeAdapter adapter;
    private int isExpanded=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCreateNewListingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setUpAdapter();
       // preparingListData();

      /*  adapter=new ExpandalbeAdapter(this,listGroup,listDataChild);
        binding.expandableList.setAdapter(adapter);

        binding.expandableList.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {

                String groupName=listGroup.get(groupPosition);

                return false;
            }
        });

        binding.expandableList.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {

                String groupName=listGroup.get(groupPosition);

            }
        });

        binding.expandableList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {


                String childName=listDataChild.get(listGroup.get(groupPosition)).get(childPosition);

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

*/



    }

    public void preparingListData(){

    //    String[] groupString=getResources().getStringArray(R.array.create_listing_group);
      //  String[] childString=getResources().getStringArray(R.array.create_listing_header_apartment);

        listGroup=new ArrayList<>();
        listDataChild=new HashMap<>();

        listGroup.add("Shanawaj hossain");
        List<String> shanwaj=new ArrayList<>();
        shanwaj.add("shanwaj hossain saju");
        shanwaj.add("shuvo");
        shanwaj.add("Raju");
        shanwaj.add("Partho");
        shanwaj.add("Meraj");

        listDataChild.put(listGroup.get(0),shanwaj);


    }

    private void setUpAdapter() {

        secondLevel.add(q1);
        secondLevel.add(q2);
        secondLevel.add(q3);
        secondLevel.add(q4);
        secondLevel.add(q5);
        secondLevel.add(q6);

        thirdLevelq1.put(q1[0], desQ1);
        thirdLevelq1.put(q1[1], desQ12);
        thirdLevelq1.put(q1[2],desQ13);
        thirdLevelq1.put(q1[3],desQ14);

        thirdLevelq2.put(q2[0], desQ2);
        thirdLevelq2.put(q2[1], desQ21);
        thirdLevelq2.put(q2[2], desQ22);
        thirdLevelq2.put(q2[3], desQ23);
        thirdLevelq2.put(q2[4], desQ24);
        thirdLevelq2.put(q2[5], desQ25);
        thirdLevelq2.put(q2[6], desQ26);


        thirdLevelq3.put(q3[0],desQ3);
        thirdLevelq3.put(q3[1],desQ31);
        thirdLevelq3.put(q3[2],desQ32);


        thirdLevelq6.put(q6[0], desQ2);
        thirdLevelq6.put(q6[1], desQ21);
        thirdLevelq6.put(q6[2], desQ22);
        thirdLevelq6.put(q6[3], desQ23);
        thirdLevelq6.put(q6[4], desQ24);
        thirdLevelq6.put(q6[5], desQ25);

        // thirdLevelq4.put(q4[0],desQ2);
     //   thirdLevelq2.put(q2[1], des4);

        thirdLevelq3.put(q3[0], des5);

        data.add(thirdLevelq1);
        data.add(thirdLevelq2);
        data.add(thirdLevelq3);
        data.add(thirdLevelq4);
        data.add(thirdLevelq5);
        data.add(thirdLevelq6);
       // expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);
        //passing three level of information to constructor

        ThreeLevelListAdapter threeLevelListAdapterAdapter = new ThreeLevelListAdapter(this, parent, secondLevel, data);
        binding.expandableList.setAdapter(threeLevelListAdapterAdapter);
        binding.expandableList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousGroup = -1;

            @Override
            public void onGroupExpand(int groupPosition) {
                if (groupPosition != previousGroup)

                    binding.expandableList.collapseGroup(previousGroup);
                     previousGroup = groupPosition;
            }
        });


    }

}