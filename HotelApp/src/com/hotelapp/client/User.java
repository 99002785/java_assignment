package com.hotelapp.client;

import java.util.List;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.HotelServiceImpl;

public class User {

	public static void main(String[] args) {
		
		
		HotelService hotelService = new HotelServiceImpl();
		String city = "Chennai";
		String cuisine  = "Indian";
		List<Hotel> hotelList = hotelService.getAllHotels();
		List<Hotel> cityList = hotelService.getByCity(city);
		List<Hotel> cuisineList = hotelService.getByCuisine(cuisine);

		
		for(Hotel hotel: hotelList )
			System.out.println(hotel);
		
		System.out.println("--------------------------------------");
		Integer id = 2;
		System.out.println(hotelService.getById(id));
		
		System.out.println("--------------------------------------");
		
		for(Hotel cityiterator: cityList )
			System.out.println(cityiterator);
		
		System.out.println("--------------------------------------");
		
		for(Hotel cuisineiterator: cuisineList )
			System.out.println(cuisineiterator);
		
		
		
	}
	
	
}
