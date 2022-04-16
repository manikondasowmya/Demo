package com.cg.flightmgmt.FlightManagementSystem.serviceImpl;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flightmgmt.FlightManagementSystem.dto.Booking;
import com.cg.flightmgmt.FlightManagementSystem.exception.BookingNotFoundException;
import com.cg.flightmgmt.FlightManagementSystem.repositary.IFlightBookingRepository;
import com.cg.flightmgmt.FlightManagementSystem.service.IFlightBookingService;

@Service
public class IFlightBookingServiceImpl implements IFlightBookingService{
	@Autowired
	private IFlightBookingRepository flightRepository;

	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		return flightRepository.save(booking);
	}

	@Override
	public Booking cancelBooking(BigInteger bookingid) throws BookingNotFoundException {
		Optional<Booking> findBookingById = flightRepository.findById(bookingid);
		if (findBookingById.isPresent()) {
			flightRepository.deleteById(bookingid);
		}  else {
			throw new BookingNotFoundException("Booking not found for the exception");
		} 
		// TODO Auto-generated method stub
		return flightRepository.getById(bookingid); 
	}

	@Override
	public Booking viewBooking(BigInteger bookingid) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		return flightRepository.getById(bookingid);
	}

	@Override
	public List<Booking> viewBookingList(Date bookingdate) {
		// TODO Auto-generated method stub
		return flightRepository.findByDate(bookingdate);
	}

	@Override
	public List<Booking> viewBookingList(BigInteger flightid) {
		// TODO Auto-generated method stub
		return flightRepository.findByFlightId(flightid);
	}

	@Override
	public List<Booking> viewBookingHistory(BigInteger userid) {
		// TODO Auto-generated method stub
		return flightRepository.findByUserId(userid);
	}

	@Override
	public Booking updateBooking(Booking booking) {
		Optional<Booking> findBookingById = flightRepository.findById(booking.getBookingId());
		if (findBookingById.isPresent()) {
			flightRepository.save(booking);
		}
		// TODO Auto-generated method stub
		return booking;
	}
	@Override
	public List<Booking> viewBookings() {
		// TODO Auto-generated method stub
		 return flightRepository.findAll();
	}
	
	}