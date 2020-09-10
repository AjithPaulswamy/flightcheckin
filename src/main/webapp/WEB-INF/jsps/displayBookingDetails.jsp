<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking Details - Checkin</title>
</head>
<body>

<h2>Flight Details :</h2>
Airlines : ${bookingDetails.flight.operatingAirlines }</br>
Flight number : ${bookingDetails.flight.flightNumber }</br>
Departure City : ${bookingDetails.flight.departureCity }</br>
Arrival City : ${bookingDetails.flight.arrivalCity }</br>
Date Of Departure : ${bookingDetails.flight.estimatedDepartureTime }</br>

<h2>Passenger Details :</h2>
First Name : ${bookingDetails.passenger.firstName }</br>
Last Name : ${bookingDetails.passenger.lastName }</br>
Email : ${bookingDetails.passenger.email }</br>
Phone : ${bookingDetails.passenger.phone }</br>

<form method="post" action="completeCheckIn">
Enter the Number of Baggage : <input type="text" name="numberOfBags" value="2"/>
<input type="hidden" value="${bookingDetails.id }" name="reservationId"/>
<input type="submit" value="Check In"/>
</form>

</body>
</html>