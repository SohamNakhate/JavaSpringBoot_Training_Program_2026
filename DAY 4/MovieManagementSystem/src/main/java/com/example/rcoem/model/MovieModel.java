package com.example.rcoem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Movie_Table")
public class MovieModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(name = "Movie_Name")
	private String movieName; 
	
	@Column(name = "Director_Name")
	private String directorName; 
	
	@Column(name = "Rating")
	private double rating;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public MovieModel(Long id, String movieName, String directorName, double rating) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.directorName = directorName;
		this.rating = rating;
	}

	public MovieModel() {
	}
	
	
	@Override
	public String toString() {
		return "MovieModel [id=" + id + ", movieName=" + movieName + ", directorName=" + directorName + ", rating="
				+ rating + "]";
	} 
	
	
	
}
