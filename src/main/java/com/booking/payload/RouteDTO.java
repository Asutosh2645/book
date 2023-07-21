package com.booking.payload;

public class RouteDTO {
    private Long id;
    private String source;
    private String destination;
    private double distance;
    private int duration;
    // ...
	public Long getId() {
		return id;
	}
	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
	public double getDistance() {
		return distance;
	}
	public int getDuration() {
		return duration;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

    // Constructors, getters, and setters
}
