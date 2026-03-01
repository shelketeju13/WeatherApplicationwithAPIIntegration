# Weather Application – Project Documentation

## Project Overview

The Weather Application is a Java-based desktop application that provides real-time weather information for selected cities.  
It uses a public Weather API to fetch weather data, parses JSON responses, and displays formatted weather details such as temperature, humidity, wind speed, and weather conditions.

### Objectives
- Fetch real-time weather data using API integration  
- Display current weather and hourly forecast  
- Implement caching to reduce unnecessary API calls  
- Handle network and data errors gracefully  
- Show performance and network statistics  
- Follow clean code structure and documentation standards  

---

## Setup Instructions

### Requirements
- Java JDK 8 or higher  
- IDE (Spring Tool Suite / Eclipse / IntelliJ)  
- Internet connection  
- OpenWeatherMap API Key  
- JSON parsing library (org.json / Gson)  

### Installation Steps
1. Clone or download the project source code.
2. Open the project in your IDE.
3. Add required JSON library to project dependencies.
4. Place `sampleweather.json` in `src/main/resources`.
5. Add your API key in `WeatherAPIClient.java`.
6. Run the main class `Main.java` or `WeatherAppGUI.java`.

---

## Code Structure

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

## Visual Documentation

Screenshots included in the report:
- Application main screen showing current weather
- Hourly forecast table
- Weather alerts and statistics
- Cache and network status screen  

*(Attach screenshots in your project report)*

---

## Technical Details

### Architecture
- Follows MVC (Model-View-Controller) pattern  
- API Client → JSON Parser → Cache Manager → GUI  

### Data Structures
- `HashMap` for caching city weather data  
- `WeatherData` object for storing weather attributes  
- Lists for hourly forecast data  

### Algorithms
- API fetch algorithm  
- JSON parsing algorithm  
- Cache lookup before API call  
- Error detection and handling  

---

## API Integration

The application uses the OpenWeatherMap API.

Sample API URL:
`https://api.openweathermap.org/data/2.5/weather?q=Mumbai&appid=API_KEY&units=metric`

Steps:
1. Send HTTP request  
2. Receive JSON response  
3. Parse JSON into WeatherData object  
4. Display results  

---

## JSON Parsing

JSON response is parsed using a JSON library.

Extracted fields:
- `main.temp`  
- `main.feels_like`  
- `main.humidity`  
- `weather.description`  
- `wind.speed`  
- `main.pressure`  

Data is converted into readable format and stored in WeatherData objects.

---

## Caching Strategy

CacheManager stores recent weather data in memory.

### Features
- Reduces API calls  
- Cache expiry time (10 minutes)  
- Cache hit and miss statistics  
- Faster response time  

Structure:
HashMap<String, WeatherData>


---

## Error Handling

Handled errors include:
- Invalid city name  
- Network failure  
- API timeout  
- JSON parsing errors  

Techniques:
- Try-catch blocks  
- User-friendly error messages  
- Default fallback values  
- Logging for debugging  

---

## Testing Evidence

### Test Cases

| Test Case | Input | Expected Output |
|----------|-------|-----------------|
| Valid city | Mumbai | Weather displayed |
| Invalid city | Xyz123 | Error message |
| No internet | Offline | Network error |
| Cache test | Same city twice | Cache hit |
| JSON missing | Null | File error |

### Validation
- Output matched expected results  
- Cache hit statistics verified  
- API success and failure counts checked  

---

## Deployment Instructions

### Local Deployment
1. Compile the project  
2. Run Main class  
3. Enter city name  
4. View weather output  

---

## Quality Standards Checklist

- Clear project overview  
- Setup instructions included  
- Organized code structure  
- Screenshots provided  
- Technical explanation  
- Testing evidence  
- Error handling documented  
- API integration explained  
- JSON parsing documented  
- Caching strategy explained  
- Deployment instructions included  

---

## Conclusion

The Weather Application successfully demonstrates API integration, JSON parsing, caching, and error handling using Java.  
It provides accurate weather information with improved performance through caching and proper network handling.  
The project follows clean architecture, structured code design, and meets all documentation and quality standards.

---

## Author

**Tejaswini Shelke**