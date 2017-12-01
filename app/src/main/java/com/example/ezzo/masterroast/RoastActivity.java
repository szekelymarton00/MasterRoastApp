package com.example.ezzo.masterroast;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RoastActivity extends AppCompatActivity {

    private TextView quote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roast);

        quote = (TextView) findViewById(R.id.firstquote);


        final MediaPlayer masterFirst = MediaPlayer.create(this, R.raw.azefirst);
        final MediaPlayer masterSecond = MediaPlayer.create(this, R.raw.azesecond);

        final Button play_button_first = (Button) this.findViewById(R.id.playfirstaze);
        final Button play_button_second = (Button) this.findViewById(R.id.playsecondaze);
        final Button getRandomQuote = (Button) this.findViewById(R.id.randomquote);

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

        play_button_second.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getRandomQuote,randomquote,Toast.LENGTH_LONG);
            }
        });
    }


}
