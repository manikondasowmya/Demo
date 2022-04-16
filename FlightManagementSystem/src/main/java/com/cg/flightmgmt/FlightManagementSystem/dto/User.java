package com.cg.flightmgmt.FlightManagementSystem.dto;

import java.math.BigInteger;

public class User {
private String userType;
private BigInteger userId;
private String userName;
private String userPassword;
private String userPhone;
private String userEmail;

public User(String userType, BigInteger userId, String userName, String userPassword, String userPhone, String userEmail) {
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
