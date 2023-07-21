package com.booking.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String source;

    @Column(nullable = false)
    private String destination;

    // Additional route fields
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
	  @OneToMany(mappedBy = "route")
	    private List<Schedule> schedules;
    // Constructors, getters, and setters
}
