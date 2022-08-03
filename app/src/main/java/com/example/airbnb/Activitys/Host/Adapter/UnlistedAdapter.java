package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.UnlistedModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleListingLayoutBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class UnlistedAdapter extends RecyclerView.Adapter<UnlistedAdapter.viewHolder> {

    Context context;
    ArrayList<UnlistedModel> list;

    public UnlistedAdapter(Context context, ArrayList<UnlistedModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_listing_layout,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        UnlistedModel model=list.get(position);

        Picasso.get().load(model.getImage()).placeholder(R.drawable.photo1).into(holder.binding.image);
        holder.binding.name.setText(model.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleListingLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleListingLayoutBinding.bind(itemView);
        }
    }
}
