# WeatherApplicationwithAPIIntegration

## Features
- Live weather data
- 5-day forecast
- City search
- Caching
- Weather alerts
- GUI desktop app

## Technologies
- Java
- Swing
- OpenWeatherMap API
- Gson
- STS IDE

## How to Run
1. Clone repo
2. Add API key in config.properties
3. Run MainApp.java

## Project Structure

```
WeatherApplication
│
├── src/com/weatherapp/
│   ├── models/
│   │   ├── WeatherData.java
│   │   ├── ForecastData.java
│   │
│   ├── api/
│   │   └── WeatherAPIClient.java
│   │
│   ├── gui/
│   │   └── WeatherAppGUI.java
│   │
│   ├── cache/
│   │   └── CacheManager.java
│   │
│   ├── alerts/
│   │   └── WeatherAlerts.java
│   │
│   ├── utils/
│   │   ├── UnitConverter.java
│   │   ├── NetworkMonitor.java
│   │
│   └── MainApp.java
│
├── config/
│   └── config.properties
│
├── test_data/
│   └── sample_weather.json
│
├── resources/
│   └── icons/
│
├── docs/
│   └── documentation.md
│
└── README.md
```