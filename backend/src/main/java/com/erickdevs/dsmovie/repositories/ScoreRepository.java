package com.erickdevs.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erickdevs.dsmovie.entities.Score;
import com.erickdevs.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
