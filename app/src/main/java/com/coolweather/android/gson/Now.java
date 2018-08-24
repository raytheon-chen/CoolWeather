package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public String cloud;

    public String cond_txt;

    public String cond_code;

    public String fl;

    public String hum;

    public String pcpn;

    public String pres;

    public String vis;

    public String wind_deg;

    public String wind_dir;

    public String wind_sc;

    public String wind_spd;

    public class More {

        @SerializedName("txt")
        public String info;

        public String code;
    }


}
