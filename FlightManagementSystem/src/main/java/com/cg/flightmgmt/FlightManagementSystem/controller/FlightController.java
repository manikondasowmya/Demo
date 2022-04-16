package com.cg.flightmgmt.FlightManagementSystem.controller;

import java.math.BigInteger;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightmgmt.FlightManagementSystem.exception.FlightNotFoundException;
import com.cg.flightmgmt.FlightManagementSystem.dto.Flight;
import com.cg.flightmgmt.FlightManagementSystem.service.IFlightService;
import com.cg.flightmgmt.FlightManagementSystem.serviceImpl.IFlightServiceImpl;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/flight")
public class FlightController {
	@Autowired(required = true)
	IFlightService flightService;

	@PostMapping("/addFlight")
	public void addFlight(@RequestBody Flight flight) {
		flightService.addFlight(flight);
	}

	@GetMapping("/allFlight")
	public Set<Flight> viewAllFlight() {
		return flightService.viewAllFlights();
	}

	@GetMapping("/viewFlight/{id}")
	public Flight viewFlight(@PathVariable("id") BigInteger flightNo) throws FlightNotFoundException {
		return flightService.viewFlight(flightNo);
	}

	@PutMapping("/updateFlight")
	@ExceptionHandler(FlightNotFoundException.class)
	public void modifyFlight(@RequestBody Flight flight) {
		flightService.updateFlight(flight);
	}

	@DeleteMapping("/deleteFlight/{id}")
	@ExceptionHandler(FlightNotFoundException.class)
	public void removeFlight(@PathVariable("id") BigInteger flightNo) {
		flightService.removeFlight(flightNo);
	}
}