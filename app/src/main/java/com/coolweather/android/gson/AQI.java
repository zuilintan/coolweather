package com.coolweather.android.gson;

/**
 * Created by Administrator on 2018/2/26.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
