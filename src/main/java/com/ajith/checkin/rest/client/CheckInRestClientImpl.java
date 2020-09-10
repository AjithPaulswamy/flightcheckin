package com.ajith.checkin.rest.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ajith.checkin.dto.Reservation;
import com.ajith.checkin.dto.ReservatonUpdateRequest;

@Component
public class CheckInRestClientImpl implements CheckInRestClient {

	private static final String clientURI="http://localhost:8080/flight/";
	
	@Override
	public Reservation getBookingDetails(Long id) {
		RestTemplate restTemplate=new RestTemplate();
		Reservation reservation = restTemplate.getForObject(clientURI+"bookingDetail?id="+id, Reservation.class);
		System.out.println("getBookingDetails: "+reservation.toString());
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservatonUpdateRequest request) {
		RestTemplate restTemplate=new RestTemplate();
		Reservation reservation = restTemplate.postForObject(clientURI+"checkIn", request, Reservation.class);
		System.out.println("updateReservation: "+reservation.toString());
		return reservation;
	}

}
