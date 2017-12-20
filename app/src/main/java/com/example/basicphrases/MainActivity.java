package com.example.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    public void translate(View view){

        int id = view.getId();


        String ourID = view.getResources().getResourceEntryName(id);


        int resourceId = getResources().getIdentifier(ourID, "raw", "com.example.basicphrases");


        MediaPlayer mplayer = MediaPlayer.create(this,resourceId);
        mplayer.start();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
