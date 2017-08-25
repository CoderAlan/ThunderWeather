package com.example.alan.thunderweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alan on 2017/8/23.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
