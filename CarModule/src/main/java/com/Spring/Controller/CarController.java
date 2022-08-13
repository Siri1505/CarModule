package com.Spring.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Exceptions.CarAlreadyExistException;
import com.Spring.Model.Car;
import com.Spring.Service.CarService;

@RestController
@RequestMapping("/Car")
public class CarController {
	
	@Autowired
	CarService carService;
	
	@PostMapping("/addCarDetails")
	public Car addCarDetails( @RequestBody Car car) throws CarAlreadyExistException{
		return carService.addCarDetails(car);
	}
	@DeleteMapping("/deleteCarDetails/{carId}")
	public ResponseEntity<String> deleteCarDetails(@PathVariable("carId") Long carId)  {
		 carService.deleteCarDetails(carId);
		 return new ResponseEntity<>(HttpStatus.OK);
	
	}
	
	//@PutMapping("/updateCarDetails/{carId}")
	//public ResponseEntity<Car> updateCarDetails(@PathVariable("carId")Long carId,@RequestBody Car car)  {
		//return carService.updateCarDetails(carId, car);
	//}
	
	
	  @PutMapping("/updateCarDetails/{carId}")
	  public Car updateCarDetails(@RequestBody Car carId) {
		  return carService.updateCarDetails(carId);
		   
	  }
	 
	 
	@GetMapping("/getCarDetails/{carId}")
	public  Car getCarDetails(@PathVariable("carId") Long carId) {
		return carService.getCarById(carId);
	}
	
	@GetMapping("/getAllCars")
	public List<Car>getAll(){
		return carService.getAllCars();
	}
	
	
	 @GetMapping("/getCarsByLocation/{registrationState}") 
	 public ResponseEntity<List<Car>> getCarByLocation(@PathVariable("registrationState") String registrationState ){
		 List<Car> carObj =carService.getCarByLocation(registrationState); 
		 return new ResponseEntity<List<Car>>(carObj, HttpStatus.OK);
	}
	 
		/*
		 * @GetMapping("/getCarsByModel/{model}") public
		 * ResponseEntity<List<Car>>getCarByModel(@PathVariable("model") String model ){
		 * List<Car> carObj = carService.getCarByModel(model); return new
		 * ResponseEntity<>(carObj, HttpStatus.OK); }
		 * 
		 * @GetMapping("/getCarsByBrand/{brand}") public
		 * ResponseEntity<List<Car>>getCarByBrand(@PathVariable("brand") String brand ){
		 * List<Car> carObj = carService.getCarByBrand(brand); return new
		 * ResponseEntity<>(carObj, HttpStatus.OK); }
		 */
	 
}
