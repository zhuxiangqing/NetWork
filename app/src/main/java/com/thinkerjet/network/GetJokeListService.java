package com.thinkerjet.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Z on 2016/11/6.
 */

public interface GetJokeListService {
    @GET("type.from")
    Call<JokeListData> getJokeList(@Query("key") String str);
}
