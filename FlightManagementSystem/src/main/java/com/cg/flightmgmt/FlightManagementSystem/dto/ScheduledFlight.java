package com.cg.flightmgmt.FlightManagementSystem.dto;

import java.math.BigInteger;

public class ScheduledFlight {
private BigInteger flightId;
private Flight flight;
private int availableSeats;
private Schedule schedule;

public ScheduledFlight(BigInteger flightId,Flight flight, int availableSeats, Schedule schedule) {
	this.flightId=flightId;
	this.flight = flight;
	this.availableSeats = availableSeats;
	this.schedule = schedule;
}

public BigInteger getFlightId() {
	return flightId;
}

public void setFlightId(BigInteger flightId) {
	this.flightId = flightId;
}

public ScheduledFlight() {
}

public Flight getFlight() {
	return flight;
}
public void setFlight(Flight flight) {
	this.flight = flight;
}

public int getAvailableSeats() {
	return availableSeats;
}
public void setAvailableSeats(int availableSeats) {
	this.availableSeats = availableSeats;
}

public Schedule getSchedule() {
	return schedule;
}
public void setSchedule(Schedule schedule) {
	this.schedule = schedule;
}

}
