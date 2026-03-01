package com.weatherapp.models;

public class ForecastData {
    private String day;
    private double maxTemp;
    private double minTemp;
    private String weather;

    public ForecastData(String day, double maxTemp, double minTemp, String weather) {
        this.day = day;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.weather = weather;
    }

    public String getDay() { return day; }
    public double getMaxTemp() { return maxTemp; }
    public double getMinTemp() { return minTemp; }
    public String getWeather() { return weather; }
}