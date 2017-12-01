package com.example.ezzo.masterroast;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RoastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roast);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.cataclysm);

        Button play_button = (Button) this.findViewById(R.id.playcata);

        play_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });
    }

    
}
