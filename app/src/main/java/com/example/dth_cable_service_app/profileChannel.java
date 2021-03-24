package com.example.dth_cable_service_app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class profileChannel extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.channelprofile);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
//            byte[] byteArray = bundle.getByteArray("imageurl");
//            Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            int image = bundle.getInt("imageurl");
            String text_url = bundle.getString("nameurl");
            setImageUrl(image,text_url);
        }
        else {
            Toast.makeText(this, "no data", Toast.LENGTH_SHORT).show();
        }
//        if(bundle.getString("imageurl")!= null || ("nameurl")!= null)
//        {
 //       if (getIntent().hasExtra("imageurl") && getIntent().hasExtra("nameurl")) {
//            String image_url = getIntent().getStringExtra("imageurl");
//            String text_url = getIntent().getStringExtra("texturl");
//            setImageUrl(image_url,text_url);
//
//        }
        }

        private void setImageUrl (int image, String text_url){
            TextView textView = findViewById(R.id.receiveText);
            textView.setText(text_url);

            ImageView imageView = findViewById(R.id.receiveImage);
            Glide.with(this)
                    .asBitmap()
                    .load(image)
                    .into(imageView);
        }

    }
