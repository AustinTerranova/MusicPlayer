package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private Menu songMenu;
    //int [] songs;
    public MediaPlayer mediaPlayer;
    public MediaPlayer mediaPlayer2;
    public MediaPlayer mediaPlayer3;
    public Button play;
    public Button next;
    public Button previous;
    boolean mediaStopped;
    boolean media2Stopped;
    boolean media3Stopped;
    int index = 1;
    String joyful = "Joyful";
    String clouds = "clouds";
    String qua = "Quasarise";
    //SongInfoActivity songInfo = new SongInfoActivity(y
    //Intent intent = new Intent(MainActivity.this, songInfoActivity.class);
    //public MediaPlayer[] media = {mediaPlayer, mediaPlayer2, mediaPlayer3 };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.play);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);
        mediaPlayer = MediaPlayer.create(this, R.raw.joyful);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.clouds);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.quasarise);
        //songs = new int[] {R.raw.clouds,R.raw.joyful,R.raw.quasarise};
        //Intent intent = new Intent(MainActivity.this, songInfoActivity.class);
        //mediaPlayer = MediaPlayer.create(this, songs[0]);


        previous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //play.setText("Pause");
                System.out.println(index);
                if(index == 1 ){
                    index -= 1;
                    if(media2Stopped){
                        try{
                            mediaPlayer2.prepare();
                            media2Stopped = false;
                        } catch(IOException e){
                            e.printStackTrace();
                        }
                    }
                    mediaPlayer2.start();
                    //imageView.setImageResource(imageResource1);
                   // title.setText("clouds");

                    if(mediaPlayer.isPlaying()){
                        mediaStopped = true;
                        mediaPlayer.stop();

                    }
                    if(mediaPlayer3.isPlaying()){
                        media3Stopped = true;
                        mediaPlayer3.stop();

                    }
                    //mediaPlayer3.pause();

                } else if(index == 2) {
                    index -= 1;
                    if(media3Stopped){
                        try{
                            mediaPlayer3.prepare();
                            media3Stopped = false;
                        } catch(IOException e){
                            e.printStackTrace();
                        }
                    }
                    mediaPlayer3.start();
                   // imageView.setImageResource(imageResource3);
                   // title.setText("quasarise");
                    if(mediaPlayer2.isPlaying()){
                        media2Stopped = true;
                        mediaPlayer2.stop();

                    }
                    if(mediaPlayer.isPlaying()){
                        mediaStopped = true;
                        mediaPlayer.stop();

                    }
                    // mediaPlayer.pause();
                    //mediaPlayer2.pause();
                    // play first song
                    //playSong(0);
                    //currentSongIndex = 0;
                }else {
                    if(mediaStopped){
                        try{
                            mediaPlayer.prepare();
                            mediaStopped = false;
                        } catch(IOException e){
                            e.printStackTrace();
                        }
                    }
                    mediaPlayer.start();
                   // imageView.setImageResource(imageResource2);
                    //title.setText("joyful");
                    if(mediaPlayer2.isPlaying()){
                        media2Stopped = true;
                        mediaPlayer2.stop();

                    }
                    if(mediaPlayer3.isPlaying()){
                        media3Stopped = true;
                        mediaPlayer3.stop();

                    }
                    //mediaPlayer2.reset();
                    //mediaPlayer3.reset();
                    index = 2;
                }


            }

        });
        play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //mediaPlayer.start();
                CharSequence text = play.getText();
                System.out.println(play.getText());
                //intent.putExtra("Song",  joyful);


                if(play.getText().equals("Play")){
                    play.setText("Pause");
                    if(index == 2) {
                        if(mediaStopped){
                            mediaPlayer2.start();
                        }
                        mediaPlayer2.start();
                        if(mediaPlayer2.isPlaying()){
                            media2Stopped = true;
                            mediaPlayer2.stop();

                        }
                        if(mediaPlayer3.isPlaying()){
                            media3Stopped = true;
                            mediaPlayer3.stop();

                        }
                        //mediaPlayer2.reset();
                        //mediaPlaye
                        // mediaPlayer.pause();
                        //mediaPlayer2.pause();
                        // play first song
                        //playSong(0);
                        //currentSongIndex = 0;
                       // play.setText("Pause");
                    } else if(index == 2) {
                        //index += 1;
                        if(media3Stopped){

                        }
                        mediaPlayer3.start();
                        if(mediaPlayer2.isPlaying()){
                            media2Stopped = true;
                            mediaPlayer2.stop();

                        }
                        if(mediaPlayer.isPlaying()){
                            mediaStopped = true;
                            mediaPlayer.stop();


                        }
                        // mediaPlayer.pause();
                        //mediaPlayer2.pause();
                        // play first song
                        //playSong(0);
                        //currentSongIndex = 0;
                        play.setText("Pause");
                    }else {
                        if(mediaStopped){

                        }
                        mediaPlayer.start();
                        if(mediaPlayer2.isPlaying()){
                            media2Stopped = true;
                            mediaPlayer2.stop();

                        }
                        if(mediaPlayer3.isPlaying()){
                            media3Stopped = true;
                            mediaPlayer3.stop();

                        }
                        //mediaPlayer2.reset();
                        //mediaPlayer3.reset();
                        //index = 1;
                    }


                }else {

                    if (play.getText().equals("Pause")) {
                        play.setText("Play");
                        System.out.println(index);
                        if (mediaPlayer2.isPlaying()) {
                            mediaPlayer2.stop();
                            mediaPlayer2.prepareAsync();
                        }
                        if(mediaPlayer.isPlaying())
                        {
                            mediaPlayer.stop();
                            mediaPlayer.prepareAsync();
                        }
                        if (mediaPlayer3.isPlaying()) {
                            mediaPlayer3.stop();
                            mediaPlayer3.prepareAsync();
                            //media

                        }


                    }


                }

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, songInfoActivity.class);
                System.out.println(index);
                System.out.println(index);
                if(index == 1 ){
                    index += 1;
                    if(media2Stopped){
                        try{
                            mediaPlayer2.prepare();
                            media2Stopped = false;
                        } catch(IOException e){
                            e.printStackTrace();
                        }
                    }
                    mediaPlayer2.start();
                    //imageView.setImageResource(imageResource1);
                    // title.setText("clouds");

                    if(mediaPlayer.isPlaying()){
                        mediaStopped = true;
                        mediaPlayer.stop();

                    }
                    if(mediaPlayer3.isPlaying()){
                        media3Stopped = true;
                        mediaPlayer3.stop();

                    }
                    //mediaPlayer3.pause();

                } else if(index == 2) {
                    index += 1;
                    if(media3Stopped){
                        try{
                            mediaPlayer3.prepare();
                            media3Stopped = false;
                        } catch(IOException e){
                            e.printStackTrace();
                        }
                    }
                    mediaPlayer3.start();
                    // imageView.setImageResource(imageResource3);
                    // title.setText("quasarise");
                    if(mediaPlayer2.isPlaying()){
                        media2Stopped = true;
                        mediaPlayer2.stop();

                    }
                    if(mediaPlayer.isPlaying()){
                        mediaStopped = true;
                        mediaPlayer.stop();

                    }
                    // mediaPlayer.pause();
                    //mediaPlayer2.pause();
                    // play first song
                    //playSong(0);
                    //currentSongIndex = 0;
                }else {
                    if(mediaStopped){
                        try{
                            mediaPlayer.prepare();
                            mediaStopped = false;
                        } catch(IOException e){
                            e.printStackTrace();
                        }
                    }
                    mediaPlayer.start();
                    // imageView.setImageResource(imageResource2);
                    //title.setText("joyful");
                    if(mediaPlayer2.isPlaying()){
                        media2Stopped = true;
                        mediaPlayer2.stop();

                    }
                    if(mediaPlayer3.isPlaying()){
                        media3Stopped = true;
                        mediaPlayer3.stop();

                    }
                    //mediaPlayer2.reset();
                    //mediaPlayer3.reset();
                    index = 2;
                }

            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        songMenu = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.songInfo:
                Toast.makeText(this, "Song Info Selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, songInfoActivity.class);
                if (mediaPlayer2.isPlaying()) {
                    intent.putExtra("Song", clouds);
                }
                if(mediaPlayer.isPlaying())
                {
                    intent.putExtra("Song",  joyful);

                }
                if (mediaPlayer3.isPlaying()) {
                    intent.putExtra("Song", qua);
                }
                startActivity(intent);
                //play.setText("Play");

                break;
            case R.id.seekBar:
                Toast.makeText(this, "Images Viewer selected", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(MainActivity.this, ImageActivity.class);
                startActivity(intent2);
                play.setText("Play");
                if (mediaPlayer2.isPlaying()) {
                    mediaPlayer2.stop();
                    mediaPlayer.prepareAsync();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.stop();
                    mediaPlayer.prepareAsync();
                }
                if (mediaPlayer3.isPlaying()) {
                    mediaPlayer3.stop();
                    mediaPlayer.prepareAsync();
                }


                break;

            case R.id.progressBar:
                Toast.makeText(this, "Video Selected", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(MainActivity.this, VideoActivity.class);
                startActivity(intent3);
                play.setText("Play");
                if (mediaPlayer2.isPlaying()) {
                    mediaPlayer2.stop();
                    mediaPlayer.prepareAsync();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.stop();
                    mediaPlayer.prepareAsync();
                }
                if (mediaPlayer3.isPlaying()) {
                    mediaPlayer3.stop();
                    mediaPlayer.prepareAsync();
                }

                break;

        }
        return true;
    }
}
