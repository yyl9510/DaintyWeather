package com.example.daintyweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
	
    /*
    	地区／城市ID  CN101080402
     */
    @SerializedName("cid")
    public String cid;

    /*
        地区／城市名称 卓资
     */
    @SerializedName("location")
    public String location;

    /*
        该地区／城市的上级城市 乌兰察布
     */
    @SerializedName("parent_city")
    public String parent_city;

    /*
        该地区／城市所属行政区域    内蒙古
     */
    @SerializedName("admin_area")
    public String admin_area;

    /*
        该地区／城市所属国家名称    中国
     */
    @SerializedName("cnty")
    public String cnty;

    /*
        地区／城市纬度 40.89576
     */
    @SerializedName("lat")
    public String lat;

    /*
        地区／城市经度 112.577702
     */
    @SerializedName("lon")
    public String lon;

    /*
        该地区／城市所在时区  +8.0
     */
    @SerializedName("tz")
    public String tz;

}
