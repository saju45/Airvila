package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.NextStepModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleNextStepLayoutBinding;

import java.util.ArrayList;

public class NextStepAdapter extends RecyclerView.Adapter<NextStepAdapter.viewHolder>{


    Context context;
    ArrayList<NextStepModel> list;

    public NextStepAdapter(Context context, ArrayList<NextStepModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_next_step_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {


        NextStepModel model=list.get(position);

        holder.binding.image.setImageResource(model.getImage());
        holder.binding.text1.setText(model.getText1());
        holder.binding.text2.setText(model.getText2());
        holder.binding.text3.setText(model.getText3());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleNextStepLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleNextStepLayoutBinding.bind(itemView);
        }
    }
}
