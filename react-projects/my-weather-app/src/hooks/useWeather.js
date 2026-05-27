import { useState } from "react"

const API_KEY = "dad1e2ec79750755f12db20a61a012e1"

function useWeather() {
  const [weather, setWeather] = useState(null)
  const [loading, setLoading] = useState(false)
  const [error, setError] = useState("")

  const fetchWeather = async (city) => {
    if (!city) return

    setLoading(true)
    setError("")
    setWeather(null)

    try {
      const res = await fetch(
        `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${API_KEY}&units=metric`
      )
      const data = await res.json()

      if (data.cod !== 200) {
        setError("City not found!")
        setLoading(false)
        return
      }

      setWeather(data)
    } catch (err) {
      setError("Something went wrong!")
    }

    setLoading(false)
  }

  return { weather, loading, error, fetchWeather }
}

export default useWeather