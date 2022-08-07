package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.airbnb.Activitys.Host.Adapter.PhotoOrderAdapter;
import com.example.airbnb.Activitys.Host.Model.PhotoOrderModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityPhotoBinding;

import java.util.ArrayList;

public class PhotoActivity extends AppCompatActivity {

    ActivityPhotoBinding binding;
    ArrayList<PhotoOrderModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPhotoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        clickListener();
        list=new ArrayList<>();
        addImg();

        PhotoOrderAdapter adapter=new PhotoOrderAdapter(this,list);
        GridLayoutManager layoutManager=new GridLayoutManager(PhotoActivity.this,2);
        binding.orderPhotoRv.setLayoutManager(layoutManager);
        binding.orderPhotoRv.setHasFixedSize(true);
        binding.orderPhotoRv.setAdapter(adapter);

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

    public void clickListener(){

        binding.changeCoverImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                binding.changeCoverImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(PhotoActivity.this,ChangeCoverImgActivity.class);
                        intent.putExtra("order",1);
                        startActivity(intent);
                    }
                });

                binding.changeOrderPhoto.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(PhotoActivity.this,ChangeCoverImgActivity.class);
                        intent.putExtra("order",2);
                        startActivity(intent);
                    }
                });
            }
        });

    }
}