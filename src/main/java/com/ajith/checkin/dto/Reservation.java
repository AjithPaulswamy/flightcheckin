
package com.ajith.checkin.dto;

public class Reservation {

	private Integer id;
	private Integer checkedIn;
	private Integer numberOfBags;
	private Passenger passenger;
	private Flight flight;
	private String created;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(Integer checkedIn) {
		this.checkedIn = checkedIn;
	}

	public Integer getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(Integer numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", checkedIn=" + checkedIn + ", numberOfBags=" + numberOfBags + ", passenger="
				+ passenger + ", flight=" + flight + ", created=" + created + "]";
	}

}
