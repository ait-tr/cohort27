// кидаем fetch запрос на https://get.geojs.io/v1/ip/geo.json
//

async function getWeather() {
  const response = await fetch("https://get.geojs.io/v1/ip/geo.json");
  const data = await response.json();
  const { latitude, longitude, city } = data;
  const weatherRes = await fetch(`https://api.open-meteo.com/v1/forecast?latitude=${latitude}&longitude=${longitude}&current_weather=true`);
  const weatherData = await weatherRes.json();
  const { current_weather } = weatherData;
  const { temperature, windspeed, weathercode } = current_weather;
  console.log(city, temperature, windspeed, getWeatherCode(weathercode));
}

function getWeatherCode(code) {
  switch (code) {
    case 0:
      return 'Clear sky'
    case 1:
    case 2:
    case 3:
      return 'Mainly clear, partly cloudy, and overcast'
    case 45:
    case 48:
      return 'Fog and depositing rime fog'
    case 51:
    case 53:
    case 55:
     return 'Drizzle: Light, moderate, and dense intensity'
     case 56:
      case 57:
        weatherDescription = "Freezing Drizzle: Light and dense intensity";
        return;
      case 61:
      case 63:
      case 65:
        weatherDescription = "Rain: Slight, moderate, and heavy intensity";
        return;
      case 66:
      case 67:
        weatherDescription = "Freezing Rain: Light and heavy intensity";
        return;
      case 71:
      case 73:
      case 75:
        weatherDescription = "Snow fall: Slight, moderate, and heavy intensity";
        return;
      case 77:
        weatherDescription = "Snow grains";
        return;
      case 80:
      case 81:
      case 82:
        weatherDescription = "Rain showers: Slight, moderate, and violent";
        return;
      case 85:
      case 86:
        weatherDescription = "Snow showers slight and heavy";
        return;
      case 95:
        weatherDescription = "Thunderstorm: Slight or moderate";
        return;
      case 96:
      case 99:
        weatherDescription = "Thunderstorm with slight and heavy hail";
        return;
      default:
        weatherDescription = "Unknown";
    }

  }


getWeather();
