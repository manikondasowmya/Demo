package com.cg.flightmgmt.FlightManagementSystem.dto;

import java.math.BigInteger;

public class Passenger {
private BigInteger pnrNumber;
private String passengerName;
private int passengerAge;
private BigInteger passengerUIN;
private Double luggage;
public Passenger(BigInteger pnrNumber, String passengerName, int passengerAge, BigInteger passengerUIN, Double luggage) {
	this.pnrNumber = pnrNumber;
	this.passengerName = passengerName;
	this.passengerAge = passengerAge;
	this.passengerUIN = passengerUIN;
	this.luggage = luggage;
}

public Passenger() {
}

public BigInteger getPnrNumber() {
	return pnrNumber;
}

public void setPnrNumber(BigInteger pnrNumber) {
	this.pnrNumber = pnrNumber;
}

public String getPassengerName() {
	return passengerName;
}

public void setPassengerName(String passengerName) {
	this.passengerName = passengerName;
}

public int getPassengerAge() {
	return passengerAge;
}

public void setPassengerAge(int passengerAge) {
	this.passengerAge = passengerAge;
}

public BigInteger getPassengerUIN() {
	return passengerUIN;
}

public void setPassengerUIN(BigInteger passengerUIN) {
	this.passengerUIN = passengerUIN;
}

public Double getLuggage() {
	return luggage;
}

public void setLuggage(Double luggage) {
	this.luggage = luggage;
}

}
