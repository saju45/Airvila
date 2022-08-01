package com.example.airbnb.Activitys.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.airbnb.Activitys.Adapter.SearchImageAdapter;
import com.example.airbnb.Activitys.Models.SearchImageModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivitySearchBinding;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    ActivitySearchBinding binding;
    ArrayList<SearchImageModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=new ArrayList<>();
        addData();

        SearchImageAdapter adapter=new SearchImageAdapter(this,list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        binding.searchImgRv.setLayoutManager(layoutManager);
        binding.searchImgRv.setHasFixedSize(true);
        binding.searchImgRv.setAdapter(adapter);


        binding.cardWhen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),WhenStayActivity.class));
            }
        });

        binding.cardWho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SearchActivity.this,StayWhoActivity.class));
            }
        });



    }

    public void addData(){


        list.add(new SearchImageModel("I;m flexible","https://www.freeworldmaps.net/printable/europe/"));
        list.add(new SearchImageModel("Europe","https://www.istockphoto.com/photos/europe-map"));
        list.add(new SearchImageModel("Canada","https://www.google.com/imgres?imgurl=https%3A%2F%2Fimage.shutterstock.com%2Fz%2Fstock-vector-simple-map-of-canada-210789760.jpg&imgrefurl=https%3A%2F%2Fwww.shutterstock.com%2Fimage-vector%2Fsimple-map-canada-210789760&tbnid=xud9vVBExF4uQM&vet=12ahUKEwjsr9mJo6D5AhXiS3wKHZ5QDJcQMygNegUIARCOAg..i&docid=XrdFrcToekaktM&w=1500&h=1314&q=canada%20map&hl=en&client=ubuntu&ved=2ahUKEwjsr9mJo6D5AhXiS3wKHZ5QDJcQMygNegUIARCOAg"));
        list.add(new SearchImageModel("Southeast Asia","https://en.m.wikipedia.org/wiki/File:Location_Map_Asia.svg"));
        list.add(new SearchImageModel("United Kingdom","https://www.istockphoto.com/illustrations/uk-map"));
        list.add(new SearchImageModel("United States","https://www.google.com/imgres?imgurl=https%3A%2F%2Fimage.shutterstock.com%2Fimage-vector%2Fsimple-usa-map-260nw-392883898.jpg&imgrefurl=https%3A%2F%2Fwww.shutterstock.com%2Fimage-vector%2Fsimple-usa-map-392883898&tbnid=vKc9wkzftWt50M&vet=12ahUKEwjz9uHQo6D5AhVAi9gFHc4yB2EQMygVegUIARCaAg..i&docid=FsQsgWta2-WL-M&w=390&h=280&q=us%20map&hl=en&client=ubuntu&ved=2ahUKEwjz9uHQo6D5AhVAi9gFHc4yB2EQMygVegUIARCaAg"));


    }
}