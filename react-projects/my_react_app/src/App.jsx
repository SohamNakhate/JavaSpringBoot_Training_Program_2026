//import Button from "./componenets/button";
import MovieCard from "./componenets/MovieCard";
import Avenger from "./assets/Avengers.jpg"
import Inception from "./assets/Inception.jpg"
import DarkKnight from "./assets/Dark-Knight.jpg"
import { useState } from "react";

function App() {

  const name = "John Doe";
  const isLoggedIn = true; 

  const initial_value = 0;
  const [count, setCount] = useState(initial_value);

  return (
    <div>
      {/* <Button />
      <Button /> */}

      <h1>Hello, {name}</h1>

      {isLoggedIn ? <h3>welcome back</h3> : <h3>Please login</h3>}

    {/* COUNTER */}
    <h1>COUNT: {count}</h1>
    <button onClick={() => setCount(count + 1)} >+</button>
    <button onClick = {() => setCount(count - 1)}>-</button>
    <button onClick = {() => setCount(initial_value)} >RESET</button>



      {/* PRPOS */}
      <h1>Movie Cards</h1>
      <MovieCard Movie_title="Avengers: Endgame" release_year="2019" genre="Action" rating="4.7" img={Avenger} />
      <MovieCard Movie_title="Inception" release_year="2010" genre="Sci-Fi" rating="4.5" img={Inception} />
      <MovieCard Movie_title="The Dark Knight" release_year="2008" genre="Action" rating="4.8" img={DarkKnight} />


    </div>
  );
}

export default App;
