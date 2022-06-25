package org.ncu.travellingProject.rsExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.ncu.travellingProject.entity.Admin;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class AdminResultSetExtractor implements ResultSetExtractor<List<Admin>> {

	@Override
	public List<Admin> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		List<Admin> adminList = new ArrayList<>();
		while (rs.next()) {
			Admin admin = new Admin();
			admin.setUsername(rs.getString("username"));
			admin.setPassword(rs.getString("password"));
			adminList.add(admin);
		}
		return adminList;
	}

}
