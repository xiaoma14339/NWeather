package com.android.nweather.gson;

/**
 * Created by qujihai on 2017/10/20.
 */

public class WeatherNow {

    @SerialzedName("temp")
    public String temperature;

    @SerialzedName("cond")
    public More more;

    public class More {

        @SerialzedName("txt")
        public String info;
    }
}
