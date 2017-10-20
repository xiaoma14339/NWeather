package com.android.nweather.gson;

/**
 * Created by qujihai on 2017/10/21.
 */

public class WeatherForecast {

    public String date;

    @SerialzedName("tmp")
    public Temperature temperature;

    @SerialzedName("cond")
    public More more;

    public class Temperature {

        public String max;
        public String min;
    }

    public class More {

        @SerialzedName("txt_d")
        public String info;
    }
}
