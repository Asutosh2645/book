package com.booking.entity;

import javax.persistence.*;

@Entity
@Table(name = "seats")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_id", nullable = false)
    private Bus bus;

    @Column(nullable = false)
    private String seatNumber;

    // Additional seat fields
    private boolean isAvailable;
    private String seatType;
    // ...
	public Long getId() {
		return id;
	}
	public Bus getBus() {
		return bus;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

    // Constructors, getters, and setters
}
