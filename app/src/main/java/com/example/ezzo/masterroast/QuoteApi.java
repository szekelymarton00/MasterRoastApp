package com.example.ezzo.masterroast;


import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by lica on 2017. 12. 01..
 */

public interface QuoteApi {
    final String BASE_URL = "https://young-ridge-65683.herokuapp.com/";

    @GET("api/random")
    Call<Quote> getQuote();

}
