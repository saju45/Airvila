package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.airbnb.Activitys.Host.Adapter.PhotoOrderAdapter;
import com.example.airbnb.Activitys.Host.Model.CoverPhoto;
import com.example.airbnb.Activitys.Host.Model.PhotoOrderModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityChangeCoverImgBinding;

import java.util.ArrayList;

public class ChangeCoverImgActivity extends AppCompatActivity {

    ActivityChangeCoverImgBinding binding;
    ArrayList<PhotoOrderModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityChangeCoverImgBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        list=new ArrayList<>();
        addImg();


        Intent intent=getIntent();

        int value=intent.getIntExtra("order",0);

        if (intent!=null){

            if (value==1){

                //   int value=intent.getIntExtra("cover",1);
                binding.orderText.setVisibility(View.GONE);
                binding.orderDescription.setVisibility(View.GONE);
                binding.text1.setVisibility(View.VISIBLE);
                binding.text2.setVisibility(View.VISIBLE);

            }

        }

        if (intent!=null)
        {
            if (value==2){

                binding.orderText.setVisibility(View.VISIBLE);
                binding.orderDescription.setVisibility(View.VISIBLE);
                binding.text1.setVisibility(View.GONE);
                binding.text2.setVisibility(View.GONE);

            }
           // int value=intent.getIntExtra("order",1);

        }




        PhotoOrderAdapter adapter=new PhotoOrderAdapter(this,list);
        GridLayoutManager layoutManager=new GridLayoutManager(getApplicationContext(),2);
        binding.selectPhotoRv.setLayoutManager(layoutManager);
        binding.selectPhotoRv.setHasFixedSize(true);
        binding.selectPhotoRv.setAdapter(adapter);


    }
    public void addImg(){

        list.add(new PhotoOrderModel(R.drawable.photo1));
        list.add(new PhotoOrderModel(R.drawable.photo));
        list.add(new PhotoOrderModel(R.drawable.photo));
        list.add(new PhotoOrderModel(R.drawable.photo1));
        list.add(new PhotoOrderModel(R.drawable.photo));
        list.add(new PhotoOrderModel(R.drawable.photo1));
        list.add(new PhotoOrderModel(R.drawable.photo1));
        list.add(new PhotoOrderModel(R.drawable.photo));
        list.add(new PhotoOrderModel(R.drawable.photo1));
        list.add(new PhotoOrderModel(R.drawable.photo));
        list.add(new PhotoOrderModel(R.drawable.photo1));
        list.add(new PhotoOrderModel(R.drawable.photo));
        list.add(new PhotoOrderModel(R.drawable.photo1));
        list.add(new PhotoOrderModel(R.drawable.photo1));
        list.add(new PhotoOrderModel(R.drawable.photo1));
        list.add(new PhotoOrderModel(R.drawable.photo1));
        list.add(new PhotoOrderModel(R.drawable.photo1));
        list.add(new PhotoOrderModel(R.drawable.photo1));
    }
}