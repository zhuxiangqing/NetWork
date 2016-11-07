package com.thinkerjet.network;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Z on 2016/11/6.
 */

public class NewsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/toutiao/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetNewsListService service = retrofit.create(GetNewsListService.class);
        Call<NewsListData> call = service.getNewsList("top", "93ba680b61c343b8a0777a045c0faab0");
        call.enqueue(new Callback<NewsListData>() {
            @Override
            public void onResponse(Call<NewsListData> call, Response<NewsListData> response) {
                NewsListData newsListData = response.body();
                Toast.makeText(NewsActivity.this, newsListData.getResult().getData().size() + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<NewsListData> call, Throwable t) {
                Toast.makeText(NewsActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

}
