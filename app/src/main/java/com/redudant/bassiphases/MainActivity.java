package com.redudant.bassiphases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view) {

        int id = view.getId();
        String ourID = "";

        ourID = view.getResources().getResourceEntryName(id);

        //this is get file raw using name ID
        int resorceID = getResources().getIdentifier(ourID, "raw", "com.redudant.bassiphases");

        MediaPlayer mPlayer = MediaPlayer.create(this, resorceID);
        mPlayer.start();

        //this function so that there is no error when taped many times
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });

        Log.i("Infor", ourID);
    }
}
