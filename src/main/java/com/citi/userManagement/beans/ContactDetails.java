package com.citi.userManagement.beans;

public class ContactDetails {

	private String soeId;
	private long phone_number;
	private String email;
	public String getSoeId() {
		return soeId;
	}
	public void setSoeId(String soeId) {
		this.soeId = soeId;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ContactDetails(String soeId, long phone_number, String email) {
		super();
		this.soeId = soeId;
		this.phone_number = phone_number;
		this.email = email;
	}
	@Override
	public String toString() {
		return "ContactDetails [soeId=" + soeId + ", phone_number=" + phone_number + ", email=" + email + "]";
	}
	
	
	
}
