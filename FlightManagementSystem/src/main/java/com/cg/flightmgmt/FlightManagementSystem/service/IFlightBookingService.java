package com.cg.flightmgmt.FlightManagementSystem.service;

import java.math.BigInteger;

import java.util.Date;
import java.util.List;

import com.cg.flightmgmt.FlightManagementSystem.dto.Booking;
import com.cg.flightmgmt.FlightManagementSystem.exception.BookingNotFoundException;

public interface IFlightBookingService {

	public Booking addBooking(Booking booking);
	public Booking cancelBooking(BigInteger bookingid) throws BookingNotFoundException;
	public Booking viewBooking(BigInteger bookingid) throws BookingNotFoundException;
	public List<Booking> viewBookingList(Date bookingdate);
	public List<Booking> viewBookingList(BigInteger flightid);
	public List<Booking> viewBookingHistory(BigInteger userid);
	public Booking updateBooking(Booking booking);
	public List<Booking> viewBookings();
	
}
