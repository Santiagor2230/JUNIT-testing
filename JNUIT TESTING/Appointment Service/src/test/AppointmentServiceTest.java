package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.Before;

import org.junit.jupiter.api.Test;

import apointserv.AppointmentService;

public class AppointmentServiceTest {
	
	
	// add description before deletion
	@Before
	void addBeforeTest() {
		
		AppointmentService appointment = new AppointmentService();
		
		appointment.addAppointment("This is an appointment for the new app");
		
	}
	
	//deletion Test
	@Test
	void deleteTest() {
		
		AppointmentService appointment = new AppointmentService();
		
		appointment.deleteAppointment("0");
		
		assertTrue(appointment.getAppointment("0").getAppointmentDescription() == "NULL");
		
	}
	
	//add test
	@Test
	void addTest() {
		
		AppointmentService appointment = new AppointmentService();
		
		appointment.addAppointment("This is an appointment for the new app");
		
		assertTrue(!appointment.getAppointment("0").getAppointmentDate().before(new Date()));
		assertTrue(appointment.getAppointment("0").getAppointmentDescription() == "This is an appointment for the new app");
		
	}

	
}
