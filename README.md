# WeatherApplicationwithAPIIntegration

## Project Overview

The Weather Application is a Java-based desktop app that shows real-time weather information for a selected city.  
It uses the OpenWeatherMap API to fetch data and displays temperature, humidity, wind speed, pressure, and weather conditions in a formatted layout.

The project demonstrates API integration, JSON parsing, object-oriented programming (OOP), and Java Swing GUI development.  
It also includes features like caching, weather alerts, and network status monitoring for better performance and reliability.

---

## Object (Object-Oriented Design)

The Weather Application is developed using an object-oriented approach. Each major functionality is implemented using a separate class.

### Main Objects and Their Purpose

- **WeatherData**
  - Stores current weather details such as temperature, feels-like temperature, humidity, wind speed, and pressure.

- **ForecastData**
  - Stores forecast information such as day, minimum temperature, maximum temperature, and weather condition.

- **WeatherAPIClient**
  - Connects to the OpenWeatherMap API.
  - Fetches and parses JSON weather data.

- **WeatherAppGUI**
  - Main graphical user interface of the application.
  - Takes city input and displays formatted weather output.

- **CacheManager**
  - Manages cached weather data to reduce repeated API calls.
  - Uses time-based cache expiration.

- **WeatherAlerts**
  - Generates alerts such as High Wind Warning and Rain Advisory based on weather conditions.

- **UnitConverter**
  - Converts units (Kelvin to Celsius, m/s to km/h).

- **NetworkMonitor**
  - Tracks API calls, successful responses, and failed requests.

This modular design improves code readability, reusability, and maintainability.

---

## Features
- Live weather data
- 5-day forecast
- City search
- Caching
- Weather alerts
- GUI desktop app

---

## Technologies
- Java
- Swing
- OpenWeatherMap API
- Gson
- STS IDE

---

## How to Run
1. Clone repo
2. Add API key in config.properties
3. Run WeatherAppGUI.java

---

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
│   └── utils/
│       ├── UnitConverter.java
│       ├── NetworkMonitor.java
│   
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

---

## Setup and Instructions

Follow the steps below to run the Weather Application:

1. Install Java (JDK 8 or above).
2. Download or clone the project repository.
3. Open the project in Eclipse or Spring Tool Suite (STS).
4. Download the Gson library and add `gson.jar` to the project build path.
5. Create an account on OpenWeatherMap and generate an API key.
6. Add the API key in `WeatherAPIClient.java` or in `config.properties`.
7. Run the `WeatherAppGUI.java` file as a Java Application.
8. Enter a city name in the input box.
9. Click the **Get Weather** button to view the weather report.

---

## Testing

The application was tested under different conditions to ensure reliability and correctness.

### Test Scenarios

- **Valid City Input**
  - Input: Mumbai, Delhi, London  
  - Output: Weather data displayed correctly.

- **Invalid City Input**
  - Input: Random or incorrect city name  
  - Output: Error message shown without application crash.

- **Network Error Handling**
  - Internet connection disabled  
  - Output: Application handles the error gracefully and updates failure count.

- **Cache Functionality**
  - Same city searched repeatedly within cache duration  
  - Output: Data loaded from cache instead of API.

- **Alert Generation**
  - High wind speed → High Wind Warning  
  - High humidity → Rain Advisory  

All test cases were executed successfully and the application performed as expected.

---

## Conclusion

The Weather Application successfully meets the internship project requirements by providing:

- Real-time weather information using API integration  
- A user-friendly desktop GUI  
- Weather alerts and statistics  
- Caching and network performance monitoring  
- Structured and formatted output  

This project demonstrates practical knowledge of Java programming, API handling, and GUI development.  
It can be further enhanced by adding 5-day forecast, multiple city comparison, and theme customization features.

The project is suitable for academic submission and internship evaluation.

---

## Author

**Tejaswini Shelke**