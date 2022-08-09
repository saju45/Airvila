package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.SafetyPropertyModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleSafetyPropertyLayoutBinding;

import java.util.ArrayList;

public class SafetyPropertyAdapter extends RecyclerView.Adapter<SafetyPropertyAdapter.viewHolder> {


    Context context;
    ArrayList<SafetyPropertyModel> list;

    public SafetyPropertyAdapter(Context context, ArrayList<SafetyPropertyModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_safety_property_layout,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        SafetyPropertyModel model=list.get(position);
        String layout=model.getLayout();
        String headerDescription=model.getHeaderDescription();
        String learMore=model.getLearMore();

        if (!layout.isEmpty())
        {
            holder.binding.learMore.setVisibility(View.GONE);
            holder.binding.learView.setVisibility(View.GONE);
            holder.binding.layout1.setVisibility(View.VISIBLE);
            holder.binding.header.setText(model.getHeader());
            holder.binding.headerDescription.setText(model.getHeaderDescription());
            holder.binding.title.setText(model.getTitle());
            holder.binding.titleDescription.setText(model.getTitleDescription());

        }else if (headerDescription.isEmpty())
        {
            holder.binding.layout1.setVisibility(View.GONE);
            holder.binding.headerDescription.setVisibility(View.GONE);
            holder.binding.title.setText(model.getTitle());
            holder.binding.titleDescription.setText(model.getTitleDescription());

        }else if (learMore.isEmpty())
        {
            holder.binding.learMore.setVisibility(View.GONE);
            holder.binding.learView.setVisibility(View.GONE);
            holder.binding.title.setText(model.getTitle());
            holder.binding.titleDescription.setText(model.getTitleDescription());
            holder.binding.header.setText(model.getHeader());


        }else if (!learMore.isEmpty())
        {
            holder.binding.learMore.setVisibility(View.VISIBLE);
            holder.binding.learView.setVisibility(View.VISIBLE);
            holder.binding.title.setText(model.getTitle());
            holder.binding.header.setText(model.getHeader());
            holder.binding.headerDescription.setText(model.getHeaderDescription());

        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleSafetyPropertyLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleSafetyPropertyLayoutBinding.bind(itemView);
        }
    }
}
