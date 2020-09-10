package com.ajith.checkin.rest.client;

import com.ajith.checkin.dto.Reservation;
import com.ajith.checkin.dto.ReservatonUpdateRequest;

public interface CheckInRestClient {
	public Reservation getBookingDetails(Long id);
	
	public Reservation updateReservation(ReservatonUpdateRequest request);
}
