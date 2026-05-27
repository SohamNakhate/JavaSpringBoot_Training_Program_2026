import PlayerCard from "./PlayerCard";

function PlayerList({players,onDelete}) {
    return (

        <div>

            <h2>Players List</h2>
            {
                players.map((player)=>(
                    <PlayerCard
                        key={player.id}
                        player={player}
                        onDelete={onDelete}
                    />

                ))
            }

        </div>

    );
}

export default PlayerList;