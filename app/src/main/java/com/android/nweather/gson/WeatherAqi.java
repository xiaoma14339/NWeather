package com.android.nweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by qujihai on 2017/10/20.
 */

public class WeatherAqi {

    @SerializedName("city")
    public AqiCity aqiCity;

    public class AqiCity {

        public String aqi;

        public String pm25;
    }
}
