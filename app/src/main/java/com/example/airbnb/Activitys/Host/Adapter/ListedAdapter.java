package com.example.airbnb.Activitys.Host.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airbnb.Activitys.Host.Model.UnlistedModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.SimpleListingLayoutBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ListedAdapter extends RecyclerView.Adapter<ListedAdapter.viewHoldr>{


    Context context;
    ArrayList<UnlistedModel> list;

    public ListedAdapter(Context context, ArrayList<UnlistedModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHoldr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.simple_listing_layout,parent,false);
        return new viewHoldr(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHoldr holder, int position) {

        UnlistedModel model=list.get(position);

        Picasso.get().load(model.getImage()).placeholder(R.drawable.photo1).into(holder.binding.image);
        holder.binding.name.setText(model.getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHoldr extends RecyclerView.ViewHolder {
        SimpleListingLayoutBinding binding;
        public viewHoldr(@NonNull View itemView) {
            super(itemView);

            binding=SimpleListingLayoutBinding.bind(itemView);
        }
    }
}
