package com.cg.flightmgmt.FlightManagementSystem.service;

import java.math.BigInteger;

import java.util.Set;

import com.cg.flightmgmt.FlightManagementSystem.dto.Flight;
import com.cg.flightmgmt.FlightManagementSystem.exception.FlightNotFoundException;

public interface IFlightService {

	public Flight addFlight(Flight flight);
	public Flight viewFlight(BigInteger flightno) throws FlightNotFoundException;
	public Set<Flight> viewAllFlights();
	public Flight removeFlight(BigInteger flightno);
	public Flight updateFlight(Flight flight);
}
