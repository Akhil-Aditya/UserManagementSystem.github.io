package com.citi.userManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.userManagement.beans.Registration;
import com.citi.userManagement.dao.LoginDao;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	
	
	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	public Registration ValidateUser(String soeId, String password) {
		System.out.println("Inside Service");
		
		return loginDao.ValidateUser(soeId, password);
	}

	@Override
	public Registration ViewUserDetails(String soeId) {
		
		return loginDao.ViewUserDetails(soeId);
	}


}
