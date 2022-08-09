package com.example.airbnb.Activitys.Host.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.airbnb.Activitys.Host.Adapter.CancellationPolicyAdapter;
import com.example.airbnb.Activitys.Host.Model.CancellationPolicyModel;
import com.example.airbnb.R;
import com.example.airbnb.databinding.ActivityCancellationPolicyBinding;

import java.util.ArrayList;

public class CancellationPolicyActivity extends AppCompatActivity {

    ActivityCancellationPolicyBinding binding;
    ArrayList<CancellationPolicyModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCancellationPolicyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        list=new ArrayList<>();
        addItem();

        CancellationPolicyAdapter adapter=new CancellationPolicyAdapter(this,list);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.cancellationRv.setLayoutManager(layoutManager);
        binding.cancellationRv.setHasFixedSize(true);
        binding.cancellationRv.setAdapter(adapter);

    }
    public void addItem(){


        list.add(new CancellationPolicyModel("Cancellation policy","Which cancellation option do you want to offer guest?","Flexible","Full refund 1 day prior to arrival"));
        list.add(new CancellationPolicyModel("","","Flexible or Non-refundable","In addition to flexible, offer a nor-refundable option-guests pay 10% less, but you keep your payout no matter when they cancel. learn more"));
        list.add(new CancellationPolicyModel("","","Moderate","Full refund 5 days prior to arrival"));
        list.add(new CancellationPolicyModel("","","Moderate or Non-refundable","In addition to Moderate,offer a non-refundable option-guests pay 10% less, but your keep payout no matter."));
        list.add(new CancellationPolicyModel("","","Firm","Full refund for cancellations up to 30 days before check-in. If booked fewer than 30 days before check-in , full refund for cancellations made within 48 hours of booking and at least 14day before check-in. After that, 50% refund up to 7 days before check-in No refund after that."));
        list.add(new CancellationPolicyModel("","","Firm or Non-refundable","In addition to firm. offer a non refundable option-guests pay 10% less, but you keep your payout no matter when they cancel."));
        list.add(new CancellationPolicyModel("","","Strict ","Full refund for cancellations made within 48 hours of booking. If the check-in date is at least 14 days away. 50% refund for cancellations made at least 7 days before check-in No refunds for cancellations made within 7 days of check-in."));
        list.add(new CancellationPolicyModel("","","Strict or Non-refundable","In addition to Strict, offer a non-refundable option-guests pay 10% less, but you keep your payout no matter when they cancel."));
        list.add(new CancellationPolicyModel("Long term Stay  cancellation policy","Choose the policy that will apply to stays 28 nights or longer. ","Strict","Full refund if cancelled within 48 hours of booking and at least 28 das before check-in. After that, the first 30 days of the stay are no-refundable."));
        list.add(new CancellationPolicyModel("","","Flexible","Full refund up to 30 days before check-in After that, the first 30 days of the stay are non-refundable."));



    }
}