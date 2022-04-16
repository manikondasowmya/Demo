package com.cg.flightmgmt.FlightManagementSystem.serviceImpl;

import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.flightmgmt.FlightManagementSystem.dto.Schedule;
import com.cg.flightmgmt.FlightManagementSystem.dto.ScheduledFlight;
import com.cg.flightmgmt.FlightManagementSystem.dto.Airport;
import com.cg.flightmgmt.FlightManagementSystem.dto.Booking;
import com.cg.flightmgmt.FlightManagementSystem.dto.Flight;
import com.cg.flightmgmt.FlightManagementSystem.repositary.IFlightRepository;
import com.cg.flightmgmt.FlightManagementSystem.repositary.IScheduledFlightRepository;
import com.cg.flightmgmt.FlightManagementSystem.service.IScheduledFlightService;
import com.cg.flightmgmt.FlightManagementSystem.exception.FlightNotFoundException;

@Service
public class IScheduledFlightServiceImpl implements IScheduledFlightService {
	@Autowired
	private IScheduledFlightRepository scheduledFlightRepository;
	
	@Override
	public ScheduledFlight scheduleFlight(ScheduledFlight flight) 
	{
		return scheduledFlightRepository.save(flight);
	}
	@Override
	public void deleteScheduledFlight(BigInteger flightno) throws FlightNotFoundException
	{
		Optional<ScheduledFlight> findFlightScheduleById = scheduledFlightRepository.findById(flightno);
		if (findFlightScheduleById.isPresent()) {
			scheduledFlightRepository.deleteById(flightno);
		}  else {
			throw new FlightNotFoundException("Booking not found for the exception");
		} 
		// TODO Auto-generated method stub 
	}	
	@Override
	public ScheduledFlight modifyScheduledFlight(ScheduledFlight flight)
	{
		Optional<ScheduledFlight> findFlightScheduleById = scheduledFlightRepository.findById(flight.getFlight().getFlightId());
		if (findFlightScheduleById.isPresent()) {
			scheduledFlightRepository.save(flight);
		}
		// TODO Auto-generated method stub
		return flight;
	}
	
	@Override
	public List<ScheduledFlight> viewScheduledFlight(){
		return scheduledFlightRepository.findAll();
	}
	
	@Override
	public List<ScheduledFlight> viewScheduledFlights(Airport sourceAirport,Airport destinationAirport,LocalDate date)
	{
		return scheduledFlightRepository.findBySourceandDestinationandDate(sourceAirport,destinationAirport,date);
		
	}
	@Override
	public ScheduledFlight viewScheduledFlights(BigInteger flightno) {
		return scheduledFlightRepository.getById(flightno);
	}
	}