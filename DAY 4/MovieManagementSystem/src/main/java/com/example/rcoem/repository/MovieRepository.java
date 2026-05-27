package com.example.rcoem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rcoem.model.MovieModel;

@Repository
public interface MovieRepository extends JpaRepository<MovieModel, Long>{

}
