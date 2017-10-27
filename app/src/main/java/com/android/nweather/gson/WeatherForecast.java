package com.android.nweather.gson;

import com.google.gson.annotations.SerializedName;
/**
 * Created by qujihai on 2017/10/21.
 */

public class WeatherForecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;
        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
