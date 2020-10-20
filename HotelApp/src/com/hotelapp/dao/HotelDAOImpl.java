package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import com.hotelapp.model.Hotel;

public class HotelDAOImpl implements HotelDAO {

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList = new ArrayList<>() ;
		for (Hotel hotel : showHotelList()) {
			if(hotel.getCity().equals(city))
				newHotelList.add(hotel);
		}
		return newHotelList;
		
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList = new ArrayList<>() ;
		for (Hotel hotel : showHotelList()) {
			if(hotel.getCuisine().equals(cuisine))
				newHotelList.add(hotel);
		}
		return newHotelList;
	}

	@Override
	public Hotel getById(int id) {
		for (Hotel hotel : showHotelList()) {
			if(hotel.getHotelId()==id)
				return hotel;
		}
		return null;
	
	}
	
	
	private List<Hotel> showHotelList() {
		return Arrays.asList(
				new Hotel("Udippi" ,1, "Chennai","Chinese"),
				new Hotel("Thalapakati" ,2, "Mysore","Indian"),
				new Hotel("A2B" ,3, "Bangalore","Indian"),
				new Hotel("Arya" ,4, "Patna","Indian"));
		
	}

}
