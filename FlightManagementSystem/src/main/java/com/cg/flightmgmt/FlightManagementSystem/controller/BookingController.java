package com.cg.flightmgmt.FlightManagementSystem.controller;

import java.math.BigInteger;
import java.util.List;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightmgmt.FlightManagementSystem.dto.Booking;
import com.cg.flightmgmt.FlightManagementSystem.exception.BookingNotFoundException;
import com.cg.flightmgmt.FlightManagementSystem.service.IFlightBookingService;
import com.cg.flightmgmt.FlightManagementSystem.service.IFlightService;

@RestController
@RequestMapping("/api")

public class BookingController {
	@Autowired
	
	private IFlightBookingService flightService;
	@PostMapping("/flightbooking/new")

	public Booking addBooking(@Valid @RequestBody Booking booking) {
		return flightService.addBooking(booking);
	}
	@PutMapping("/updateBooking")
	@ExceptionHandler(BookingNotFoundException.class)
	public void modifyBooking(@RequestBody Booking updateBooking) {

		flightService.updateBooking(updateBooking);
	}

	
	@GetMapping("/searchBooking/{id}")
	@ExceptionHandler(BookingNotFoundException.class)
	public Booking searchBookingByID(@PathVariable("id") BigInteger bookingid) throws BookingNotFoundException {
		return flightService.viewBooking(bookingid);
	}

	
	@GetMapping("/flight booking/all")
	public List<Booking> viewBookings() {
		return flightService.viewBookings();
	}
	@DeleteMapping("/deleteBooking/{id}")
	@ExceptionHandler(BookingNotFoundException.class)
	public void deleteBookingByID(@PathVariable("id") BigInteger bookingid) throws BookingNotFoundException {

		flightService.cancelBooking(bookingid);
	}
	
	

}
