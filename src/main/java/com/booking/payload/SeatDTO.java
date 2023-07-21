package com.booking.payload;

public class SeatDTO {
    private Long id;
    private Long busId;
    private String seatNumber;
    private boolean isAvailable;
    private String seatType;
    // ...
	public Long getId() {
		return id;
	}
	public Long getBusId() {
		return busId;
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
	public void setBusId(Long busId) {
		this.busId = busId;
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
