package com.android.nweather.gson;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
 * Created by qujihai on 2017/10/21.
 */

public class Weather {

    public String status;

    public WeatherBasic basic;

    public WeatherAqi aqi;

    public WeatherNow now;

    public WeatherSuggestion suggestion;

    @SerializedName("daily_forecast")
    public List<WeatherForecast> forecastList;
}
