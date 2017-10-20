package com.android.nweather.gson;

/**
 * Created by qujihai on 2017/10/20.
 */

public class WeatherBasic {

    @SerialzedName("city")
    public String cityName;

    @SerialzedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerialzedName("loc")
        public String updateTime;

    }

}
