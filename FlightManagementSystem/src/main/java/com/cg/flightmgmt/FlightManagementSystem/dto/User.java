package com.cg.flightmgmt.FlightManagementSystem.dto;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user3")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger userId;
	@Column(name="user_type", length=25)
	private String userType;
	
	@Column(name="user_name", length=25)
	private String userName;
	@Column(name="user_password", length=25)
	private String userPassword;
	@Column(name="user_phone", length=25)
	private String userPhone;
	@Column(name="user_email", length=25)
	private String userEmail;

public User( BigInteger userId,String userType, String userName, String userPassword, String userPhone, String userEmail) {
	this.userType = userType;
	this.userId = userId;
	this.userName = userName;
	this.userPassword = userPassword;
	this.userPhone = userPhone;
	this.userEmail = userEmail;
}

public User() {
}

public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}

public BigInteger getUserId() {
	return userId;
}
public void setUserId(BigInteger userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}

public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}

public String getUserPhone() {
	return userPhone;
}
public void setUserPhone(String userPhone) {
	this.userPhone = userPhone;
}

public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}

}
