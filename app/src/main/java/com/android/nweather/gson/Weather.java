package com.android.nweather.gson;

import java.util.List;

/**
 * Created by qujihai on 2017/10/21.
 */

public class Weather {

    public String status;

    public WeatherBasic basic;

    public WeatherAqi aqi;

    public WeatherNow now;

    public WeatherSuggestion suggestion;

    @SerialzedName("daily_forecast")
    public List<WeatherForecast> forecastList;
}
