package com.example.ezzo.masterroast;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RoastActivity extends AppCompatActivity {

    private TextView quote;
    private Button randombutton;
    private TextView firstquote;
    private List<MediaPlayer> azeSounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roast);

        firstquote = (TextView) findViewById(R.id.firstquote);
        azeSounds = new ArrayList<>();


        //Sounds
        final MediaPlayer masterFirst = MediaPlayer.create(this, R.raw.azefirst);
        final MediaPlayer masterSecond = MediaPlayer.create(this, R.raw.azesecond);

        //List
        azeSounds.add(masterFirst);
        azeSounds.add(masterSecond);

        //Buttons
        final Button play_button_first = (Button) this.findViewById(R.id.playfirstaze);
        final Button play_button_second = (Button) this.findViewById(R.id.playsecondaze);

        randombutton = (Button) this.findViewById(R.id.randombutton);

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

        getQuote();

        randombutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                getQuote();
            }
        });


    }

    private void getQuote() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(QuoteApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        QuoteApi chuckApi = retrofit.create(QuoteApi.class);

        Call<Quote> call = chuckApi.getQuote();

        call.enqueue(new Callback<Quote>() {
            @Override
            public void onResponse(Call<Quote> call, Response<Quote> response) {
                String quote = response.body().getText();

                firstquote.setText(quote);

            }

            @Override
            public void onFailure(Call<Quote> call, Throwable t) {
                for (int i = 0; i < 10; i++) {
                    Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
                }

            }

        });
    }


}
