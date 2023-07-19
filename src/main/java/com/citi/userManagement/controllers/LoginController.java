package com.citi.userManagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.citi.userManagement.beans.LoginDetails;
import com.citi.userManagement.beans.Registration;
import com.citi.userManagement.services.LoginService;

@CrossOrigin("*")
@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("hello World Again");
		return "Hello World";
	}
	
	@PostMapping(value="/login",produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Registration ValidateUser(@RequestBody LoginDetails login) {
		
		System.out.println(login.getSoeId());
		System.out.println(login.getPassword());
		Registration result = loginService.ValidateUser(login.getSoeId(), login.getPassword());
		System.out.println(":"+ result);
		return result;
	}


	@PostMapping("/view-details/{soe-id}")
	public Registration ViewUserDetails(@PathVariable(value = "soe-id") String soeId) {
		return loginService.ViewUserDetails(soeId);
	}
}
