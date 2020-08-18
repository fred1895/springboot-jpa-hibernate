package com.coursespringboot.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursespringboot.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
