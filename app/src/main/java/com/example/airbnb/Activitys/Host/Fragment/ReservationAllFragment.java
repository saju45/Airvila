package com.example.airbnb.Activitys.Host.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.airbnb.Activitys.Host.Adapter.ReservationAdapter;
import com.example.airbnb.Activitys.Host.Adapter.ReservationAllAdapter;
import com.example.airbnb.Activitys.Host.Model.ReservationAllModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.FragmentReservationAllBinding;

import java.util.ArrayList;


public class ReservationAllFragment extends Fragment {



    FragmentReservationAllBinding binding;
    ArrayList<ReservationAllModel> list;

    public ReservationAllFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentReservationAllBinding.inflate(inflater,container, false);

        list=new ArrayList<>();

        addItem();
        ReservationAllAdapter adapter=new ReservationAllAdapter(getContext(),list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        binding.reservationAllRv.setLayoutManager(layoutManager);
        binding.reservationAllRv.setHasFixedSize(true);
        binding.reservationAllRv.setAdapter(adapter);

        return binding.getRoot();
    }

    public void addItem(){

        list.add(new ReservationAllModel("Confirmed","Mohammad Yunus","oct5-9",R.drawable.photo1));
        list.add(new ReservationAllModel("confirmed","Mayn Tomal","Aug 28-31",R.drawable.photo1));
        list.add(new ReservationAllModel("Request withdrawn","Tanvir","Aug 19-23",R.drawable.photo1));
        list.add(new ReservationAllModel("Awaiting guest review","Chowdhury Husnine","Aug 8-10",R.drawable.photo1));
        list.add(new ReservationAllModel("Past guests","Fardeen Tanin","Aug 5-6",R.drawable.photo1));
        list.add(new ReservationAllModel("Past Guest","Piush Kumar","Jul 28-Aug7",R.drawable.photo1));

    }
}