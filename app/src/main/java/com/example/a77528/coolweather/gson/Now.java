package com.example.a77528.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 77528 on 2017/8/23.
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
