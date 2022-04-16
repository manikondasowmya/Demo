package com.cg.flightmgmt.FlightManagementSystem.service;

import com.cg.flightmgmt.FlightManagementSystem.dto.Airport;
import com.cg.flightmgmt.FlightManagementSystem.exception.AirportNotFoundException;
public interface IAirportService {
		public Iterable<Airport> viewAllAirport();

		public Airport viewAirport(String airportCode)throws AirportNotFoundException;

	}
