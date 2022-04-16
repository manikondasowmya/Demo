package com.cg.flightmgmt.FlightManagementSystem.dto;

import java.math.BigInteger;

public class Flight {
private BigInteger flightId;
private String flightModel;
private String carrierName;
private int seatCapacity;

public Flight(BigInteger flightId, String flightModel, String carrierName, int seatCapacity) {
	this.flightId = flightId;
	this.flightModel = flightModel;
	this.carrierName = carrierName;
	this.seatCapacity = seatCapacity;
}

public Flight() {
}

public BigInteger getFlightId() {
	return flightId;
}
public void setFlightId(BigInteger flightId) {
	this.flightId = flightId;
}

public String getFlightModel() {
	return flightModel;
}
public void setFlightModel(String flightModel) {
	this.flightModel = flightModel;
}

public String getCarrierName() {
	return carrierName;
}
public void setCarrierName(String carrierName) {
	this.carrierName = carrierName;
}

public int getSeatCapacity() {
	return seatCapacity;
}
public void setSeatCapacity(int seatCapacity) {
	this.seatCapacity = seatCapacity;
}

}
