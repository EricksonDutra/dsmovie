package com.erickdevs.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erickdevs.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
