package com.sraschen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sraschen.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

		
}
