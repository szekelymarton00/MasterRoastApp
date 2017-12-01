package com.example.ezzo.masterroast;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ezzo on 2017. 12. 01..
 */

public class MarciTryHard extends AppCompatActivity {

    private static final String TAG = "Aze" ;
    private int clicked= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roast);

        Log.v(TAG, "Initializing sounds...");

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound);

        Button play_button = (Button)this.findViewById(R.id.button);
        play_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v(TAG, "Playing sound...");
                mp.start();
            }
        });
    }
}
