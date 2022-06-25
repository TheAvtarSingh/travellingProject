package org.ncu.travellingProject.service;


import java.util.List;

import org.ncu.travellingProject.dao.travellingdao;
import org.ncu.travellingProject.entity.Admin;
import org.ncu.travellingProject.entity.Hotel;
import org.ncu.travellingProject.entity.HotelOwner;
import org.ncu.travellingProject.entity.User;
import org.ncu.travellingProject.entity.UserBookingDetails;
import org.ncu.travellingProject.rsExtractor.HotelOwnerResultSetExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class travellingServiceImpl implements travellingService{
	@Autowired
	travellingdao travellingdao;
	

	@Override
	public List<Hotel> getHotels() {
		// TODO Auto-generated method stub
List<Hotel> hotelslist = travellingdao.getHotels();
		
		return hotelslist;
	}


	@Override
	public List<Hotel> getFilteredHotels(String city, int minPrice, int maxPrice, int ratings) {
		// TODO Auto-generated method stub
List<Hotel> hotelslist = travellingdao.getFilteredHotels(city, minPrice, maxPrice, ratings);
		
		return hotelslist;
	}


	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		List<User> userslist = travellingdao.getUsers();
		return userslist;
	}


	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		travellingdao.createUser(user);
		System.out.println("Done");
	}


	@Override
	public List<Admin> getadmins() {
		// TODO Auto-generated method stub
		List<Admin> adminsList = travellingdao.getadmins();
		return adminsList;
	}

	@Override
	public List<HotelOwner> getownersList() {
		// TODO Auto-generated method stub
		List<HotelOwner> ownersList = travellingdao.getownersList();
		return ownersList;
	}


	@Override
	public void createOwner(HotelOwner owner) {
		// TODO Auto-generated method stub
		travellingdao.createOwner(owner);
		System.out.println("Done");
	}


	@Override
	public void createHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		travellingdao.createHotel(hotel);
		System.out.println("Done");
		
	}


	@Override
	public List<Hotel> getTakenHotels(int number) {
		// TODO Auto-generated method stub
List<Hotel> hotelslist = travellingdao.getTakenHotels(number);
		
		return hotelslist;
	}


	@Override
	public void deleteHotel(int number) {
		// TODO Auto-generated method stub
		travellingdao.deleteHotel(number);
		System.out.println("Done");
		
	}


	@Override
	public void updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		travellingdao.updateHotel(hotel);
		System.out.println("Done");
	}


	@Override
	public void bookHotel(UserBookingDetails bookings) {
		// TODO Auto-generated method stub
		travellingdao.bookHotel(bookings);
		System.out.println("Done");
	}


	@Override
	public List<UserBookingDetails> getMyBookingDetails(int number) {
		// TODO Auto-generated method stub
List<UserBookingDetails> hotelslist = travellingdao.getMyBookingDetails(number);
		
		return hotelslist;
	}


	@Override
	public void deleteBooking(int number) {
		// TODO Auto-generated method stub
		travellingdao.deleteBooking(number);
		System.out.println("Done");
	}


	@Override
	public void updateBookings(UserBookingDetails bookings) {
		// TODO Auto-generated method stub
		travellingdao.updateBookings(bookings);
		
	}
}
