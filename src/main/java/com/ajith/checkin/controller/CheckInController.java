package com.ajith.checkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ajith.checkin.dto.Reservation;
import com.ajith.checkin.dto.ReservatonUpdateRequest;
import com.ajith.checkin.rest.client.CheckInRestClient;

@Controller
public class CheckInController {
	
	@Autowired
	CheckInRestClient checkInRestClient;
	
	@RequestMapping("/showCheckIn")
	public String showCheckIn() {
		System.out.println("Inside Check In");
		return "startCheckin";
	}
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("id") Long id,ModelMap modelMap) {
		System.out.println("start Check In - Id : "+id);
		Reservation bookingDetails = checkInRestClient.getBookingDetails(id);
		System.out.println("Got Booking Details : "+bookingDetails.toString());
		modelMap.addAttribute("bookingDetails", bookingDetails);
		return "displayBookingDetails";
	}
	
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("numberOfBags") Integer numberOfBags,@RequestParam("reservationId") Integer reservationId,ModelMap modelMap) {
		System.out.println("Complete Check in : reservationId"+reservationId);
		ReservatonUpdateRequest request=new ReservatonUpdateRequest();
		request.setId(reservationId);
		request.setNumberOfBags(numberOfBags);
		request.setCheckedIn(1);
		Reservation updateReservation = checkInRestClient.updateReservation(request);
		System.out.println(updateReservation.getNumberOfBags()+" - Number of bags checked in for booking Id - "+updateReservation.getId());
		modelMap.addAttribute("msg", updateReservation.getNumberOfBags()+" - Number of bags checked in for booking Id - "+updateReservation.getId());
		return "completeCheckIn";
	}

}
