package com.example.airbnb.Activitys.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Models.SpecialityItemModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleSpecialityItemBinding;

import java.util.ArrayList;

public class SpecialityItemAdapter extends RecyclerView.Adapter<SpecialityItemAdapter.viewHolder>{

    Context context;
    ArrayList<SpecialityItemModel> list;

    public SpecialityItemAdapter(Context context, ArrayList<SpecialityItemModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_speciality_item,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {


        SpecialityItemModel model=list.get(position);

        holder.binding.name.setText(model.getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleSpecialityItemBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleSpecialityItemBinding.bind(itemView);
        }
    }
}
