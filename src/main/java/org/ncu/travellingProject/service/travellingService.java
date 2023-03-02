package org.ncu.travellingProject.service;



import java.util.List;

import org.ncu.travellingProject.entity.Admin;
import org.ncu.travellingProject.entity.Hotel;
import org.ncu.travellingProject.entity.HotelOwner;
import org.ncu.travellingProject.entity.User;
import org.ncu.travellingProject.entity.UserBookingDetails;



public interface travellingService {
	
	
	public List<Hotel> getHotels();
	public List<Hotel> getFilteredHotels(String city,int minPrice,int maxPrice,int ratings);
	public List<User> getUsers();
	public void createUser(User user);
	public List<Admin> getadmins();
	public List<HotelOwner> getownersList();
	public void createOwner(HotelOwner owner);
	public void createHotel(Hotel hotel);
	public List<Hotel> getTakenHotels(int number);
	public void deleteHotel(int number);
	public void updateHotel(Hotel hotel);
	public void bookHotel(UserBookingDetails bookings);
	public List<UserBookingDetails> getMyBookingDetails(int number);
	public void deleteBooking(int number);
	public void updateBookings(UserBookingDetails bookings);
}
