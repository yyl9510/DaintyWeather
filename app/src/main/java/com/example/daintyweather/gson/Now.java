package com.example.daintyweather.gson;

import com.google.gson.annotations.SerializedName;

import org.litepal.crud.DataSupport;

public class Now extends DataSupport {
    /**
     * 云量	23
     */
    @SerializedName("cloud")
    public String cloud;

    /**
     * 	实况天气状况代码	100
     */
    @SerializedName("cond_code")
    public String cond_code;

    /**
     * 实况天气状况描述	晴
     */
    @SerializedName("cond_txt")
    public String cond_txt;

    /**
     * 体感温度，默认单位：摄氏度	23
     */
    @SerializedName("fl")
    public String fl;

    /**
     * 相对湿度	40
     */
    @SerializedName("hum")
    public String hum;

    /**
     * 降水量	0
     */
    @SerializedName("pcpn")
    public String pcpn;

    /**
     * 大气压强	1020
     */
    @SerializedName("pres")
    public String pres;

    /**
     * 温度，默认单位：摄氏度	21
     */
    @SerializedName("tmp")
    public String tmp;

    /**
     * 能见度，默认单位：公里	10
     */
    @SerializedName("vis")
    public String vis;

    /**
     * 风向360角度	305
     */
    @SerializedName("wind_deg")
    public String wind_deg;

    /**
     * 	风向	西北
     */
    @SerializedName("wind_dir")
    public String wind_dir;

    /**
     * 风力	3-4
     */
    @SerializedName("wind_sc")
    public String wind_sc;

    /**
     * 风速，公里/小时	15
     */
    @SerializedName("wind_spd")
    public String wind_spd;
}
