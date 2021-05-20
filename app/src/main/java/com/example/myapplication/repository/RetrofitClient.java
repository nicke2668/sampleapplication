package com.example.myapplication.repository;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class RetrofitClient {

    private static final String BASE_URL = "https://namegame.willowtreeapps.com/api/v1.0";
    private static Retrofit INSTANCE;

    private RetrofitClient() {
    }

    static Retrofit getInstance() {
        if (INSTANCE == null) {

            OkHttpClient client = new OkHttpClient.Builder().build();

            INSTANCE = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return INSTANCE;
    }
}