package com.example.admin.gps.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by admin on 23.06.2017.
 */

public interface Link {
    //@GET("/sdk")
    //Call<String> getUnitInfo(@Query("login") String login,@Query("pass") String pass, @Query("svc") String svc);
    @GET("/api/get")
    Call<String> getUnitInfo(@Query("name") String resourceName, @Query("num") int count);

}
