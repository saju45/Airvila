package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.UserListingModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleNameListingLayoutBinding;

import java.util.ArrayList;

public class UserListingAdapter extends RecyclerView.Adapter<UserListingAdapter.viewHolder>{



    Context context ;
    ArrayList<UserListingModel> list;

    public UserListingAdapter(Context context, ArrayList<UserListingModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_name_listing_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {


        UserListingModel model=list.get(position);

        holder.binding.bedCount.setText(model.getCount()+"");
        holder.binding.image.setImageResource(model.getImage());
        holder.binding.location.setText(model.getLocation());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleNameListingLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleNameListingLayoutBinding.bind(itemView);
        }
    }
}
