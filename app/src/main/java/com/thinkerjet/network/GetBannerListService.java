package com.thinkerjet.network;

/**
 * Created by Z on 2016/10/30.
 */

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 这个类是用来写 你要把json数据转化成什么类型的
 */
public interface GetBannerListService {
    /**
     * 这里的方法返回值是标准写法 不能随便写
     * 就是说你必须写成一个Call<T>
     * @return
     */
    @GET("app/getBannerList")
    Call<BannerListData> getBannerList(@Query("ver")int i);//尖括号里面的是 你想转换成的类型
    //注意 这个接口定义了三个 一是拼接在BaseURl后面的那段 二是<>内这个返回的json数据的java模板 三是参数

}
