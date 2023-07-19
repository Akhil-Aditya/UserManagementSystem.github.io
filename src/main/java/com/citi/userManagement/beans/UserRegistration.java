package com.citi.userManagement.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "USER_INFO")
public class UserRegistration {

	@Id
	@GeneratedValue(generator = "soe_id")
	@SequenceGenerator(name="soe_id",sequenceName="USER_ID_SEQUENCE",allocationSize=1)
	@Column(name="SOE_ID")
	private long SoeId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="PASS_WORD")
	private String password;
	@Column(name="CITY")
	private String city;
	@Column(name="ROLE_ID")
	private int roleId;
	@Column(name="ACTIVATE")
	private int active;
	
	public long getSoeId() {
		return SoeId;
	}
	public void setSoeId(long soeId) {
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
	public UserRegistration(long soeId, String firstName, String lastName, String password, String city, int roleId,
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
		return "UserRegistration [SoeId=" + SoeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", city=" + city + ", roleId=" + roleId + ", active=" + active + "]";
	}
	
}
