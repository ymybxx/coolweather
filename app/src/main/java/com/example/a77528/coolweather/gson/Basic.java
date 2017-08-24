package com.example.a77528.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 77528 on 2017/8/23.
 */

public class Basic {
    @SerializedName("city")
    public  String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public  String updateTime;
    }
}
