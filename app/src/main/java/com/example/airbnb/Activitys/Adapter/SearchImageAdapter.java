package com.example.airbnb.Activitys.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Models.SearchImageModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleSearchImageLayoutBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SearchImageAdapter extends RecyclerView.Adapter<SearchImageAdapter.viewHolder>{


    Context context;
    ArrayList<SearchImageModel> list;

    public SearchImageAdapter(Context context, ArrayList<SearchImageModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_search_image_layout,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        SearchImageModel model=list.get(position);

        Picasso.get().load(model.getImage()).placeholder(R.drawable.photo1).into(holder.binding.image);
        holder.binding.name.setText(model.getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleSearchImageLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            binding=SimpleSearchImageLayoutBinding.bind(itemView);
        }
    }
}
