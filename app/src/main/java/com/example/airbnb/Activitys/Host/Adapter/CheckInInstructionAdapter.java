package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.CheckInInstructionModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleCheckinLayoutBinding;

import java.util.ArrayList;

public class CheckInInstructionAdapter extends RecyclerView.Adapter<CheckInInstructionAdapter.viewHolder> {


    Context context;
    ArrayList<CheckInInstructionModel> list;

    public CheckInInstructionAdapter(Context context, ArrayList<CheckInInstructionModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.simple_checkin_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        CheckInInstructionModel model=list.get(position);

        holder.binding.count.setText(model.getCount());
        holder.binding.text.setText(model.getText());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleCheckinLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            binding=SimpleCheckinLayoutBinding.bind(itemView);
        }
    }
}
