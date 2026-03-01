package com.weatherapp.models;

public class WeatherData {
    private String city;
    private double temperature;
    private double feelsLike;
    private String description;
    private int humidity;
    private double windSpeed;
    private int pressure;

    public WeatherData(String city, double temperature, double feelsLike,
                       String description, int humidity, double windSpeed, int pressure) {
        this.city = city;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.description = description;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }

    public String getCity() { return city; }
    public double getTemperature() { return temperature; }
    public double getFeelsLike() { return feelsLike; }
    public String getDescription() { return description; }
    public int getHumidity() { return humidity; }
    public double getWindSpeed() { return windSpeed; }
    public int getPressure() { return pressure; }
}