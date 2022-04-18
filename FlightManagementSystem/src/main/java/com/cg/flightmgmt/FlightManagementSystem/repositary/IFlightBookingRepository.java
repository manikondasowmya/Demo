package com.cg.flightmgmt.FlightManagementSystem.repositary;

import java.math.BigInteger;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.flightmgmt.FlightManagementSystem.dto.Booking;
import com.cg.flightmgmt.FlightManagementSystem.exception.BookingNotFoundException;
@Repository
public interface IFlightBookingRepository extends JpaRepository<Booking, BigInteger>{

	//List<Booking> findByDate(Date bookingdate);

	/*
	 * List<Booking> findByFlightId(BigInteger flightid);
	 * 
	 * List<Booking> findByUserId(BigInteger userid);
	 */
	
}
