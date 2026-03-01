package com.weatherapp.cache;

import java.util.HashMap;
import com.weatherapp.models.WeatherData;

public class CacheManager {

    private static HashMap<String, WeatherData> cache = new HashMap<>();
    private static HashMap<String, Long> cacheTime = new HashMap<>();
    private static final long CACHE_DURATION = 10 * 60 * 1000; // 10 minutes

    public static WeatherData getCachedData(String city) {
        if (cache.containsKey(city)) {
            long time = System.currentTimeMillis() - cacheTime.get(city);
            if (time < CACHE_DURATION) {
                return cache.get(city);
            }
        }
        return null;
    }

    public static void putCache(String city, WeatherData data) {
        cache.put(city, data);
        cacheTime.put(city, System.currentTimeMillis());
    }
}