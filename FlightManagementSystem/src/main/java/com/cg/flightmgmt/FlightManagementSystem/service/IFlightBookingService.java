package com.cg.flightmgmt.FlightManagementSystem.service;

import java.math.BigInteger;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import com.cg.flightmgmt.FlightManagementSystem.dto.Booking;
import com.cg.flightmgmt.FlightManagementSystem.exception.BookingNotFoundException;

public interface IFlightBookingService {

	
	
	
	Booking cancelBooking(BigInteger bookingId) throws BookingNotFoundException;
	public Booking addBooking(@Valid Booking booking);
	Booking viewBooking(BigInteger bookingid) throws BookingNotFoundException;
	//List<Booking> viewBookingList(Date bookingdate);
	/*
	 * List<Booking> viewBookingList(BigInteger flightid); List<Booking>
	 * viewBookingHistory(BigInteger userid);
	 */
	Booking updateBooking(Booking booking);
	List<Booking> viewBooking();
	
}
