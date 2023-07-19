package com.citi.userManagement.dao;

import java.util.List;

import com.citi.userManagement.beans.Registration;
import com.citi.userManagement.beans.UserRegistration;

public interface RegistrationDao {
	public long addUser(UserRegistration e);

	// return list of users for admin to approve
	public List<Registration> viewUsers();

	public int deletebyUser(String soeId);
	
	public int updateUser(String soeId, String firstName, String lastName, String city);

}
