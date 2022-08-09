package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.CancellationPolicyModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleCancellationPolicyBinding;


import java.util.ArrayList;

public class CancellationPolicyAdapter extends RecyclerView.Adapter<CancellationPolicyAdapter.viewHolder> {


    Context context;
    ArrayList<CancellationPolicyModel> list;

    public CancellationPolicyAdapter(Context context, ArrayList<CancellationPolicyModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_cancellation_policy,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        CancellationPolicyModel model=list.get(position);

        String header=model.getHeader();



        if (header.isEmpty())
        {
            holder.binding.header.setVisibility(View.GONE);
            holder.binding.headerDescription.setVisibility(View.GONE);
            holder.binding.title.setText(model.getTitle());
            holder.binding.titleDescription.setText(model.getTitleDes());
        }else if (!header.isEmpty()){

            holder.binding.header.setVisibility(View.VISIBLE);
            holder.binding.headerDescription.setVisibility(View.VISIBLE);
            holder.binding.header.setText(model.getHeader());
            holder.binding.headerDescription.setText(model.getHeaderDes());
            holder.binding.title.setText(model.getTitle());
            holder.binding.titleDescription.setText(model.getTitleDes());
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleCancellationPolicyBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleCancellationPolicyBinding.bind(itemView);
        }
    }
}
