package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.BestDescripPlaceModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleBestPlaceLayoutBinding;

import java.util.ArrayList;
import java.util.concurrent.RecursiveAction;

public class BestDescriptionPlaceAdapter extends RecyclerView.Adapter<BestDescriptionPlaceAdapter.viewHolder> {

    Context context;
    ArrayList<BestDescripPlaceModel>list;

    public BestDescriptionPlaceAdapter(Context context, ArrayList<BestDescripPlaceModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_best_place_layout,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        BestDescripPlaceModel model=list.get(position);
        holder.binding.name.setText(model.getName());
        holder.binding.description.setText(model.getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleBestPlaceLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleBestPlaceLayoutBinding.bind(itemView);
        }
    }

}
