package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityDescriptionBinding;
import com.example.airbnb.databinding.ActivityDetailsBinding;

public class DescriptionActivity extends AppCompatActivity {

    ActivityDescriptionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDescriptionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        clickListener();

    }

    public void clickListener(){


        binding.summaryLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(DescriptionActivity.this,ListTitleActivity.class);
                intent.putExtra("key",1);
                startActivity(intent);

            }
        });

        binding.spaceLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(DescriptionActivity.this,ListTitleActivity.class);
                intent.putExtra("key",2);
                startActivity(intent);


            }
        });
        binding.guestLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(DescriptionActivity.this,ListTitleActivity.class);
                intent.putExtra("key",3);
                startActivity(intent);


            }
        });

        binding.guestInteractionLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(DescriptionActivity.this,ListTitleActivity.class);
                intent.putExtra("key",4);
                startActivity(intent);


            }
        });

        binding.otherNotesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(DescriptionActivity.this,ListTitleActivity.class);
                intent.putExtra("key",5);
                startActivity(intent);


            }
        });


        binding.overviewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(DescriptionActivity.this,ListTitleActivity.class);
                intent.putExtra("key",6);
                startActivity(intent);


            }
        });

        binding.gettingAroundLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(DescriptionActivity.this,ListTitleActivity.class);
                intent.putExtra("key",7);
                startActivity(intent);



            }
        });

    }

}