package com.coursespringboot.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursespringboot.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
