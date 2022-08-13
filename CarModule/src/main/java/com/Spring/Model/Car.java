package com.Spring.Model;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Cars")
public class Car {
	@Id
	
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@NotNull
	@Column(name = "CAR_Id")
	//@Size(min=1, message = "ID cannot be zero or Null" )
	private long carId;
	
	@Column(name = "BRAND")
	//@NotBlank
	//@Size(min=2,message = "brand length should be min of 2")
	private String brand;
	
	@Column(name = "MODEL")
	//@NotBlank
	//@Size(min=2,message = "model length should be min of 2")
	private String model;
	
	@Column(name = "VARIANT")
	//@NotBlank
	//@Size(min=2,message = "variant length should be min of 2")
	private String variant;
	
	@Column(name = "REGISTRATION_YEAR")
	//@NotBlank
	//@Size(max=4 ,message = "year should be max of 4")
	private LocalDate registrationYear;
	
	@Column(name = "REGISTRATION_STATE")
	//@NotBlank
	//@Size(min=2,message = "state length should be min of 2")
	private String registrationState;

	public long getCarId() {
		return carId;
	}
	
	public void setCarId(long carId) {
		this.carId = carId;
	}

	
	  public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getVariant() {
		return variant;
	}



	public void setVariant(String variant) {
		this.variant = variant;
	}



	public LocalDate getRegistrationYear() {
		return registrationYear;
	}



	public void setRegistrationYear(LocalDate registrationYear) {
		this.registrationYear = registrationYear;
	}



	public String getRegistrationState() {
		return registrationState;
	}



	public void setRegistrationState(String registrationState) {
		this.registrationState = registrationState;
	}



	


	/*
	 * public Car() { super(); }
	 */
	  
			/*
			 * @Bean(name="entityManagerFactory") public LocalSessionFactoryBean
			 * sessionFactory() { LocalSessionFactoryBean sessionFactory = new
			 * LocalSessionFactoryBean(); return sessionFactory; }
			 */
	 
	
	
	
}
