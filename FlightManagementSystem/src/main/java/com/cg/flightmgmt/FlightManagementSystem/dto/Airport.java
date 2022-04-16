package com.cg.flightmgmt.FlightManagementSystem.dto;

public class Airport
{
	private String airportName;
	private String airportCode;
	private String airportLocation;

	public Airport(String airportName, String airportCode, String airportLocation)
	{
		this.airportName = airportName;
		this.airportCode = airportCode;
		this.airportLocation = airportLocation;
	}

	public Airport()
	{
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	
	public String getAirportCode() {
		return airportCode;
	}
	
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}

	public String getAirportLocation() {
		return airportLocation;
	}
	
	@Override
	public String toString() {
		return "Airport{" + "airportName='" + airportName + '\'' + ", airportLocation='" + airportLocation + '\''
				+ ", airportCode='" + airportCode + '\'' + '}';
	}
}