package com.thinkerjet.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Z on 2016/10/31.
 */

public interface GetBannerList2Service {
   @GET("app/getBannerList")
    Call<BannerLisetData2> getBannerliset2(@Query("ver")int i);

}
