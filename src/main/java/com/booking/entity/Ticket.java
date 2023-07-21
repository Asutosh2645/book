package com.booking.entity;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_id", nullable = false)
    private Bus bus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id", nullable = false)
    private Route route;

    // Additional ticket fields
    private LocalDate date;
    public Long getId() {
		return id;
	}
	public User getUser() {
		return user;
	}
	public Bus getBus() {
		return bus;
	}
	public Route getRoute() {
		return route;
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
	public void setUser(User user) {
		this.user = user;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	private double fare;
    // ...

    // Constructors, getters, and setters
}
