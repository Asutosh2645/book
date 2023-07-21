package com.booking.entity;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    @Column(nullable = false)
    private Double amount;

    // Additional payment fields
    private String paymentMethod;
    private String status;
    // ...
	public Long getId() {
		return id;
	}
	public Booking getBooking() {
		return booking;
	}
	public Double getAmount() {
		return amount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public String getStatus() {
		return status;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public void setStatus(String status) {
		this.status = status;
	}

    // Constructors, getters, and setters
}
