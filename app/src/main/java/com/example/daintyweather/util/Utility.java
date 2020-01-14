package com.example.daintyweather.util;

import android.text.TextUtils;
import android.util.Log;

import com.example.daintyweather.db.City;
import com.example.daintyweather.db.County;
import com.example.daintyweather.db.Province;
import com.example.daintyweather.gson.Basic;
import com.example.daintyweather.gson.Forecast;
import com.example.daintyweather.gson.Now;
import com.example.daintyweather.gson.Update;
import com.example.daintyweather.gson.Weather;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Utility {

    /**
     * 解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i=0;i<allProvinces.length();i++){
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            }catch(JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCityResponse(String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i=0;i<allCities.length();i++){
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city =new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            }catch(JSONException e){
                e.printStackTrace();
            }

        }
        return false;
    }

    /**
     * 解析和处理服务器返回的县级数据
     */
    public static boolean handleCountyResponse(String response,int cityId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i=0;i<allCounties.length();i++){
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    County county =new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            }catch(JSONException e){
                e.printStackTrace();
            }

        }
        return false;
    }

    /**
     * 将返回的json数据解析成Weather实体类
     */
    public static Weather handleWeatherResponse(String response){
        //Weather weather = new Weather();
        try{
            /*JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather6");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            JSONObject jsonObject1 = new JSONObject(weatherContent);
            JSONObject basicJson = jsonObject1.getJSONObject("basic");
            JSONObject updateJson = jsonObject1.getJSONObject("update");
            String statusJson = jsonObject1.getString("status");
            JSONObject nowJson = jsonObject1.getJSONObject("now");

            Basic basic  = new Basic();
            basic.cid = basicJson.getString("cid");
            basic.location = basicJson.getString("location");
            basic.parent_city = basicJson.getString("parent_city");
            basic.admin_area = basicJson.getString("admin_area");
            basic.cnty = basicJson.getString("cnty");
            basic.lat = basicJson.getString("lat");
            basic.lon = basicJson.getString("lon");
            basic.tz = basicJson.getString("tz");
            weather.basic = basic;

            Update update = new Update();
            update.loc = updateJson.getString("loc");
            update.utc = updateJson.getString("utc");
            weather.update = update;

            weather.status = statusJson;

            Now now = new Now();
            now.cloud = nowJson.getString("cloud");
            now.cond_code = nowJson.getString("cond_code");
            now.cond_txt = nowJson.getString("cond_txt");
            now.fl = nowJson.getString("fl");
            now.hum = nowJson.getString("hum");
            now.pcpn = nowJson.getString("pcpn");
            now.pres = nowJson.getString("pres");
            now.tmp = nowJson.getString("tmp");
            now.vis = nowJson.getString("vis");
            now.wind_deg = nowJson.getString("wind_deg");
            now.wind_dir = nowJson.getString("wind_dir");
            now.wind_sc = nowJson.getString("wind_sc");
            now.wind_spd = nowJson.getString("wind_spd");
            weather.now = now;

            List<Forecast> forecastList = new ArrayList<>();
            weather.forecastList = forecastList;

            return weather;*/
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather6");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent,Weather.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
