package com.android.nweather.gson;

/**
 * Created by qujihai on 2017/10/20.
 */

public class WeatherSuggestion {

    @SerialzedName("comf")
    public Confort confort;

    @SerialzedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Confort {

        @SerialzedName("txt")
        public String info;
    }

    public class CarWash {

        @SerialzedName("txt")
        public String info;
    }

    public class Sport {

        @SerialzedName("txt")
        public String info;
    }
}
