package apointserv;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;


public class Appointment {
	
	//variables
	final private String appointmentId;
	private Date appointmentDate;
	private String appointmentDescription;

	
	//variable id generator
	private static AtomicLong idGenerator = new AtomicLong();
	
	
	//CONSTRUCTOR
	public Appointment(String appointmentDescription) {
		Date newDate = new Date();//todays date
		Date tomorrowDate = new Date(newDate.getTime() + (1000 * 60 * 60 * 24));//tomorrows date
		
		//generating id
		this.appointmentId = String.valueOf(idGenerator.getAndIncrement());
		
		
		//new date
		if (!tomorrowDate.before(new Date())){
			this.appointmentDate = tomorrowDate;
		}
		
		else {
			Date newTomorrow = new Date(tomorrowDate.getTime() + (1000 * 60 * 60 * 24));
			this.appointmentDate = newTomorrow;
		}
		
		//description
		if(appointmentDescription == null || appointmentDescription.length() == 0) {
			this.appointmentDescription = "NULL";
		}
		
		else if(appointmentDescription.length() > 50) {
			this.appointmentDescription = appointmentDescription.substring(0,50);
		}
		
		else {
			this.appointmentDescription = appointmentDescription;
		}
		
	}
	
	
	//GETTER
	// returns appointment id
	public String getAppointmentId() {
		return appointmentId;
	}
	
	// returns appointment date
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	// return appointment description
	public String getAppointmentDescription() {
		return appointmentDescription;
	}
	
	//SETTER
	// sets appointment description
	public void setAppointmentDescription(String appointmentDescription) {
		if(appointmentDescription == null || appointmentDescription.length() == 0) {
			this.appointmentDescription = "NULL";
		}
		
		else if(appointmentDescription.length() > 50) {
			this.appointmentDescription = appointmentDescription.substring(0,50);
		}
		
		else {
			this.appointmentDescription = appointmentDescription;
		}
	}
	
}
