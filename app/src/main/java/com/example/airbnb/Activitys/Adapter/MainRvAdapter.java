package com.example.airbnb.Activitys.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Activity.DetailsActivity;
import com.example.airbnb.Activitys.Models.MainRvModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityDetailsBinding;
import com.example.airbnb.databinding.SimpleMainRvBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainRvAdapter extends RecyclerView.Adapter<MainRvAdapter.viewHolder> {

    Context context;
    ArrayList<MainRvModel> list;

    public MainRvAdapter(Context context, ArrayList<MainRvModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.simple_main_rv,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        MainRvModel model=list.get(position);
        Picasso.get().load(model.getImage()).placeholder(R.drawable.photo1).into(holder.binding.image1);
        holder.binding.name.setText(model.getName());
        holder.binding.date.setText(model.getDate());
        holder.binding.price.setText(model.getPrice()+"");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, DetailsActivity.class);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleMainRvBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleMainRvBinding.bind(itemView);
        }
    }
}
