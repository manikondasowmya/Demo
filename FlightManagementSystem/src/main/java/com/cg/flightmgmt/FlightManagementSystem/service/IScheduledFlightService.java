package com.cg.flightmgmt.FlightManagementSystem.service;

import java.math.BigInteger;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.cg.flightmgmt.FlightManagementSystem.dto.Airport;
import com.cg.flightmgmt.FlightManagementSystem.dto.Flight;
import com.cg.flightmgmt.FlightManagementSystem.dto.ScheduledFlight;
import com.cg.flightmgmt.FlightManagementSystem.exception.FlightNotFoundException;

public interface IScheduledFlightService {
	
	public ScheduledFlight scheduleFlight(ScheduledFlight flight);
	public ScheduledFlight viewScheduledFlights(BigInteger flightno) ;
	public void deleteScheduledFlight(BigInteger flightno) throws FlightNotFoundException;
	public ScheduledFlight modifyScheduledFlight(ScheduledFlight flight);
	public List<ScheduledFlight> viewScheduledFlight();
	public List<ScheduledFlight> viewScheduledFlights(Airport sourceAirport,Airport destinationAirport,LocalDate date);}
