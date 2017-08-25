package com.example.alan.thunderweather.gson;

/**
 * Created by Alan on 2017/8/23.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
