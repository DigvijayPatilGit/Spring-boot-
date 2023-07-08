package com.example.carproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.carproject1.dto.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {
	
}
