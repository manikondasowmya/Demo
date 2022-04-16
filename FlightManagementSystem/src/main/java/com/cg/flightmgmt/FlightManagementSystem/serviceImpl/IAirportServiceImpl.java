package com.cg.flightmgmt.FlightManagementSystem.serviceImpl;

import java.math.BigInteger;
import java.util.Optional;

import com.cg.flightmgmt.FlightManagementSystem.dto.Airport;
import com.cg.flightmgmt.FlightManagementSystem.dto.Flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.flightmgmt.FlightManagementSystem.service.IAirportService;
import com.cg.flightmgmt.FlightManagementSystem.repositary.IAirportRepository;
import com.cg.flightmgmt.FlightManagementSystem.exception.AirportNotFoundException;

@Service
public class IAirportServiceImpl implements IAirportService {
	@Autowired
	IAirportRepository airportRepository;

	/*
	 * view all Airports
	 */
	@Override
	public Iterable<Airport> viewAllAirport() {
		return airportRepository.findAll();
	}

	/*
	 * view airport by airportCode
	 */
	@Override
	public Airport viewAirport(String airportCode) throws AirportNotFoundException {
		Optional<Airport> findById = airportRepository.findById(airportCode);
		if (findById.isPresent()) {
			return findById.get();
		}
			
			//return new ResponseEntity<Airport>(airport, HttpStatus.OK)}
		else
			throw new AirportNotFoundException("Airport with airport code: " + airportCode + "not exists");
	    }
}
