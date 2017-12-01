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

        final MediaPlayer masterFirst = MediaPlayer.create(this, R.raw.azefirst);
        final MediaPlayer masterSecond = MediaPlayer.create(this, R.raw.azesecond);

        Button play_button_first = (Button) this.findViewById(R.id.playfirstaze);
        Button play_button_second = (Button) this.findViewById(R.id.playsecondaze);

        play_button_first.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                masterFirst.start();
            }
        });

        play_button_second.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                masterSecond.start();
            }
        });
    }


}
