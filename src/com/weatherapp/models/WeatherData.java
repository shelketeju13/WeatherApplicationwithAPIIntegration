package com.weatherapp.models;

public class WeatherData {
    public String name;
    public Main main;
    public Wind wind;
    public Weather[] weather;

    public class Main {
        public double temp;
        public double feels_like;
        public int humidity;
        public int pressure;
    }

    public class Wind {
        public double speed;
    }

    public class Weather {
        public String main;
        public String description;
    }
}