package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Date;

import apointserv.Appointment;

class AppointmentTest {
	
	//constructor test
	@Test
	void appointmentConstructorTest() {
		Appointment appointment  = new Appointment("The appointment is related to a new application");
		assertTrue(!appointment.getAppointmentDate().before(new Date()));
		assertTrue(appointment.getAppointmentDescription() == "The appointment is related to a new application");
		
	}

	//constructor null Test
	@Test
	void appointmentEmptyTest() {
		Appointment appointment  = new Appointment(null);
		assertTrue(appointment.getAppointmentDescription() == "NULL");
	}
	
	//constructor adjustment value test
	@Test
	void appointmentAdjustmentTest() {
		Appointment appointment  = new Appointment("The appointment is related to a new application that is in development");
		assertTrue(appointment.getAppointmentDescription().equals("The appointment is related to a new application th"));
	}
}
