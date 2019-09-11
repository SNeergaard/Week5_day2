package com.example.week5_day2.model.datasource

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofirHelper{
fun getLoggingIntercepter() : HttpLoggingInterceptor {
    val httpLoggingInterceptor = HttpLoggingInterceptor();
    httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
    return httpLoggingInterceptor
}
fun getRetrofitInstance() : Retrofit = Retrofit.Builder()
    .baseUrl("https://api.github.com/users/")
    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    .addConverterFactory(GsonConverterFactory.create())
    .client(OkHttpClient.Builder().addInterceptor(getLoggingIntercepter()).build())
    .build()
}
