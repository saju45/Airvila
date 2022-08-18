package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.AllMessageModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleUserLayoutBinding;

import java.util.ArrayList;

public class AllMessageAdapter extends RecyclerView.Adapter<AllMessageAdapter.viewHolder>{

    Context context;
    ArrayList<AllMessageModel> list;

    public AllMessageAdapter(Context context, ArrayList<AllMessageModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_user_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        AllMessageModel model=list.get(position);

        holder.binding.requestId.setText(model.getRequest());
        holder.binding.name.setText(model.getName());
        holder.binding.event.setText(model.getEvent());
        holder.binding.date.setText(model.getDate());
        holder.binding.day.setText(model.getDay());
        holder.binding.profileImageUser.setImageResource(model.getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleUserLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleUserLayoutBinding.bind(itemView);
        }
    }
}
