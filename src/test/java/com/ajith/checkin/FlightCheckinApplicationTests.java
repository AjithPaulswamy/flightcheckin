package com.ajith.checkin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ajith.checkin.rest.client.CheckInRestClientImpl;

@SpringBootTest
class FlightCheckinApplicationTests {

	@Autowired
	CheckInRestClientImpl checkInRest;
	
	@Test
	void getBookingDetails() {
		checkInRest.getBookingDetails(new Long(3));
	}

}
