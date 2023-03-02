package org.ncu.travellingProject.rsExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.ncu.travellingProject.entity.UserBookingDetails;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class UserBookingDataResultSetExtractor implements ResultSetExtractor<List<UserBookingDetails>>{

	@Override
	public List<UserBookingDetails> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		List<UserBookingDetails> bookingDetails = new ArrayList<>();
		while (rs.next()) {
			UserBookingDetails details = new UserBookingDetails();
			details.setHotelid(rs.getInt("hotelid"));
			details.setRoomNumbers(rs.getInt("roomNumbers"));
			details.setNoofdays(rs.getInt("noofdays"));
			details.setNeedCarParking(rs.getString("needCarParking"));
			details.setNeedFoodService(rs.getString("needFoodService"));
			details.setNeedGamingService(rs.getString("needGamingService"));
			details.setPanNumber(rs.getString("panNumber"));
			details.setNeedSecurity(rs.getString("needSecurity"));
			details.setNoofPersons(rs.getInt("noofPersons"));
			details.setBookingStatus(rs.getString("bookingStatus"));
			bookingDetails.add(details);
		}
		return bookingDetails;
	}

}
