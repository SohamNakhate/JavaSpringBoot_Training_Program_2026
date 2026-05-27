import StudentCard  from "./components/StudentCard"

function App() {
  return (
    <>
      <StudentCard name = "Soham" age = {21} city = "Nagpur" />
      <StudentCard name = "Yugant" age = {25} city = "Pune" />
      <StudentCard name = "Shresth" age = {41} city = "Mumbai" />
    </>
  )
}

export default App
