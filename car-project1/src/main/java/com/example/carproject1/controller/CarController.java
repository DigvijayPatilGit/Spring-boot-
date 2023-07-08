package com.example.carproject1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carproject1.dto.Car;
import com.example.carproject1.dto.ResposeStructure;
import com.example.carproject1.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	CarService service;
	
	@PostMapping
	public ResponseEntity<ResposeStructure<Car>> saveCar(@RequestBody Car c) {
		return service.saveCar(c);
	}
	
	@GetMapping
	public List<Car> getAllCar(){
		return service.getAllCar();
	}
	
	@GetMapping("/{id}")
	public Object getCarById(@PathVariable int id) {
		return service.getCarById(id);
	}
	
	@PutMapping
	public Car updateCar(@RequestBody Car c) {
		return service.updateCar(c);
	}
	
	@DeleteMapping("/{id}")
	public String deleteCarById(@PathVariable int id) {
		return service.deleteCarById(id);
	}

}
