package com.cg.flightmgmt.FlightManagementSystem.repositary;

import java.math.BigInteger;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.flightmgmt.FlightManagementSystem.dto.Airport;
import com.cg.flightmgmt.FlightManagementSystem.exception.AirportNotFoundException;
@Repository
public interface IAirportRepository extends JpaRepository<Airport, String>{
	public Iterable<Airport> viewAllAirport();

	public Airport viewAirport(String airportCode)throws AirportNotFoundException;

}
