package com.cg.flightmgmt.FlightManagementSystem.repositary;

import java.math.BigInteger;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.flightmgmt.FlightManagementSystem.dto.Booking;
import com.cg.flightmgmt.FlightManagementSystem.dto.Flight;
import com.cg.flightmgmt.FlightManagementSystem.exception.FlightNotFoundException;
@Repository
public interface IFlightRepository extends JpaRepository<Flight, BigInteger>{

	public Flight addFlight(Flight flight);
	//public Flight viewFlight(BigInteger flightno) throws FlightNotFoundException;
	public Set<Flight> viewAllFlights();

	/*
	 * public Flight removeFlight(BigInteger flightno); public Flight
	 * updateFlight(Flight flight);
	 */
	public Optional<Flight> findById(BigInteger flightno);
}
