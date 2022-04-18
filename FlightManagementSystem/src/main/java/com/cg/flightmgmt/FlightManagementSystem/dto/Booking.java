package com.cg.flightmgmt.FlightManagementSystem.dto;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity

@Table(name="Booking1")
public class Booking {
	@Id
private BigInteger bookingId;
	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
  private User user;
 
private LocalDate bookingDate;
@OneToMany
private List <Passenger>passengerList;

  
private double ticketCost;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="flightId")
  private Flight flight;
 

private int noOfPassangers;
public BigInteger getBookingId() {
	return bookingId;
}
public void setBookingId(BigInteger bookingId) {
	this.bookingId = bookingId;
}

public User getUserId() {
	return user;
}
public void setUserId(User userId) {
	this.user = user;
}
public LocalDate getBookingDate() {
	return bookingDate;
}
public void setBookingDate(LocalDate bookingDate) {
	this.bookingDate = bookingDate;
}

/*
 * public List<Passenger> getPassengerList() { return passengerList; } public
 * void setPassengerList(List<Passenger> passengerList) { this.passengerList =
 * passengerList; }
 */
public double getTicketCost() {
	return ticketCost;
}
public void setTicketCost(double ticketCost) {
	this.ticketCost = ticketCost;
}


  public Flight getFlight() { 
	  return flight; }
  public void setFlight(Flight flightId) 
  { 
	  this.flight = flight;
	  }
 
public int getNoOfPassangers() {
	return noOfPassangers;
}
public void setNoOfPassangers(int noOfPassangers) {
	this.noOfPassangers = noOfPassangers;
}

}