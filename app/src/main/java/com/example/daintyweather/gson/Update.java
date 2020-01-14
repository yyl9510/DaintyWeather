package com.example.daintyweather.gson;

import com.google.gson.annotations.SerializedName;

import org.litepal.crud.DataSupport;

public class Update extends DataSupport {

    /*
        当地时间，24小时制，格式yyyy-MM-dd HH:mm   2017-10-25 12:34
     */
    @SerializedName("loc")
    public String loc;

    /*
        UTC时间，24小时制，格式yyyy-MM-dd HH:mm    2017-10-25 04:34
     */
    @SerializedName("utc")
    public String utc;

}
