package com.coursespringboot.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursespringboot.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
