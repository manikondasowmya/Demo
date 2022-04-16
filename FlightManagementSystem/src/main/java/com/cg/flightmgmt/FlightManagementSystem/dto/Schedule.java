package com.cg.flightmgmt.FlightManagementSystem.dto;

import java.time.LocalDateTime;

public class Schedule {
	
	private Airport sourceAirport;
	private Airport destinationAirport;
	private LocalDateTime airrivalTime;
	private LocalDateTime departureTime;
	
	public Schedule(Airport sourceAirport, Airport destinationAirport, LocalDateTime airrivalTime, LocalDateTime departureTime) {
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.airrivalTime = airrivalTime;
		this.departureTime = departureTime;
	}
		
	public Schedule() {
	}

	public Airport getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public Airport getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public LocalDateTime getAirrivalTime() {
		return airrivalTime;
	}
	public void setAirrivalTime(LocalDateTime airrivalTime) {
		this.airrivalTime = airrivalTime;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	
	
}
