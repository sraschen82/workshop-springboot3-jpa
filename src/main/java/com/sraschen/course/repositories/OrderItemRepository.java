package com.sraschen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sraschen.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

		
}
