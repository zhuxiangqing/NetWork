package com.thinkerjet.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Z on 2016/11/6.
 */

public interface WeatherService {
    @GET("query")
    Call<MyWeatherBean> query(@Query("cityname") String cityname, @Query("key") String key);
}
