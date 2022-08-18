package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.ReservationModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleUpcomingLayoutBinding;

import java.util.ArrayList;

public class ReservationAdapter extends RecyclerView.Adapter<ReservationAdapter.viewHolder>{


    Context context;
    ArrayList<ReservationModel> list;

    public ReservationAdapter(Context context, ArrayList<ReservationModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_upcoming_layout,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        ReservationModel model=list.get(position);

        holder.binding.arrivingCount.setText(model.getArrivingCount()+"");
        holder.binding.count.setText(list.size()+"");
        holder.binding.name.setText(model.getName());
        holder.binding.elegant.setText(model.getElegant());
        holder.binding.date.setText(model.getDate());
        holder.binding.profileImg.setImageResource(model.getProfile());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleUpcomingLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleUpcomingLayoutBinding.bind(itemView);
        }
    }
}
