package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.TipsCleaningModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleCleaningTipsBinding;

import java.util.ArrayList;

public class TipCleaningAdapter extends RecyclerView.Adapter<TipCleaningAdapter.viewHolder> {


    Context context;
    ArrayList<TipsCleaningModel> list;

    public TipCleaningAdapter(Context context, ArrayList<TipsCleaningModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_cleaning_tips,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {


        TipsCleaningModel model=list.get(position);

        holder.binding.image.setImageResource(model.getImage());
        holder.binding.text1.setText(model.getText1());
        holder.binding.text2.setText(model.getText2());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleCleaningTipsBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleCleaningTipsBinding.bind(itemView);
        }
    }
}
