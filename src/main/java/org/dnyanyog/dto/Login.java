package org.dnyanyog.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.DbUtils;

public class Login {
	public String user;
	public String password;
	
	
	public Login(String user,String password) {
		this.user = user;
		this.password = password;
	}
	
	public boolean loginValidate() throws SQLException {

		String query = "select fname , pass from e_user where fname = '" + user + "' and pass = '" + password + "'";
		ResultSet resultSet = DbUtils.selectQuery(query);
		return resultSet.next();
	}

}
