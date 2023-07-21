package com.booking.payload;

public class PaymentDTO {
    private Long id;
    private Long bookingId;
    private Double amount;
    private String paymentMethod;
    private String status;
    // ...
	public Long getId() {
		return id;
	}
	public Long getBookingId() {
		return bookingId;
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
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
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
