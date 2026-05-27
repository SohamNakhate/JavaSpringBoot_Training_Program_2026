import { useEffect, useState } from "react";

import Header from "./components/Header";
import AddPlayer from "./components/AddPlayer";
import PlayerList from "./components/PlayerList";

import CricketService from "./services/CricketService";

import "./App.css";

function App() {
  const [players, setPlayers] = useState([]);

  useEffect(() => {
    loadPlayers();
  }, []);

  const loadPlayers = () => {
    CricketService.getAllPlayers()
      .then((response) => {
        setPlayers(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const addPlayer = (player) => {
    CricketService.addPlayer(player).then(() => {
      loadPlayers();
    });
  };

  const deletePlayer = (id) => {
    CricketService.deletePlayer(id).then(() => {
      loadPlayers();
    });
  };

  return (
    <div className="App">
      <Header />

      <AddPlayer addPlayer={addPlayer} />

      <PlayerList players={players} onDelete={deletePlayer} />
    </div>
  );
}

export default App;
