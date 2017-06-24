package com.example.admin.gps;

import android.app.Application;

import com.example.admin.gps.api.Link;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin on 23.06.2017.
 */

public class App extends Application {

    private static Link myLink;
    private Retrofit retrofit;

    @Override
    public void onCreate(){
        super.onCreate();

        retrofit = new Retrofit.Builder()
                //.baseUrl("http://admin.gps.dp.ua/")
                .baseUrl("http://www.umori.li/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myLink = retrofit.create(Link.class);
    }

    public static Link getLink() {return myLink;}

}
