package com.hotelapp.service;

import java.util.List;

import com.hotelapp.model.Hotel;


public interface HotelService {
	
	List<Hotel> getAllHotels();
	List<Hotel> getByCity(String author);
	List<Hotel> getByCuisine(String category);
	Hotel getById(int id);

}
