package com.example.myapplication;



import com.example.myapplication.model.object;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface callapi {
    @GET("index/get?")
    Call<List<object.ITEM>> getmodels();
}
