package com.citi.userManagement.beans;

public class LoginDetails {

	private String soeId;
	private String password;
	
	public LoginDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public String getSoeId() {
		return soeId;
	}
	public void setSoeId(String soeId) {
		this.soeId = soeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginDetails(String soeId, String password) {
		super();
		this.soeId = soeId;
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginDetails [soeId=" + soeId + ", password=" + password + "]";
	}
	
	
}
