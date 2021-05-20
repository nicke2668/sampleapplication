package com.example.myapplication.repository;

import retrofit2.Call;
import retrofit2.http.GET;

public class GetPeopleService {

    public interface GetWeatherDataService {
        @GET("profiles")
        Call<FetchPeopleResponse> retrieveForecast();
    }
}
