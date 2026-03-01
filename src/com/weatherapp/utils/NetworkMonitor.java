package com.weatherapp.utils;

public class NetworkMonitor {
    private static int success = 0;
    private static int failure = 0;

    public static void successCall() {
        success++;
    }

    public static void failureCall() {
        failure++;
    }

    public static String getStats() {
        int total = success + failure;
        return "API Calls: " + total +
               "\nSuccessful: " + success +
               "\nFailed: " + failure;
    }
}