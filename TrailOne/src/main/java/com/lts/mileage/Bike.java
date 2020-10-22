package com.lts.mileage;

import org.springframework.stereotype.Component;

@Component
public class Bike implements MileCalculator {

	@Override
	public void showMileage(double petrol) {
		// TODO Auto-generated method stub
		System.out.println("Bike mileage is " + petrol*40 +"Kms");

	}

}
