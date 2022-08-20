package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.CleaningListModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleCleaningListLayoutBinding;

import java.util.ArrayList;

public class CleaningListAdapter extends RecyclerView.Adapter<CleaningListAdapter.viewHolder> {


    Context context;
    ArrayList<CleaningListModel> list;

    public CleaningListAdapter(Context context, ArrayList<CleaningListModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_cleaning_list_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        CleaningListModel model=list.get(position);

        holder.binding.image.setImageResource(model.getImage());
        holder.binding.text1.setText(model.getText1());
        holder.binding.text2.setText(model.getText2());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleCleaningListLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleCleaningListLayoutBinding.bind(itemView);
        }
    }
}
