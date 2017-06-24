package com.example.admin.gps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView1);
/*
        try {
            Response response = App.getLink().getUnitInfo("bash", 5).execute();
            str = response.body().toString();
            textView.setText(str);

        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(MainActivity.this, "An error occurred during networking", Toast.LENGTH_SHORT).show();
        }*/
         App.getLink().getUnitInfo("bash",5).enqueue(new Callback<String>() {
       // App.getLink().getUnitInfo("student","1234554321","get_user_info").enqueue(new Callback<String>() {

            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                str = response.body();
                textView.setText(str);
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(MainActivity.this, "An error occurred during networking", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
