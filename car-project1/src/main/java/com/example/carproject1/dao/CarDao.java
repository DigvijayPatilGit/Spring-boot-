package com.example.carproject1.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.example.carproject1.dto.Car;
import com.example.carproject1.dto.ResposeStructure;
import com.example.carproject1.repository.CarRepo;

@Repository
public class CarDao {
	
	@Autowired
	CarRepo repo;
	
	public Car saveCar(Car c) {
		return repo.save(c);
	}
	
	public List<Car> getAllCars(){
		return repo.findAll();
	}
	
	public Car getCarById(int id) {
		Optional<Car> optional=repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			return null;
		}
		
	}
	
	public Car updateCar(Car c) {
		return repo.save(c);
	}
	
	public String deleteCarById(int id) {
		Optional<Car> optional=repo.findById(id);
		if(optional.isPresent()) {
			Car c=optional.get();
			repo.delete(c);
			return c.getName()+" is deleted Successfully";
		}
		else {
			return null;
		}
	}

}
