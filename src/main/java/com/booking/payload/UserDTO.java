package com.booking.payload;

public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String fullName;
    private String phoneNumber;
    // ...
	public Long getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getFullName() {
		return fullName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

    // Constructors, getters, and setters
}
