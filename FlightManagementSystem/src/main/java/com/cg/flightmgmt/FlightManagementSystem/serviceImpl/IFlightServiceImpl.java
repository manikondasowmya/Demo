package com.cg.flightmgmt.FlightManagementSystem.serviceImpl;

import java.math.BigInteger;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flightmgmt.FlightManagementSystem.dto.Flight;
import com.cg.flightmgmt.FlightManagementSystem.exception.FlightNotFoundException;
import com.cg.flightmgmt.FlightManagementSystem.repositary.IFlightRepository;
import com.cg.flightmgmt.FlightManagementSystem.service.IFlightService;

@Service
public class IFlightServiceImpl implements IFlightService{
	@Autowired
	private IFlightRepository flightRepository;

	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightRepository.save(flight);
	}

	@Override
	public Flight viewFlight(BigInteger flightno) throws FlightNotFoundException {
		// TODO Auto-generated method stub
		Optional<Flight> findFlightById = flightRepository.findById(flightno);
		if (findFlightById.isPresent()) {
			flightRepository.getById(flightno);
		}else {
			throw new FlightNotFoundException("Flight not found");
		}
		return flightRepository.getById(flightno);
	}

	@Override
	public Set<Flight> viewAllFlights() {
		// TODO Auto-generated method stub
		return (Set<Flight>) flightRepository.findAll();
	}


	@Override
	public Flight updateFlight(Flight flight) {
		Optional<Flight> findFlightById = flightRepository.findById(flight.getFlightId());
		if (findFlightById.isPresent()) {
			flightRepository.save(flight);
		}
		// TODO Auto-generated method stub
		return flight;
	}

	@Override
	public Flight removeFlight(BigInteger flightno) {
		Optional<Flight> findFlightById = flightRepository.findById(flightno);
		if (findFlightById.isPresent()) {
			flightRepository.deleteById(flightno);
		} 
		// TODO Auto-generated method stub
		return flightRepository.getById(flightno); 
	}

}
