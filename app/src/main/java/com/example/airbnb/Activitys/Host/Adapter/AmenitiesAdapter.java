package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.AmenitiesModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleAmenitiesLayoutBinding;

import java.util.ArrayList;

public class AmenitiesAdapter extends RecyclerView.Adapter<AmenitiesAdapter.viewHolder> {


    Context context;
    ArrayList<AmenitiesModel> list;

    public AmenitiesAdapter(Context context, ArrayList<AmenitiesModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_amenities_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        AmenitiesModel model=list.get(position);

        String header=model.getHeader();
        String description=model.getDescription();
        String addText=model.getAddDetails();



/*

        if (header.isEmpty())
        {
            holder.binding.headed.setVisibility(View.GONE);

        }else if (description.isEmpty())
        {
            holder.binding.description.setVisibility(View.GONE);
        }else if (addText.isEmpty())
        {
            holder.binding.addDetails.setVisibility(View.GONE);
            holder.binding.addView.setVisibility(View.GONE);
        }else {

            holder.binding.title.setText(model.getTitle());
            holder.binding.headed.setText(model.getHeader());
            holder.binding.description.setText(model.getDescription());
        }
*/




        if (header.isEmpty())
        {
            holder.binding.headed.setVisibility(View.GONE);
        }else {
            holder.binding.headed.setVisibility(View.VISIBLE);
            holder.binding.title.setText(model.getTitle());
            holder.binding.headed.setText(model.getHeader());
        }

    if (description.isEmpty())
        {
            holder.binding.title.setText(model.getTitle());
            holder.binding.description.setVisibility(View.GONE);

        }else {

        holder.binding.description.setVisibility(View.VISIBLE);
        holder.binding.description.setText(model.getDescription());
    }
     if (addText.isEmpty())
        {
            holder.binding.addDetails.setVisibility(View.GONE);
            holder.binding.addView.setVisibility(View.GONE);
            holder.binding.title.setText(model.getTitle());
            holder.binding.description.setText(model.getDescription());
        }else {

         holder.binding.addDetails.setVisibility(View.VISIBLE);
         holder.binding.addView.setVisibility(View.VISIBLE);

     }



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleAmenitiesLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleAmenitiesLayoutBinding.bind(itemView);
        }
    }
}
