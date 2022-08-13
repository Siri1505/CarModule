package com.Spring.Repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.Model.Car;

@Repository
public interface CarRepo extends JpaRepository<Car,Long>{

	

	List<Car> findByLocation(String registrationState);

	/*
	 * List<Car> findByLocation(String registrationState);
	 * 
	 * List<Car> findByModel(String model);
	 * 
	 * List<Car> findByBrand(String brand);
	 */

	
	

	
	

	

}
