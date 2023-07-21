package com.booking.payload;

import java.time.LocalDateTime;

public class BookingDTO {
    private Long id;
    private Long userId;
    private Long busId;
    private Long routeId;
    private LocalDateTime bookingDateTime;
    private String seatNumber;
    private String status;
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
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public void setBusId(Long busId) {
		this.busId = busId;
	}
	public void setRouteId(Long routeId) {
		this.routeId = routeId;
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
