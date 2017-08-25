package com.example.alan.thunderweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alan on 2017/8/23.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
