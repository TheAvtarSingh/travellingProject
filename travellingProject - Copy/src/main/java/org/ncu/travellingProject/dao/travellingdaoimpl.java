package org.ncu.travellingProject.dao;


import java.util.List;
import java.util.Random;

import org.ncu.travellingProject.entity.Admin;
import org.ncu.travellingProject.entity.Hotel;
import org.ncu.travellingProject.entity.HotelOwner;
import org.ncu.travellingProject.entity.User;
import org.ncu.travellingProject.entity.UserBookingDetails;
import org.ncu.travellingProject.rowmapper.hotelRowMapper;
import org.ncu.travellingProject.rsExtractor.AdminResultSetExtractor;
import org.ncu.travellingProject.rsExtractor.HotelOwnerResultSetExtractor;
import org.ncu.travellingProject.rsExtractor.UserBookingDataResultSetExtractor;
import org.ncu.travellingProject.rsExtractor.UserResultSetExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;
@Repository
public class travellingdaoimpl implements travellingdao {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	


	@Override
	public List<Hotel> getHotels() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM hotels";
		List<Hotel> hotelList = jdbcTemplate.query(query, new hotelRowMapper());
		return hotelList;
	}


	@Override
	public List<Hotel> getFilteredHotels(String city, int minPrice, int maxPrice, int ratings) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM hotels where hotelCity=? and hotelStatus=? and roomAvailable= ?  and price>=? and price<=? and hotelRating = ?;";
		List<Hotel> hotelList = jdbcTemplate.query(query, new hotelRowMapper(),city,"Verified","Y",minPrice,maxPrice,ratings);
		return hotelList;
	}


	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM users";
		List<User> usersList = jdbcTemplate.query(query, new UserResultSetExtractor());
		return usersList;
	}


	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		String query = "insert into users values(?,?)";
		Object records[] = { user.getUsername(), user.getPassword() };
		jdbcTemplate.update(query, records);
		System.out.println("Records added successfully! " + user.getUsername());
	}


	@Override
	public List<Admin> getadmins() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM admin";
		List<Admin> adminList = jdbcTemplate.query(query, new AdminResultSetExtractor());
		return adminList;
	}


	@Override
	public List<HotelOwner> getownersList() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM hotelowner";
		List<HotelOwner> ownerList = jdbcTemplate.query(query, new HotelOwnerResultSetExtractor());
		return ownerList;
	}


	@Override
	public void createOwner(HotelOwner owner) {
		// TODO Auto-generated method stub
		String query = "insert into hotelowner values(?,?,?,?,?)";
		Random random = new Random();
		int id = random.nextInt(100, 1000);
		
		Object records[] = {id,owner.getOwnerName(),owner.getOwneraddress(),owner.getOwnernumber(),owner.getOwneremail() };
		jdbcTemplate.update(query, records);
		System.out.println("Records added successfully! " +owner.getOwnerName());
	}


	@Override
	public void createHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		String query = "insert into hotels values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		
		Object records[] = {hotel.getHotelNumber(),hotel.getHotelName(),hotel.getHotelCountry(),hotel.getHotelCity(),hotel.getRoomAvailable(),"NotVerified",hotel.getPhoneNumber(),hotel.getEmail(),hotel.getPincode(),hotel.getLandmark(),hotel.getPrice(),hotel.getHotelRating() };
		jdbcTemplate.update(query, records);
		System.out.println("Records added successfully! " +hotel.getHotelName());
	}


	@Override
	public List<Hotel> getTakenHotels(int number) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM hotels where hotelNumber=? ;";
		List<Hotel> hotelList = jdbcTemplate.query(query, new hotelRowMapper(),number);
		return hotelList;
	}


	@Override
	public void deleteHotel(int number) {
		// TODO Auto-generated method stub
		String query = "delete FROM hotels where hotelNumber=? ;";
		int check = jdbcTemplate.update(query,number);
		if (check==1) {
			System.out.println("Done");
			
		}
	else {
		System.out.println("No");
	}
	}


	@Override
	public void updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		String query = "update hotels set hotelName=?,hotelCountry=?,hotelCity=?,roomAvailable=?,hotelStatus=?,phoneNumber=?,email=?,Pincode=?,landmark=?,price=?,hotelRating=? where hotelNumber=?;";
		int check = jdbcTemplate.update(query,hotel.getHotelName(),hotel.getHotelCountry(),hotel.getHotelCity(),hotel.getRoomAvailable(),"NotVerified",hotel.getPhoneNumber(),hotel.getEmail(),hotel.getPincode(),hotel.getLandmark(),hotel.getPrice(),hotel.getHotelRating(),hotel.getHotelNumber());
		System.out.println(check);
	}


	@Override
	public void bookHotel(UserBookingDetails bookings) {
		// TODO Auto-generated method stub
String query = "insert into userenteries values(?,?,?,?,?,?,?,?,?,?)";
		
		
		Object records[] = {bookings.getHotelid(),bookings.getRoomNumbers(),bookings.getNoofdays(),bookings.getNeedCarParking(),bookings.getNeedFoodService(),bookings.getNeedGamingService(),bookings.getPanNumber(),bookings.getNeedSecurity(),bookings.getNoofPersons(),"Processing" };
		jdbcTemplate.update(query, records);
		System.out.println("Records added successfully! " +bookings.getHotelid());
	}


	@Override
	public List<UserBookingDetails> getMyBookingDetails(int number) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM userenteries where hotelid=? ;";
		List<UserBookingDetails> hotelList = jdbcTemplate.query(query, new UserBookingDataResultSetExtractor(),number);
		return hotelList;
	}


	@Override
	public void deleteBooking(int number) {
		// TODO Auto-generated method stub
		String query = "delete FROM userenteries where hotelid=? ;";
		int check = jdbcTemplate.update(query,number);
		if (check==1) {
			System.out.println("Done");
			
		}
	else {
		System.out.println("No");
	}
	}


	@Override
	public void updateBookings(UserBookingDetails bookings) {
		// TODO Auto-generated method stub
		String query = "update userenteries set roomNumbers=?,noofdays=?,needCarParking=?,needFoodService=?,needGamingService=?,panNumber=?,needSecurity=?,noofPersons=? where hotelid=?;";
		int check = jdbcTemplate.update(query,bookings.getRoomNumbers(),bookings.getNoofdays(),bookings.getNeedCarParking(),bookings.getNeedFoodService(),bookings.getNeedGamingService(),bookings.getPanNumber(),bookings.getNeedSecurity(),bookings.getNoofPersons(),bookings.getHotelid());
		System.out.println(check);
	}

}
