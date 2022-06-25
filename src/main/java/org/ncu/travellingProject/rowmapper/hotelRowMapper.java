package org.ncu.travellingProject.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.ncu.travellingProject.entity.Hotel;
import org.springframework.jdbc.core.RowMapper;

public class hotelRowMapper implements RowMapper<Hotel> {

	@Override
	public Hotel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel();
		hotel.setHotelNumber(rs.getInt("hotelNumber"));
		hotel.setHotelName(rs.getString("hotelName"));
		hotel.setHotelCountry(rs.getString("hotelCountry"));
		hotel.setHotelCity(rs.getString("hotelCity"));
		hotel.setRoomAvailable(rs.getString("roomAvailable"));
		hotel.setHotelStatus(rs.getString("hotelStatus"));
		hotel.setPhoneNumber(rs.getInt("phoneNumber"));
		hotel.setEmail(rs.getString("email"));
		hotel.setPincode(rs.getInt("Pincode"));
		hotel.setLandmark(rs.getString("landmark"));
		hotel.setPrice(rs.getInt("price"));
		hotel.setHotelRating(rs.getInt("hotelRating"));
		
		
		return hotel;
	}

}
