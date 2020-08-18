package com.coursespringboot.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursespringboot.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
