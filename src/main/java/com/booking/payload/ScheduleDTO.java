package com.booking.payload;

import java.time.LocalDateTime;

public class ScheduleDTO {
    private Long id;
    private Long busId;
    private Long routeId;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private double fare;
    private String frequency;
    // ...
	public Long getId() {
		return id;
	}
	public Long getBusId() {
		return busId;
	}
	public Long getRouteId() {
		return routeId;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public double getFare() {
		return fare;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setBusId(Long busId) {
		this.busId = busId;
	}
	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

    // Constructors, getters, and setters
}
