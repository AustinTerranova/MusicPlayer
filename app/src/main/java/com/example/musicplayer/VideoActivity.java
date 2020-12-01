package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
//import android.net.Uri;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import java.net.URI;

import java.net.URI;

import static android.net.Uri.parse;

public class VideoActivity extends AppCompatActivity {
    public MediaPlayer mediaPlayer;
    public MediaPlayer mediaPlayer2;
    public MediaPlayer mediaPlayer3;
    public Button play;
    public Button next;
    public Button previous;
    boolean mediaStopped;
    boolean media2Stopped;
    boolean media3Stopped;
    public VideoView video;
    int index = 1;
    public VideoActivity progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        play = findViewById(R.id.play);
        next = findViewById(R.id.next);
        video = findViewById(R.id.videoView);
        //progressBar = findViewById(R.id.progressBar);
        previous = findViewById(R.id.previous);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.rooster;
        Uri uri = Uri.parse(videoPath);
        video.setVideoURI(uri);
        MediaController media = new MediaController(this );
        video.setMediaController(media);
        media.setAnchorView(video);

    }
}
