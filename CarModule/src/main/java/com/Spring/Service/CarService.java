package com.Spring.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Exceptions.CarAlreadyExistException;
import com.Spring.Model.Car;
import com.Spring.Repo.CarRepo;

@Service
public class CarService {
	@Autowired
	
	CarRepo carRepo;

	public  Car addCarDetails(Car car) throws CarAlreadyExistException{
		Optional<Car> optionalCar = carRepo.findById(car.getCarId());
		if(optionalCar.isPresent()) {
			throw new CarAlreadyExistException("Car Already Exist....");
		}
		return carRepo.save(car);
		
	}

	public void deleteCarDetails(Long carId) {
		carRepo.deleteById(carId);
	}

	
	public  List<Car> getAllCars(){
		return (List<Car>) carRepo.findAll();
	}

	
	
	
	 public List<Car> getCarByLocation(String registrationState) { 
		 return carRepo.findByLocation(registrationState); 
	}
	 
	/*
	 * public List<Car> getCarByModel(String model) { return (List<Car>)
	 * carRepo.findByModel(model); }
	 * 
	 * public List<Car> getCarByBrand(String brand) { return (List<Car>)
	 * carRepo.findByBrand(brand); }
	 */
	
	  public Car updateCarDetails( Car carId) {
	      return carRepo.save(carId);
	  }
	 

	public Car getCarById(Long carId) {
		return carRepo.findById(carId).get();
	}

	
	
	 
	 

	/*
	 * public Car fetchCarByLocation(String registrationState) { return
	 * carRepo.findByLocation(registrationState); }
	 */
	
	

	
	
	

	
	

	


	

	
	


	

	

	
	

	/*
	 * public ResponseEntity<Car> getCar(Long carId) { return carRepo.save(carId); }
	 */

	
  

	
	
	

	

	

	

	
	

	
}
