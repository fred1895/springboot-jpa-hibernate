package com.coursespringboot.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursespringboot.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
