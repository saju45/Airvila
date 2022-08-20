package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.ReservationAllModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleReservationAllLayoutBinding;

import java.util.ArrayList;

public class ReservationAllAdapter extends RecyclerView.Adapter<ReservationAllAdapter.viewHolder>{

    Context context;
    ArrayList<ReservationAllModel> list;

    public ReservationAllAdapter(Context context, ArrayList<ReservationAllModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_reservation_all_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {


        ReservationAllModel model=list.get(position);
        holder.binding.requestText.setText(model.getRequest());
        holder.binding.name.setText(model.getName());
        holder.binding.date.setText(model.getDate());
        holder.binding.image.setImageResource(model.getImage());

    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleReservationAllLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleReservationAllLayoutBinding.bind(itemView);
        }
    }

}
