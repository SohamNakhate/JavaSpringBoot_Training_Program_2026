function PlayerCard({player,onDelete}) {

    return (
        <div
            style={{
                border:"1px solid black",
                padding:"10px",
                margin:"10px"
            }}
        >

            <h3>{player.name}</h3>
            <p>Team: {player.team}</p>
            <p>Role: {player.role}</p>
            <button
                onClick={()=>onDelete(player.id)}
            >
                Delete
            </button>

        </div>
    );
}

export default PlayerCard;