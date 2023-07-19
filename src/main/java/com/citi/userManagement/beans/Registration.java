package com.citi.userManagement.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "USER_INFO")
public class Registration {
	@Id
	@Column(name="SOE_ID")
	private String SoeId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="PASS_WORD")
	private String password;
	@Column(name="CITY")
	private String city;
	@Column(name="ROLE_ID")
	private int roleId;  // default 0 - user
	@Column(name="ACTIVATE")
	private int active;	// default 1- active
	
	public Registration() {
		// TODO Auto-generated constructor stub
	}
	
	public String getSoeId() {
		return SoeId;
	}
	public void setSoeId(String soeId) {
		SoeId = soeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public Registration(String soeId, String firstName, String lastName, String password, String city, int roleId,
			int active) {
		super();
		SoeId = soeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.city = city;
		this.roleId = roleId;
		this.active = active;
	}
	@Override
	public String toString() {
		return "Registration [SoeId=" + SoeId + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", city=" + city + ", roleId=" + roleId + ", active=" + active + "]";
	}
	
	
}
