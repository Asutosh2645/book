package com.booking.payload;

public class BusDTO {
    private Long id;
    private String busNumber;
    private int capacity;
    private String type;
    private String manufacturer;
    private String model;
    // ...
	public Long getId() {
		return id;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public String getType() {
		return type;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setModel(String model) {
		this.model = model;
	}

    // Constructors, getters, and setters
}
