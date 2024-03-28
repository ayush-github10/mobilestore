package com.sopra.microservices;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="mobilestore")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MobileStore {
	
	String brand;
	String model;
	@Id 
	String imei;
	double price;
	String ram;
	String rom;
	String image;
	

}
