package com.citi.userManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.userManagement.beans.Registration;
import com.citi.userManagement.beans.UserRegistration;
import com.citi.userManagement.dao.RegistrationDao;


@Service("registrationService")
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationDao dao;
	
	public RegistrationDao getDao() {
		return dao;
	}

	public void setDao(RegistrationDao dao) {
		this.dao = dao;
	}

	@Override
	public long addUser(UserRegistration e) {
		System.out.println("inside Service add");
		return dao.addUser(e);
	}

	@Override
	public List<Registration> viewUsers() {
		return dao.viewUsers();
	}
	
	@Override
	public int deleteByUser(String soeId) {
		return dao.deletebyUser(soeId);
	}

	@Override
	public int updateUser(String soeId, String firstName, String lastName, String city) 
	{
		return dao.updateUser(soeId, firstName, lastName, city);
	}


}
