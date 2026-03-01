package com.weatherapp.alerts;

import com.weatherapp.models.WeatherData;

public class WeatherAlerts {

    public static String checkAlerts(WeatherData data) {
        StringBuilder alert = new StringBuilder();

        if (data.getWindSpeed() > 20) {
            alert.append("⚠ High Wind Warning\n");
        }
        if (data.getHumidity() > 80) {
            alert.append("⚠ Rain Advisory\n");
        }
        if (alert.length() == 0) {
            alert.append("No alerts");
        }
        return alert.toString();
    }
}