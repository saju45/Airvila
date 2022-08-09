package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.ScenicViewmodel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleScenicBinding;

import java.util.ArrayList;

public class ScenicViewAdapter extends RecyclerView.Adapter<ScenicViewAdapter.viewHolder> {

    Context context;
    ArrayList<ScenicViewmodel> list;

    public ScenicViewAdapter(Context context, ArrayList<ScenicViewmodel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_scenic,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        ScenicViewmodel model=list.get(position);

        String header=model.getHearder();
        if (header.isEmpty())
        {
            holder.binding.header.setVisibility(View.GONE);
            holder.binding.headerDescription.setVisibility(View.GONE);
            holder.binding.title.setText(model.getTitle());
        }else {
            holder.binding.title.setText(model.getTitle());
            holder.binding.header.setVisibility(View.VISIBLE);
            holder.binding.headerDescription.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleScenicBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleScenicBinding.bind(itemView);
        }
    }
}
