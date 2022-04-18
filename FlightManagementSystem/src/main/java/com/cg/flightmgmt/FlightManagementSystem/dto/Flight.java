package com.cg.flightmgmt.FlightManagementSystem.dto;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Flight {
	@Id 
private int flightId;
	
private String flightModel;
	
private String carrierName;
	
private int seatCapacity;

public Flight(int flightId, String flightModel, String carrierName, int seatCapacity) {
	this.flightId = flightId;
	this.flightModel = flightModel;
	this.carrierName = carrierName;
	this.seatCapacity = seatCapacity;
}

public Flight() {
}

public int getFlightId() {
	return flightId;
}
public void setFlightId(int flightId) {
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
