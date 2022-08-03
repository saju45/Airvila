package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.PlaceOfferModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimplePlaceOfferLayoutBinding;

import java.util.ArrayList;

public class PlaceOfferAdapter extends RecyclerView.Adapter<PlaceOfferAdapter.viewHolder> {

    Context context;
    ArrayList<PlaceOfferModel> list;

    public PlaceOfferAdapter(Context context, ArrayList<PlaceOfferModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_place_offer_layout,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        PlaceOfferModel model=list.get(position);

        holder.binding.image.setImageResource(model.getImage());
        holder.binding.name.setText(model.getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimplePlaceOfferLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimplePlaceOfferLayoutBinding.bind(itemView);
        }
    }
}
