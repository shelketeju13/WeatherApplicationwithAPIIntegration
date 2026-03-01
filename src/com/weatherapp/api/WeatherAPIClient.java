package com.weatherapp.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.weatherapp.models.WeatherData;
import com.weatherapp.utils.UnitConverter;
import com.weatherapp.utils.NetworkMonitor;

public class WeatherAPIClient {

    private static final String API_KEY = "fc233d4d2e0818e7c4ab5d5d0dd471a7";

    public static WeatherData getWeather(String city) {
        try {
            String urlStr = "https://api.openweathermap.org/data/2.5/weather?q="
                    + city + "&appid=" + API_KEY;

            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(5000);

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            String line;
            StringBuilder json = new StringBuilder();
            while ((line = br.readLine()) != null) {
                json.append(line);
            }

            JsonObject obj = JsonParser.parseString(json.toString()).getAsJsonObject();

            String cityName = obj.get("name").getAsString();
            double temp = UnitConverter.kelvinToCelsius(
                    obj.getAsJsonObject("main").get("temp").getAsDouble());
            double feels = UnitConverter.kelvinToCelsius(
                    obj.getAsJsonObject("main").get("feels_like").getAsDouble());

            int humidity = obj.getAsJsonObject("main").get("humidity").getAsInt();
            int pressure = obj.getAsJsonObject("main").get("pressure").getAsInt();

            double wind = UnitConverter.meterPerSecToKmPerHr(
                    obj.getAsJsonObject("wind").get("speed").getAsDouble());

            String desc = obj.getAsJsonArray("weather")
                    .get(0).getAsJsonObject().get("description").getAsString();

            NetworkMonitor.successCall();

            return new WeatherData(cityName, temp, feels, desc, humidity, wind, pressure);

        } catch (Exception e) {
            NetworkMonitor.failureCall();
            return null;
        }
    }
}