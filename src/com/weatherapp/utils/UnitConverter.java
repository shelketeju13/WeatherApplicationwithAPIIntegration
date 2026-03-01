package com.weatherapp.utils;

public class UnitConverter {

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double meterPerSecToKmPerHr(double mps) {
        return mps * 3.6;
    }
}