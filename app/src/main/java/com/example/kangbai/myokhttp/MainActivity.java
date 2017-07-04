package com.example.kangbai.myokhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;

public class MainActivity extends AppCompatActivity {
    private OkHttpClient okHttpClient = null;
    private String str = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        okHttpClient = new OkHttpClient.Builder()
                            .build();

        str = "http://www.baidu.com";
        Request request = new Request.Builder()
                .url("http://10.0.2.2:8080/mp3/resouces.xml")
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("tag", "onFailure: "+e.toString() );
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) {
                try {
                    String result = response.body().string();
                    Log.e("tag", result);
                } catch (IOException e) {
                    Log.e("tag", "onResponse: "+e.toString() );
                    e.printStackTrace();
                }
            }
        });
    }
}
