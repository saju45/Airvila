package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.ElegantModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleElegantLayoutBinding;

import java.util.ArrayList;

public class ElegantAdapter extends RecyclerView.Adapter<ElegantAdapter.viewHolder> {


    Context context;
    ArrayList<ElegantModel> list;

    public ElegantAdapter(Context context, ArrayList<ElegantModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_elegant_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        ElegantModel model=list.get(position);

        holder.binding.check.setText(model.getChek());
        holder.binding.name.setText(model.getName());
        holder.binding.guestCount.setText(model.getGuestCount()+"");
        holder.binding.nightCount.setText(model.getNightCount()+"");
        holder.binding.profileImageUser.setImageResource(model.getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleElegantLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleElegantLayoutBinding.bind(itemView);
        }
    }
}
