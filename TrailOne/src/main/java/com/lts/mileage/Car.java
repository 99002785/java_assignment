package com.lts.mileage;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator {

	@Override
	public void showMileage(double petrol) {
		// TODO Auto-generated method stub
		System.out.println("Car mileage is " + petrol*20 +"Kms");

	}

}
