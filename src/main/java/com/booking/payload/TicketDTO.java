package com.booking.payload;

import java.time.LocalDate;

public class TicketDTO {
    private Long id;
    private Long userId;
    private Long busId;
    private Long routeId;
    private LocalDate date;
    private double fare;
    // ...
	public Long getId() {
		return id;
	}
	public Long getUserId() {
		return userId;
	}
	public Long getBusId() {
		return busId;
	}
	public Long getRouteId() {
		return routeId;
	}
	public LocalDate getDate() {
		return date;
	}
	public double getFare() {
		return fare;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public void setBusId(Long busId) {
		this.busId = busId;
	}
	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}

    // Constructors, getters, and setters
}
