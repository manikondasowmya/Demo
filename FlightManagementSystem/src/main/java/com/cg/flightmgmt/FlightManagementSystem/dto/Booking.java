package com.cg.flightmgmt.FlightManagementSystem.dto;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="Booking")
public class Booking {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private BigInteger bookingId;

@Column(name="userId", length=25)
@NotEmpty(message="userid is required")
private User userId;

@Column(name="bookingDate", length=25)
@NotEmpty(message="bookingDate is required")
private LocalDate bookingDate;

@Column(name="passenger", length=25)
@NotEmpty(message="passenger list is required")
private List <Passenger>passengerList;

@Column(name="ticketCost", length=25)
@NotEmpty(message="ticketCost is required")
private double ticketCost;

@Column(name="flight", length=25)
@NotEmpty(message="flight is required")
private Flight flight;

@Column(name="noofPassangers", length=5)
@NotEmpty(message="no of passengers are required")
private int noOfPassangers;

public Booking(BigInteger bookingId, User userId, LocalDate bookingDate, List<Passenger> passengerList, double ticketCost, Flight flight, int noOfPassangers) {
	this.bookingId = bookingId;
	this.userId = userId;
	this.bookingDate = bookingDate;
	this.passengerList = passengerList;
	this.ticketCost = ticketCost;
	this.flight = flight;
	this.noOfPassangers = noOfPassangers;
}

public Booking() {
}

public BigInteger getBookingId() {
	return bookingId;
}
public void setBookingId(BigInteger bookingId) {
	this.bookingId = bookingId;
}
public User getUserId() {
	return userId;
}
public void setUserId(User userId) {
	this.userId = userId;
}
public LocalDate getBookingDate() {
	return bookingDate;
}
public void setBookingDate(LocalDate bookingDate) {
	this.bookingDate = bookingDate;
}
public List<Passenger> getPassengerList() {
	return passengerList;
}
public void setPassengerList(List<Passenger> passengerList) {
	this.passengerList = passengerList;
}
public double getTicketCost() {
	return ticketCost;
}
public void setTicketCost(double ticketCost) {
	this.ticketCost = ticketCost;
}
public Flight getFlight() {
	return flight;
}
public void setFlight(Flight flight) {
	this.flight = flight;
}
public int getNoOfPassangers() {
	return noOfPassangers;
}
public void setNoOfPassangers(int noOfPassangers) {
	this.noOfPassangers = noOfPassangers;
}

}
