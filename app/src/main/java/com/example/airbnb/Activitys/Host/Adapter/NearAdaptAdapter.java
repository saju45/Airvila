package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.NearAdaptModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleNearAdaptLayoutBinding;

import java.util.ArrayList;

public class NearAdaptAdapter extends RecyclerView.Adapter<NearAdaptAdapter.viewHolder> {

    Context context;
    ArrayList<NearAdaptModel> list;


    public NearAdaptAdapter(Context context, ArrayList<NearAdaptModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_near_adapt_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {


        NearAdaptModel model=list.get(position);

        holder.binding.image.setImageResource(model.getImage());
        holder.binding.amenities.setText(model.getText2());
        holder.binding.downProgress.setText(model.getDownCounter()+"");
        holder.binding.upProgress.setText(model.getUpCounter()+"");
        holder.binding.popular.setText(model.getText1());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleNearAdaptLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleNearAdaptLayoutBinding.bind(itemView);
        }
    }
}
