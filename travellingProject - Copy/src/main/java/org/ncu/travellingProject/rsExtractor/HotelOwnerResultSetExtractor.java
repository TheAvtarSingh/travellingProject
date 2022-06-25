package org.ncu.travellingProject.rsExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.ncu.travellingProject.entity.HotelOwner;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class HotelOwnerResultSetExtractor implements ResultSetExtractor<List<HotelOwner>> {

	@Override
	public List<HotelOwner> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		List<HotelOwner> hotelOwnerList = new ArrayList<>();
		while (rs.next()) {
			HotelOwner owner = new HotelOwner();
			owner.setOwnerName(rs.getString("ownerName"));
			owner.setOwnerId(rs.getInt("ownerId"));
			owner.setOwnernumber(rs.getInt("ownernumber"));
			owner.setOwneremail(rs.getString("owneremail"));
			owner.setOwneraddress(rs.getString("owneraddress"));
			hotelOwnerList.add(owner);
		}
		return hotelOwnerList;
		
		
	}

}
