package com.efarrar.book_ch6_alohamusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //class variables
    Button button1, button2;
    MediaPlayer mpSong1, mpSong2;
    int playing;            //variable to tracking number of presses

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button1 = findViewById(R.id.button1);
       button2 = findViewById(R.id.button2);

       //MEDIA PLAYER
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.song_ukulele );
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.song_anewbeginning );
        playing = 0;

        //OnClickListener methods
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mediaPlayer1.start();
                        playing = 1;
                        button1.setText("Pause the Song");      //Changing text on buttons
                        button2.setVisibility(View.INVISIBLE);  //Changing button2 visibility state
                        break;
                    case 1:
                        mediaPlayer1.pause();
                        playing = 0;
                        button1.setText("Play the Song");       //Changing text on buttons
                        button2.setVisibility(View.VISIBLE);  //Changing button2 visibility state
                        break;
                }

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mediaPlayer2.start();
                        playing = 1;
                        button2.setText("Pause the Song");      //Changing text on buttons
                        button1.setVisibility(View.INVISIBLE);  //Changing button2 visibility state
                        break;
                    case 1:
                        mediaPlayer2.pause();
                        playing = 0;
                        button2.setText("Play the Song");       //Changing text on buttons
                        button1.setVisibility(View.VISIBLE);  //Changing button2 visibility state
                        break;
                }

            }
        });

    }


}
