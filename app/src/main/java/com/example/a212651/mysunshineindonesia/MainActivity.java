package com.example.a212651.mysunshineindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.weather_day_title)
    TextView weatherTitle;

    @BindView(R.id.weather_description)
    TextView weatherDescription;

    @BindView(R.id.weather_temperature)
    TextView weatherTemperature;

    @BindView(R.id.weather_img)
    ImageView imgView;

    @BindView(R.id.weather_recycler)
    RecyclerView weatherList;

    private WeatherAdapter weatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
//
//        weatherTitle = (TextView) findViewById(R.id.weather_day_title);
//        weatherDescription= (TextView) findViewById(R.id.weather_description);
//        weatherTemperature= (TextView) findViewById(R.id.weather_temperature);
//        imgView= (ImageView) findViewById(R.id.weather_img);

        weatherTitle.setText("Hari Minggu");
        weatherDescription.setText("Panas Banget");
        weatherTemperature.setText("70 Derajat Celcius");
        imgView.setImageResource(R.mipmap.ic_launcher_round);

        weatherList.setLayoutManager(
                new LinearLayoutManager
                        ( this,LinearLayoutManager.VERTICAL, false)
        );

        weatherAdapter  = new WeatherAdapter();

        weatherList.setAdapter(weatherAdapter);


    }
}
