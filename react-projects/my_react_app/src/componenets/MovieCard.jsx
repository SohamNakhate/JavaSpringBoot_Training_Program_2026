
function MovieCard({ Movie_title, release_year, genre, rating, img }) {
  return (
    <div className="movie-card" style={{ border: '1px solid #ccc', padding: '16px', borderRadius: '8px', maxWidth: '300px' }}>
      <h2>{Movie_title}</h2>
      <p>Release Year: {release_year}</p>
      <p>Genre: {genre}</p>
      <p>Rating: {rating}/5</p>
      <img src={img} alt="Movie Poster" />
    </div>


  )
}

export default MovieCard
