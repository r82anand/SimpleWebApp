package com.sivadas.anand.service;

public class UserAuthenticationService {

	public boolean validateUserCredentials(String userName, String password) {

		boolean isValid = false;
		
		if ("Scott".equalsIgnoreCase(userName) && "Tiger".equalsIgnoreCase(password)) {
			isValid = true;
		}
		
		return isValid;
	}

}
