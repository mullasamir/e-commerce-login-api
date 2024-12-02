package org.dnyanyog.service;

import java.sql.SQLException;

import org.dnyanyog.dto.Login;

public class LoginService {
	public String login(Login loginbody) throws SQLException {

		if (loginbody.loginValidate())
			return "Login Successfull";
		return "Login Failed";

	}

}
