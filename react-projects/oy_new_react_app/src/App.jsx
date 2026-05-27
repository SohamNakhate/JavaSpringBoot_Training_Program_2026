import {useState} from 'react'

function App() {

  const [name, useName] = useState("")

  return (
    <div>
      <input type="text" placeholder = "Type some text here..." onChange={(e) => useName(e.target.value)} />
      <h1>Hello, {name}</h1>
      
    </div>
  )
}

export default App
