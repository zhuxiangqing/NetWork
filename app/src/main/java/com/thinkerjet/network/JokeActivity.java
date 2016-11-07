package com.thinkerjet.network;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Z on 2016/11/6.
 */

public class JokeActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        imageView = (ImageView) findViewById(R.id.iv_joke);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://japi.juhe.cn/funny/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetJokeListService service = retrofit.create(GetJokeListService.class);
        Call<JokeListData> call = service.getJokeList("51a482a811f14df3d4429d672ac3dc9f");
        call.enqueue(new Callback<JokeListData>() {
            @Override
            public void onResponse(Call<JokeListData> call, Response<JokeListData> response) {
                Toast.makeText(JokeActivity.this, "size " + response.body().getResult().getData().size()
                        + "data " + response.body().getResult().getData().get(0).getValue1(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<JokeListData> call, Throwable t) {
                Toast.makeText(JokeActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
