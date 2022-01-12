package com.erickdevs.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erickdevs.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
