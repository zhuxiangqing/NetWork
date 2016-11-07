package com.thinkerjet.network;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main2Activity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.tv);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://139.129.217.83:8015/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetBannerList2Service service = retrofit.create(GetBannerList2Service.class);
        Call<BannerLisetData2> call = service.getBannerliset2(1);
        call.enqueue(new Callback<BannerLisetData2>() {
            @Override
            public void onResponse(Call<BannerLisetData2> call, Response<BannerLisetData2> response) {
                BannerLisetData2 bannerLisetData2 = response.body();
                textView.setText(bannerLisetData2.getDesc());
            }

            @Override
            public void onFailure(Call<BannerLisetData2> call, Throwable t) {

                textView.setText("error"+t.getMessage()+""+call.request().toString());
            }
        });


        /**
         *
         4.获取大灯列表
         url: http://139.129.217.83:8015/app/getBannerList
         param:
         ver = (int)
         eg:  http://139.129.217.83:8015/app/getBannerList?ver=1
         返回结果json:
         {"err":0,"list":[{"BANNER_TITLE":"喜迎国庆","BANNER_DESC":"","BANNER_TYPE":"NONE","UPDATE_DATE":{"date":30,"day":5,"hours":16,"minutes":30,"month":8,"nanos":0,"seconds":23,"time":1475224223000,"timezoneOffset":-480,"year":116},"BANNER_CODE":"BN201609300001","BANNER_KIND":"SYSTEM","DISABLED":0,"CREATE_DATE_STR":"2016-09-30 16:29:48","CREATE_DATE":{"date":30,"day":5,"hours":16,"minutes":29,"month":8,"nanos":0,"seconds":48,"time":1475224188000,"timezoneOffset":-480,"year":116},"UPDATE_DATE_STR":"2016-09-30 16:30:23","BANNER_NAME":"喜迎国庆","BANNER_LOGO":"6FJIvVVH9bZzVN1SAJ0Lydj9sjx22GmaFE87Xpzbo9E=","BANNER_HTML":"","DISABLED_NAME":"有效","ID":3,"CREATE_DEPART":"DPTJIAYIKEJI","UPDATE_PERSON":"STFJIAYIKEJIMGR","REMARK":"","BANNER_ORDER":1,"CREATE_PERSON":"STFJIAYIKEJIMGR"},{"BANNER_TITLE":"校园活动宣传","BANNER_DESC":"","BANNER_TYPE":"NONE","UPDATE_DATE":{"date":6,"day":6,"hours":10,"minutes":12,"month":7,"nanos":0,"seconds":43,"time":1470449563000,"timezoneOffset":-480,"year":116},"BANNER_CODE":"BN201607280001","BANNER_KIND":"SYSTEM","DISABLED":0,"CREATE_DATE_STR":"2016-07-28 15:01:26","CREATE_DATE":{"date":28,"day":4,"hours":15,"minutes":1,"month":6,"nanos":0,"seconds":26,"time":1469689286000,"timezoneOffset":-480,"year":116},"UPDATE_DATE_STR":"2016-08-06 10:12:43","BANNER_NAME":"校园活动宣传","BANNER_LOGO":"GijjgAWSofeIFHenQNj9TcYkB-zNo4hVsGSgJg6GRbE=","BANNER_HTML":"","DISABLED_NAME":"有效","ID":2,"CREATE_DEPART":"DPTJIAYIKEJI","UPDATE_PERSON":"STFJIAYIKEJIMGR","REMARK":"","BANNER_ORDER":3,"CREATE_PERSON":"STFJIAYIKEJIMGR"},{"BANNER_TITLE":"实名制登记安全你和我","BANNER_DESC":"","BANNER_TYPE":"NONE","UPDATE_DATE":{"date":3,"day":5,"hours":10,"minutes":51,"month":5,"nanos":0,"seconds":32,"time":1464922292000,"timezoneOffset":-480,"year":116},"BANNER_CODE":"BN201605170003","BANNER_KIND":"SYSTEM","DISABLED":0,"CREATE_DATE_STR":"2016-05-17 16:39:58","CREATE_DATE":{"date":17,"day":2,"hours":16,"minutes":39,"month":4,"nanos":0,"seconds":58,"time":1463474398000,"timezoneOffset":-480,"year":116},"UPDATE_DATE_STR":"2016-06-03 10:51:32","BANNER_NAME":"实名制登记安全你和我","BANNER_LOGO":"T3XAeCCZdDDaKXLvDgN_uPAlbH7O2PXX5QdsQwe0Paw=","BANNER_HTML":"","DISABLED_NAME":"有效","ID":1,"CREATE_DEPART":"DPTJIAYIKEJI","UPDATE_PERSON":"STFJIAYIKEJIMGR","REMARK":"","BANNER_ORDER":10,"CREATE_PERSON":"STFJIAYIKEJIMGR"}],"desc":"成功"}

         */
    }
}
