package com.lts.mileage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleDetails {
	
	@Autowired
	@Qualifier("bike")
	MileCalculator bike;
	
	@Autowired
	@Qualifier("car")
	MileCalculator car;
	
	public void getMileage(double petrol,String choice) {
		if(choice.equals("Bike"))
			bike.showMileage(petrol);
		if(choice.equals("Car"))
			car.showMileage(petrol);
	}
	
	

}
