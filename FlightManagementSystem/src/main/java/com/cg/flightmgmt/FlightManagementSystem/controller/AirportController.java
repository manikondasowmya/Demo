package com.cg.flightmgmt.FlightManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightmgmt.FlightManagementSystem.dto.Airport;
import com.cg.flightmgmt.FlightManagementSystem.exception.AirportNotFoundException;
import com.cg.flightmgmt.FlightManagementSystem.service.IAirportService;
import com.cg.flightmgmt.FlightManagementSystem.service.IFlightBookingService;

public class AirportController {
	@RestController
	@RequestMapping("/api")
	public class FlightMgmtBookingController{
		@Autowired
		private IAirportService airportservice;

	@GetMapping("/viewAirport/{id}")
	public Airport viewAirport(@PathVariable("id") String airportCode) throws AirportNotFoundException {
		return airportservice.viewAirport(airportCode);
	}
	@GetMapping("/viewallAirport")
	public Iterable<Airport> viewAllAirport() {
		return airportservice.viewAllAirport();
	}
}
}
