package com.booking.entity;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {
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

    @Column(nullable = false)
    private LocalDateTime bookingDateTime;

    // Additional booking fields
    private String seatNumber;
    private String status;
    // ...
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
	public LocalDateTime getBookingDateTime() {
		return bookingDateTime;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public String getStatus() {
		return status;
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
	public void setBookingDateTime(LocalDateTime bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public void setStatus(String status) {
		this.status = status;
	}

    // Constructors, getters, and setters
}
