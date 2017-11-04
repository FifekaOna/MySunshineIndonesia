package com.example.a212651.mysunshineindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView weatherTitle;
    TextView weatherDescription;
    TextView weatherTemperature;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherTitle = (TextView) findViewById(R.id.weather_day_title);
        weatherDescription= (TextView) findViewById(R.id.weather_description);
        weatherTemperature= (TextView) findViewById(R.id.weather_temperature);
        imgView= (ImageView) findViewById(R.id.weather_img);

        weatherTitle.setText("Hari Minggu");
        weatherDescription.setText("Panas Banget");
        weatherTemperature.setText("70 Derajat Celcius");
        imgView.setImageResource(R.mipmap.ic_launcher_round);


    }
}
