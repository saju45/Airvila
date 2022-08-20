package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.FromGuestsModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleFromguestLayoutBinding;

import java.util.ArrayList;

public class FromGuestAdapter extends RecyclerView.Adapter<FromGuestAdapter.viewHolder> {

    Context context;
    ArrayList<FromGuestsModel> list;

    public FromGuestAdapter(Context context, ArrayList<FromGuestsModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.simple_fromguest_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {


        FromGuestsModel model=list.get(position);

        holder.binding.image.setImageResource(model.getImage());
        holder.binding.name.setText(model.getName());
        holder.binding.date.setText(model.getDate());
        holder.binding.description.setText(model.getDescription());
        holder.binding.city.setText(model.getCity());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleFromguestLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleFromguestLayoutBinding.bind(itemView);
        }
    }
}
