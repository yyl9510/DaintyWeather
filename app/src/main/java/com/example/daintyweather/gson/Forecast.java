package com.example.daintyweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    /**
     * 	白天天气状况代码	100
     */
    @SerializedName("cond_code_d")
    public String cond_code_d;
    /**
     * 	夜间天气状况代码	100
     */
    @SerializedName("cond_code_n")
    public String cond_code_n;
    /**
     * 	白天天气状况描述	晴
     */
    @SerializedName("cond_txt_d")
    public String cond_txt_d;
    /**
     * 	晚间天气状况描述	晴
     */
    @SerializedName("cond_txt_n")
    public String cond_txt_n;
    /**
     * 预报日期	2013-12-30
     */
    @SerializedName("date")
    public String date;
    /**
     * 	相对湿度	37
     */
    @SerializedName("hum")
    public String hum;
    /**
     * 月升时间	04:47
     */
    @SerializedName("mr")
    public String mr;
    /**
     * 	月落时间	14:59
     */
    @SerializedName("ms")
    public String ms;
    /**
     * 	降水量	0
     */
    @SerializedName("pcpn")
    public String pcpn;
    /**
     * 	降水概率	0
     */
    @SerializedName("pop")
    public String pop;
    /**
     * 	大气压强	1018
     */
    @SerializedName("pres")
    public String pres;
    /**
     * 日出时间	07:36
     */
    @SerializedName("sr")
    public String sr;
    /**
     * 日落时间	16:58
     */
    @SerializedName("ss")
    public String ss;
    /**
     * 	最高温度	4
     */
    @SerializedName("tmp_max")
    public String tmp_max;
    /**
     * 最低温度	-5
     */
    @SerializedName("tmp_min")
    public String tmp_min;
    /**
     * 	紫外线强度指数	3
     */
    @SerializedName("uv_index")
    public String uv_index;
    /**
     * 能见度，单位：公里	10
     */
    @SerializedName("vis")
    public String vis;
    /**
     * 	风向360角度	310
     */
    @SerializedName("wind_deg")
    public String wind_deg;
    /**
     * 	风向	西北风
     */
    @SerializedName("wind_dir")
    public String wind_dir;
    /**
     * 	风力	1-2
     */
    @SerializedName("wind_sc")
    public String wind_sc;
    /**
     * 风速，公里/小时	14
     */
    @SerializedName("wind_spd")
    public String wind_spd;
}
