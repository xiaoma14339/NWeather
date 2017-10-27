package com.android.nweather.gson;

import com.google.gson.annotations.SerializedName;
/**
 * Created by qujihai on 2017/10/20.
 */

public class WeatherNow {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
