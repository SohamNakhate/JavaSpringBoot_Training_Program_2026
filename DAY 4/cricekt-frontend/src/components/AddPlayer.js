import { useState } from "react";

function AddPlayer({ addPlayer }) {
  const [player, setPlayer] = useState({
    name: "",
    team: "",
    role: "",
  });

  const handleChange = (e) => {
    setPlayer({
      ...player,
      [e.target.name]: e.target.value,
    });
  };

  const submit = (e) => {
    e.preventDefault();

    addPlayer(player);

    setPlayer({
      name: "",
      team: "",
      role: "",
    });
  };

  return (
    <div>
      <h2>Add Player</h2>

      <form onSubmit={submit}>
        <input
          type="text"
          name="name"
          placeholder="Player Name"
          value={player.name}
          onChange={handleChange}
        />

        <br />
        <br />

        <input
          type="text"
          name="team"
          placeholder="Team"
          value={player.team}
          onChange={handleChange}
        />

        <br />
        <br />

        <input
          type="text"
          name="role"
          placeholder="Role"
          value={player.role}
          onChange={handleChange}
        />

        <br />
        <br />

        <button type="submit">Add</button>
      </form>
    </div>
  );
}

export default AddPlayer;
