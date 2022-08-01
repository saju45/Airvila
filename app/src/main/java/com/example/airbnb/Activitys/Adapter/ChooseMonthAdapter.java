package com.example.airbnb.Activitys.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Models.ChooseMonthModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleChooseMonthLayoutBinding;

import java.util.ArrayList;

public class ChooseMonthAdapter extends RecyclerView.Adapter<ChooseMonthAdapter.viewHolder> {


    Context context;
    ArrayList<ChooseMonthModel> list;

    public ChooseMonthAdapter(Context context, ArrayList<ChooseMonthModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.simple_choose_month_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        ChooseMonthModel model=list.get(position);

        holder.binding.mothText.setText(model.getMothName());
        holder.binding.yearText.setText(model.getYear());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleChooseMonthLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleChooseMonthLayoutBinding.bind(itemView);
        }
    }
}
