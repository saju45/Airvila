package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.airbnb.Activitys.Host.Adapter.CurrencyAdapter;
import com.example.airbnb.Activitys.Host.Model.CurrencyModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityCurrencyBinding;

import java.util.ArrayList;

public class CurrencyActivity extends AppCompatActivity {

    ActivityCurrencyBinding binding;
    ArrayList<CurrencyModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCurrencyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=new ArrayList<>();
        addItem();

        CurrencyAdapter adapter=new CurrencyAdapter(this,list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        binding.currencyRv.setLayoutManager(layoutManager);
        binding.currencyRv.setHasFixedSize(true);
        binding.currencyRv.setAdapter(adapter);

    }

    public void addItem(){


        list.add(new CurrencyModel("United Stated dollar($)"));
        list.add(new CurrencyModel("Argentine peso($)"));
        list.add(new CurrencyModel("Australian dollar($)"));
        list.add(new CurrencyModel("Brazilian real(R$)"));
        list.add(new CurrencyModel("Bulgarian lev(лв.)"));
        list.add(new CurrencyModel("Canadian dollar($)"));
        list.add(new CurrencyModel("Chilean peso($)" ));
        list.add(new CurrencyModel("Chinese yuan(¥)"));
        list.add(new CurrencyModel("Colombian peso($)"));
        list.add(new CurrencyModel("Costa Rican colon(₡)"));
        list.add(new CurrencyModel("Croatian kuna (kn)"));
        list.add(new CurrencyModel("Czech koruna (Kč)"));
        list.add(new CurrencyModel("Danish krone(kr)"));
        list.add(new CurrencyModel("Emirati dirham(د.إ)"));
        list.add(new CurrencyModel("Euro(₡)"));
        list.add(new CurrencyModel("Hong kong dollar($)"));
        list.add(new CurrencyModel("Hungarian forint(Ft)"));
        list.add(new CurrencyModel("Indonesian rupiah(Rp)"));
        list.add(new CurrencyModel("Israeli new shekel(₪)"));
        list.add(new CurrencyModel("Japanese yen(¥)"));
        list.add(new CurrencyModel("Malaysian ringgit(RM)"));
        list.add(new CurrencyModel("Mexican peso($)"));
        list.add(new CurrencyModel("Moroccan dirham (MAD)"));
        list.add(new CurrencyModel("New Taiwan dollar($)"));
        list.add(new CurrencyModel("New Zealand dollar($)"));
        list.add(new CurrencyModel("Norwegian krone (kr)"));
        list.add(new CurrencyModel("Peruvian sol(S/)"));
        list.add(new CurrencyModel("Philippine peso(₱)"));
        list.add(new CurrencyModel("Polish zloty (zł)"));
        list.add(new CurrencyModel("Pound sterling (₡)"));
        list.add(new CurrencyModel("Romanian leu(lei)"));
        list.add(new CurrencyModel("Saudi Arabian riyal (SR)"));
        list.add(new CurrencyModel("Singapore dollar ($)"));
        list.add(new CurrencyModel("South African rang (R)"));
        list.add(new CurrencyModel("South korean won (₩)"));
        list.add(new CurrencyModel("Swiss franc (CHF)"));
        list.add(new CurrencyModel("Thai baht (฿)"));
        list.add(new CurrencyModel("Turkish lira (₺)"));
        list.add(new CurrencyModel("Ukrainian hryvnia (₴)"));
        list.add(new CurrencyModel("Uruguayan peso ($U)"));
        list.add(new CurrencyModel("Vietnamese dong (₫)"));




    }
}