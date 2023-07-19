package com.citi.userManagement.services;

import com.citi.userManagement.beans.Registration;

public interface LoginService {
	public Registration ValidateUser(String soeId, String password); 
	public Registration ViewUserDetails(String soeId);

}

