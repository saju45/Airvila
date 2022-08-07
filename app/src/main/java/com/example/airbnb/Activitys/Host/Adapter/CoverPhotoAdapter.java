package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.CoverPhoto;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleCoverImgLayoutBinding;

import java.util.ArrayList;

public class CoverPhotoAdapter extends RecyclerView.Adapter<CoverPhotoAdapter.viewHolder> {

    Context context;
    ArrayList<CoverPhoto> list;

    public CoverPhotoAdapter(Context context, ArrayList<CoverPhoto> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_cover_img_layout,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        CoverPhoto model=list.get(position);

        holder.binding.img.setImageResource(model.getImg());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        SimpleCoverImgLayoutBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SimpleCoverImgLayoutBinding.bind(itemView);
        }
    }
}
