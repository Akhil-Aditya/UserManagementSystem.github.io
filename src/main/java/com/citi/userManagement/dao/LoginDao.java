package com.citi.userManagement.dao;

import com.citi.userManagement.beans.Registration;

public interface LoginDao{

	public Registration ValidateUser(String soeId, String password);
    public Registration ViewUserDetails(String soeId);
}
