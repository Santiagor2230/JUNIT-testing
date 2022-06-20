package apointserv;

import java.util.ArrayList;

import apointserv.Appointment;;

public class AppointmentService {
	
	//array to hold appointments
	private ArrayList <Appointment> appointmentList = new ArrayList<>();
	
	//display appointment id, date and description
	public void displayAppointmentList() {
		for(int counter = 0; counter < appointmentList.size(); counter++ ) {
			System.out.println("\t Appointment ID: " + appointmentList.get(counter).getAppointmentId());
			System.out.println("\t Appointment Date: " + appointmentList.get(counter).getAppointmentDate());
			System.out.println("\t Appointment Description: " + appointmentList.get(counter).getAppointmentDescription());
		}
	}
	
	//adds an appointment
	public void addAppointment(String appointmentDescription) {
		
		Appointment appointment = new Appointment(appointmentDescription);
		
		appointmentList.add(appointment);
		
	}
	
	//gets object from the list with the appointment id
		public Appointment getAppointment(String appointmentId) {
			
			Appointment appointment = new Appointment(null);//default values
			
			for(int counter = 0; counter < appointmentList.size(); counter ++) {
				if(appointmentList.get(counter).getAppointmentId().contentEquals(appointmentId)) {
					appointment = appointmentList.get(counter);
				}
			}
			return appointment;
		}
		
		//deletes appointment with the appointment id
		public void deleteAppointment(String appointmentId) {
			for(int counter = 0; counter<appointmentList.size(); counter++) {
				if(appointmentList.get(counter).getAppointmentId().equals(appointmentId)) { //found contact
					appointmentList.remove(counter); //remove contact from list
					break;
				}
				if (counter == appointmentList.size()-1) {
					System.out.println("Appointment id:" + appointmentId + " not found."); // no appointment found
				}
			}
		}

}
