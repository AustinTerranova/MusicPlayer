package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class ImageActivity extends AppCompatActivity {

    public Button next;
    public ImageView image;


    int index = 1;
    public ImageActivity seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_seek_bar);
        image = findViewById(R.id.imageView);
        next = findViewById(R.id.next);
        //image.setImageResource(imageResource1);


        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(index == 1) {
                    image.setImageResource(R.drawable.clouds);
                    index++;
                } else if(index == 2 ){
                    image.setImageResource(R.drawable.joyful);
                    index++;
                } else {
                    image.setImageResource(R.drawable.quasarise);
                    index = 1;
                }


            }

        });
    }
}
