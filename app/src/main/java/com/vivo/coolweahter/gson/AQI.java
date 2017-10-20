package com.vivo.coolweahter.gson;

/**
 * Created by xiayizhuan on 17/9/30.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
