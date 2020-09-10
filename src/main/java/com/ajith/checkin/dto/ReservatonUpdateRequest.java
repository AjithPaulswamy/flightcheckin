
package com.ajith.checkin.dto;

public class ReservatonUpdateRequest {

	private Integer id;
	private Integer checkedIn;
	private Integer numberOfBags;

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

}