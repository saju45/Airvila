package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.HostingUpdatesModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleHostingUpdateLayoutBinding;

import java.util.ArrayList;

public class HostingUpdateAdapter extends RecyclerView.Adapter<HostingUpdateAdapter.viewHolder> {

    Context context;
    ArrayList<HostingUpdatesModel> list;

    public HostingUpdateAdapter(Context context, ArrayList<HostingUpdatesModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_hosting_update_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        HostingUpdatesModel model=list.get(position);

        holder.binding.image.setImageResource(model.getImage());
        holder.binding.text1.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleHostingUpdateLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleHostingUpdateLayoutBinding.bind(itemView);
        }
    }
}
