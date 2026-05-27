

function WeatherCard({weather}) {

  return (
    <div>

        <h2>{weather.name}, {weather.sys.country}</h2>
        <p>Temperature: {weather.main.temp} °C</p>
        <p>Feels Like: {weather.main.feels_like} °C</p>
        <p>Humidity: {weather.main.humidity} %</p>
        <p>Wind Speed: {weather.wind.speed} km/h</p>
        <p>Description: {weather.weather[0].description}</p>

    </div>
  )
}

export default WeatherCard
