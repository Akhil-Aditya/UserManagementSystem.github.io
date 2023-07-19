package com.citi.userManagement.services;

import java.util.List;

import com.citi.userManagement.beans.Registration;
import com.citi.userManagement.beans.UserRegistration;

public interface RegistrationService {

	public long addUser(UserRegistration e);
	public List<Registration> viewUsers();
	public  int deleteByUser(String soeId);
	public int updateUser(String soeId, String firstName, String lastName, String city);
	
}
