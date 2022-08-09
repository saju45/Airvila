package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.CurrencyModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleCurrencyLayoutBinding;

import java.util.ArrayList;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.viewHolder>{

    Context context;
    ArrayList<CurrencyModel> list;

    public CurrencyAdapter(Context context, ArrayList<CurrencyModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.simple_currency_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        CurrencyModel model=list.get(position);

        holder.binding.countryName.setText(model.getCounty());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class  viewHolder extends RecyclerView.ViewHolder {
        SimpleCurrencyLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleCurrencyLayoutBinding.bind(itemView);
        }
    }
}
