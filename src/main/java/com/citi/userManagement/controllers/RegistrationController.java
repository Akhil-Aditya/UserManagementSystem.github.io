package com.citi.userManagement.controllers;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.citi.userManagement.beans.Registration;
import com.citi.userManagement.beans.UserRegistration;
import com.citi.userManagement.services.RegistrationServiceImpl;


@CrossOrigin("*")
@RestController
@RequestMapping("user")
public class RegistrationController {

	@Autowired
	RegistrationServiceImpl registrationService;

	// http://localhost:8082/user/registration
	
	@PostMapping("/registration")
	public long addUser(@RequestBody UserRegistration registration) {
		return registrationService.addUser(registration);
	}

	@GetMapping("/all-users")
	public List<Registration> viewAllUSers() {
		return registrationService.viewUsers();
	}
	
	@PostMapping("/delete-user/{soe-id}")
	public int deleteUser(@PathVariable(value = "soe-id") String soeId) {
		System.out.println(soeId);
	  	return registrationService.deleteByUser(soeId);
	}
	
	@PostMapping("/update-user/{soe-id}/{first-name}/{last-name}/{city}")
    public int updateUser(@PathVariable(value = "soe-id") String soeId,@PathVariable(value = "first-name") String firstName,@PathVariable(value = "last-name") String lastName,@PathVariable(value = "city") String city) {
		return registrationService.updateUser(soeId, firstName, lastName, city) ;
	}
}
