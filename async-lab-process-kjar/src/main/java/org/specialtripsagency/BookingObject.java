package org.specialtripsagency;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BookingObject implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private org.specialtripsagency.Applicant applicant;
	private java.lang.String bookingId;
	private org.specialtripsagency.Flight flight;
	private org.specialtripsagency.Hotel hotel;

	public BookingObject() {
	}

	public org.specialtripsagency.Applicant getApplicant() {
		return this.applicant;
	}

	public void setApplicant(org.specialtripsagency.Applicant applicant) {
		this.applicant = applicant;
	}

	public java.lang.String getBookingId() {
		return this.bookingId;
	}

	public void setBookingId(java.lang.String bookingId) {
		this.bookingId = bookingId;
	}

	public org.specialtripsagency.Flight getFlight() {
		return this.flight;
	}

	public void setFlight(org.specialtripsagency.Flight flight) {
		this.flight = flight;
	}

	public org.specialtripsagency.Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(org.specialtripsagency.Hotel hotel) {
		this.hotel = hotel;
	}

	public BookingObject(org.specialtripsagency.Applicant applicant,
			java.lang.String bookingId, org.specialtripsagency.Flight flight,
			org.specialtripsagency.Hotel hotel) {
		this.applicant = applicant;
		this.bookingId = bookingId;
		this.flight = flight;
		this.hotel = hotel;
	}

}