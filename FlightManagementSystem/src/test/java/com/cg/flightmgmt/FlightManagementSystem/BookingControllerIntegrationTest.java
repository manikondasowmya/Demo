package com.cg.flightmgmt.FlightManagementSystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;




@SpringBootTest(classes =FlightManagementSystemApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookingControllerIntegrationTest {
	@Autowired
	private TestRestTemplate restTemplate;
	@LocalServerPort
	private int port;
	private String getRootUrl() {
		return "http://localhost:" +port;
}
	
	
	@Test

	public void testDeleteBooking() {
		long id= 2;
		Booking booking=restTemplate.getForObject(getRootUrl()+"/api/deleteBooking/id/"+id,Booking.class);
		assertEquals(id, booking.getId());
		restTemplate.delete(getRootUrl() + "/api/deleteBooking/id" +id, booking);
		
			Booking b=restTemplate.getForObject(getRootUrl()+"/api/deleteBooking/id/"+id, Booking.class);
			assertNotEquals(id, b.getId());
}
}
