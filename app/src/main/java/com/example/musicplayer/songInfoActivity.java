package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class songInfoActivity extends AppCompatActivity {
    public TextView songTitle;
    String title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_info);
        songTitle = findViewById(R.id.songTitle);


        Intent intent = getIntent();
        title = intent.getStringExtra("Song");
        songTitle.setText(title);

    }
}
