package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("parent_city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public String location;

    public String admin_area;

    public String cnty;

    public String lat;

    public String lon;

    public String tz;

    public String cid;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

        @SerializedName("utc")
        public String updateTime_UTC;
    }

}
