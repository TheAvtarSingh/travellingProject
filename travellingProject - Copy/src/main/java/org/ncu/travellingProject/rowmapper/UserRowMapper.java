package org.ncu.travellingProject.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ncu.travellingProject.entity.User;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername(rs.getString("username"));
user.setPassword(rs.getString("password"));
		return user;
	}

}
