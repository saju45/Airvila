package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.HostingModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleHostingLayoutBinding;

import java.util.ArrayList;


public class HostingAdapter extends RecyclerView.Adapter<HostingAdapter.viewHolder>{


    Context context;
    ArrayList<HostingModel> list;

    public HostingAdapter(Context context, ArrayList<HostingModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_hosting_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        HostingModel model=list.get(position);

        holder.binding.text1.setText(model.getText1());
        holder.binding.text2.setText(model.getText2());
        holder.binding.image.setImageResource(model.getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleHostingLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleHostingLayoutBinding.bind(itemView);
        }
    }
}
