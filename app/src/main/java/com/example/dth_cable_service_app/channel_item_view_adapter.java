package com.example.dth_cable_service_app;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;

public class channel_item_view_adapter extends RecyclerView.Adapter<channel_item_view_adapter.RecycleViewHolder> {
    public channel_item_view_data[] channelData;
    Context context;

    public channel_item_view_adapter(channel_item_view_data[] channelData, channel_item_view_main channel_item_view_main) {
    this.channelData = channelData;
    this.context = channel_item_view_main;
    }

    @NonNull
    @Override
    public channel_item_view_adapter.RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =  LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.channel_recyclerview_list,parent,false);
        RecycleViewHolder viewHolder = new RecycleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull channel_item_view_adapter.RecycleViewHolder holder, int position) {
        final channel_item_view_data channel_recyclerview_list = channelData[position];

        holder.NameTextView.setText(channel_recyclerview_list.getName());
        holder.DescriptionTextView.setText(channel_recyclerview_list.getDescription());
        holder.iconImage.setImageResource(channel_recyclerview_list.getImageIcon());
        holder.ButtonPostive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"You added " + channel_recyclerview_list.getName() , Toast.LENGTH_SHORT).show();
            }
        });


       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v ) {
//               Bitmap bmp = BitmapFactory.decodeResource(context.getResources(),channel_recyclerview_list.getImageIcon());
//               ByteArrayOutputStream stream = new ByteArrayOutputStream();
//               bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
//               byte[] byteArray = stream.toByteArray();

               Intent intent = new Intent(context, profileChannel.class);
               intent.putExtra("imageurl", channel_recyclerview_list.getImageIcon());
               intent.putExtra("nameurl", channel_recyclerview_list.getName());
               context.startActivity(intent);
           }
       });


    }

    @Override
    public int getItemCount() {
        return channelData.length;
    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder  {
        ImageView iconImage;
        ImageButton ButtonPostive;
        TextView NameTextView;
        TextView DescriptionTextView;

        public RecycleViewHolder(@NonNull View itemView) {
            super(itemView);

            iconImage = itemView.findViewById(R.id.imageIcon);
            ButtonPostive = itemView.findViewById(R.id.imagePositiveSign);
            NameTextView = itemView.findViewById(R.id.textViewName);
            DescriptionTextView = itemView.findViewById(R.id.textDescription);

        }

    }
}
