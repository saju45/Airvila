package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.SettingModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleSettingLayoutBinding;

import java.util.ArrayList;

public class SettingAdapter  extends RecyclerView.Adapter<SettingAdapter.viewHolder>{

    Context context;
    ArrayList<SettingModel> list;

    public SettingAdapter(Context context, ArrayList<SettingModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.simple_setting_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {


        SettingModel model=list.get(position);

        holder.binding.profileImg.setImageResource(model.getImage());
        holder.binding.editProfile.setText(model.getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleSettingLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleSettingLayoutBinding.bind(itemView);
        }
    }
}
