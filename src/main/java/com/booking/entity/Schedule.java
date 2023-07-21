package com.booking.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_id", nullable = false)
    private Bus bus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id", nullable = false)
    private Route route;

    @Column(nullable = false)
    private LocalDateTime departureTime;

    @Column(nullable = false)
    private LocalDateTime arrivalTime;

    // Additional schedule fields
    private double fare;
    private String frequency;
    // ...
	public Long getId() {
		return id;
	}
	public Bus getBus() {
		return bus;
	}
	public Route getRoute() {
		return route;
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
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public void setRoute(Route route) {
		this.route = route;
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
