package com.sraschen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sraschen.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

		
}
