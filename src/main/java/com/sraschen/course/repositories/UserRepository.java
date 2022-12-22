package com.sraschen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sraschen.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

		
}
