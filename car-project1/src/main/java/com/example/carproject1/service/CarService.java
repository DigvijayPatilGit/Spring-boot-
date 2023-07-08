package com.example.carproject1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.carproject1.dao.CarDao;
import com.example.carproject1.dto.Car;
import com.example.carproject1.dto.ResposeStructure;
import com.example.carproject1.exception.CarDataNotStoredexception;
import com.example.carproject1.exception.DataNotAvailableException;
import com.example.carproject1.exception.NoIdAvailableException;

@Service
public class CarService {
	
	@Autowired
	CarDao dao;
	
	public ResponseEntity<ResposeStructure<Car>> saveCar(Car c) {
		Car car2=dao.saveCar(c);
		if(c!=null) {
			ResposeStructure<Car> structure=new ResposeStructure<Car>();
			structure.setCode(HttpStatus.OK.value());
			structure.setMessage("data Stored");
			structure.setData(c);
			return new ResponseEntity<ResposeStructure<Car>>(structure,HttpStatus.OK);
		}
		throw new CarDataNotStoredexception("Unable to Store the Data");
	}
	
	public List<Car> getAllCar(){
		return dao.getAllCars();
	}
	
	public ResponseEntity<ResposeStructure<Car>> getCarById(int id) {
		Car c= dao.getCarById(id);
		if(c!=null) {
			ResposeStructure<Car> structure=new ResposeStructure<Car>();
			structure.setCode(HttpStatus.FOUND.value());
			structure.setMessage("Data Found");
			structure.setData(c);
			return new ResponseEntity<ResposeStructure<Car>>(structure,HttpStatus.FOUND);
		}
		throw new DataNotAvailableException("No data with give Id");
				
	}
	
	public Car updateCar(Car c) {
		return dao.updateCar(c);
	}
	
	public String deleteCarById(int id) {
		return dao.deleteCarById(id);
	}

}
