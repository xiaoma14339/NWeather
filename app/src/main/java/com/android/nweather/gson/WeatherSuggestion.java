package com.android.nweather.gson;

import com.google.gson.annotations.SerializedName;
/**
 * Created by qujihai on 2017/10/20.
 */

public class WeatherSuggestion {

    @SerializedName("comf")
    public Confort confort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Confort {

        @SerializedName("txt")
        public String info;
    }

    public class CarWash {

        @SerializedName("txt")
        public String info;
    }

    public class Sport {

        @SerializedName("txt")
        public String info;
    }
}
