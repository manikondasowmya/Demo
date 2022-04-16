package com.cg.flightmgmt.FlightManagementSystem.controller;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightmgmt.FlightManagementSystem.exception.FlightNotFoundException;
import com.cg.flightmgmt.FlightManagementSystem.exception.AirportNotFoundException;
import com.cg.flightmgmt.FlightManagementSystem.dto.Airport;
import com.cg.flightmgmt.FlightManagementSystem.dto.Schedule;
import com.cg.flightmgmt.FlightManagementSystem.dto.ScheduledFlight;
import com.cg.flightmgmt.FlightManagementSystem.service.IAirportService;
import com.cg.flightmgmt.FlightManagementSystem.service.IFlightService;
import com.cg.flightmgmt.FlightManagementSystem.service.IScheduledFlightService;

import antlr.collections.List;

@RestController
@RequestMapping("/scheduledFlight")
public class ScheduledFlightController {
	/*
	 * Creating Service object
	 */
	@Autowired
	IScheduledFlightService scheduleFlightService;

	@Autowired
	IAirportService airportService;

	@Autowired
	IFlightService flightService;

	@PostMapping("/add")
	public ResponseEntity<ScheduledFlight> addSF(@ModelAttribute ScheduledFlight scheduledFlight,
			@RequestParam(name = "sourceAirport") String source, @RequestParam(name = "destinationAirport") String destination,
			@RequestParam(name = "departureTime") LocalDateTime departureTime, @RequestParam(name = "airrivalTime") LocalDateTime arrivalTime) {
		Schedule schedule = new Schedule();
		try {
			schedule.setSourceAirport(airportService.viewAirport(source));
		} catch (AirportNotFoundException e) {
			return new ResponseEntity("Airport Not Found", HttpStatus.BAD_REQUEST);
		}
		try {
			schedule.setDestinationAirport(airportService.viewAirport(destination));
		} catch (AirportNotFoundException e) {
			return new ResponseEntity("Airport Not Found", HttpStatus.BAD_REQUEST);
		}
		schedule.setDepartureTime(departureTime);
		schedule.setAirrivalTime(arrivalTime);
		try {
			scheduledFlight.setFlight(flightService.viewFlight(scheduledFlight.getFlightId()));
		} catch (FlightNotFoundException e1) {
			return new ResponseEntity("Flight Not Found", HttpStatus.BAD_REQUEST);
		}
		scheduledFlight.setSchedule(schedule);
		scheduledFlight.setAvailableSeats(scheduledFlight.getFlight().getSeatCapacity());
		try {
			return new ResponseEntity<ScheduledFlight>(scheduleFlightService.scheduleFlight(scheduledFlight),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity("Error adding Flight." + e, HttpStatus.BAD_REQUEST);
		}
	}

	/*
	 * Controller for modifying existing Scheduled Flights
	 */
	@PutMapping("/modify")
	public ResponseEntity<ScheduledFlight> modifyScheduleFlight(@ModelAttribute ScheduledFlight scheduleFlight) {
		ScheduledFlight modifySFlight = scheduleFlightService.modifyScheduledFlight(scheduleFlight);
		if (modifySFlight == null) {
			return new ResponseEntity("Flight not modified", HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			return new ResponseEntity<ScheduledFlight>(modifySFlight, HttpStatus.OK);
		}

	}

	/*
	 * Controller for deleting existing Scheduled Flights
	 */
	@DeleteMapping("/delete")
	public void deleteSF(@RequestParam BigInteger flightId) throws FlightNotFoundException {
		scheduleFlightService.deleteScheduledFlight(flightId);
	}

	/*
	 * Controller for viewing a Scheduled Flight by ID
	 */
	@GetMapping("/search")
	@ExceptionHandler(FlightNotFoundException.class)
	public ScheduledFlight viewSF(@RequestParam BigInteger flightId) throws FlightNotFoundException {
		return (ScheduledFlight) scheduleFlightService.viewScheduledFlight();
	}

	/*
	 * Controller for viewing all Scheduled Flights
	 */
	@GetMapping("/viewAll")
	public List viewAllSF() {
		return (List) scheduleFlightService.viewScheduledFlight();
	}
	

}