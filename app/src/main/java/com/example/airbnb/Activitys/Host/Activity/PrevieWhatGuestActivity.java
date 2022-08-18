package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.airbnb.Activitys.Host.customDialoag.NightCustomDialog;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityPrevieWhatGuestBinding;

public class PrevieWhatGuestActivity extends AppCompatActivity implements NightCustomDialog.NightDialogListener {

    ActivityPrevieWhatGuestBinding binding;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPrevieWhatGuestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        clickListener();

        dialog=new Dialog(this);
    }


   public void clickListener(){


        binding.nighLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDialog(1);
                Toast.makeText(PrevieWhatGuestActivity.this, "click ", Toast.LENGTH_SHORT).show();
            }
        });

        binding.guestLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDialog(2);

            }
        });

        binding.petsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDialog(3);
            }
        });
    }

    public void openDialog(int value){

      /*  NightCustomDialog dialog=new NightCustomDialog();
        dialog.show(getSupportFragmentManager(),"custom dialog");*/


        if (value==1){

            dialog.setContentView(R.layout.night_custom_dialog);
            dialog.show();

        }else if (value==2) {

            dialog.setContentView(R.layout.guests_custom_dialog);
            dialog.show();
        }else if (value==3){

                dialog.setContentView(R.layout.pets_custom_layout);
                dialog.show();
            }}

    @Override
    public void applyText(String name) {

    }
}