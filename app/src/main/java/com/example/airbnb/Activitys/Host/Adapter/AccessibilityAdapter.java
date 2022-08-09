package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.AccessibilityModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleAccessbilityLayoutBinding;

import java.util.ArrayList;

public class AccessibilityAdapter extends RecyclerView.Adapter<AccessibilityAdapter.viewHolder>{


    Context context;
    ArrayList<AccessibilityModel> list;

    public AccessibilityAdapter(Context context, ArrayList<AccessibilityModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.simple_accessbility_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        AccessibilityModel model=list.get(position);

        holder.binding.title.setText(model.getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleAccessbilityLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleAccessbilityLayoutBinding.bind(itemView);
        }
    }
}
