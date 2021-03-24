package com.example.dth_cable_service_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class channel_item_view_main extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageButton imageButton;
//    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel_item_view);

        imageButton = findViewById(R.id.imagePositiveSign);
//        cardView = findViewById(R.id.cardviewList);
        recyclerView = findViewById(R.id.channelRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        imageButton.setOnClickListener(this);

        channel_item_view_data[] channelData = new channel_item_view_data[]{
                new channel_item_view_data("Axn Sports", "Price 500/=",R.drawable.axn),
                new channel_item_view_data("Sony Six", "Price 500/=",R.drawable.sonysix),
                new channel_item_view_data("Star Tv", "Price 500/=",R.drawable.star_television),
                new channel_item_view_data("City Communication", "Price 500/=",R.drawable.ic___artboard_5city_com_),
                new channel_item_view_data("Flash Net", "Price 500/=",R.drawable.ic__artboard_5flash_net),
                new channel_item_view_data("Cloud Network", "Price 500/=",R.drawable.ic_artboard_1cloud_network2),
                new channel_item_view_data("AMC Digital TV", "Price 500/=",R.drawable.ic_artboard_5amc_network),
                new channel_item_view_data("AsiaNet TV", "Price 500/=",R.drawable.ic_artboard_5asianet_online_service),
                new channel_item_view_data("Global Connect IT", "Price 500/=",R.drawable.ic_artboard_5global_connect_it),
        };

        channel_item_view_adapter channel_adapter = new channel_item_view_adapter(channelData, channel_item_view_main.this);
        recyclerView.setAdapter(channel_adapter);

//        profileChannel profilechannel = new profileChannel();

//        cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (v.getId() == R.id.channelRecyclerView){
//                    Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }
//
//    @Override
//    public void onClick(View v) {
//        if(channel_adapter.getId() == R.id.imagePositiveSign){
//                  Intent intent = new Intent(channel_item_view_main.this, MainActivity.class);
//               }
//    }
}