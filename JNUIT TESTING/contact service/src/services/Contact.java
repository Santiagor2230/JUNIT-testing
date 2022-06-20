/*Santiago Ramirez

06/12/2022

CS-320-T5614*/

package services;
import java.util.concurrent.atomic.AtomicLong;

public class Contact {
	//INITIALIZE
	private final String id;   // initializing the contact id variable
	private String first_name; // initializing the first name variable
	private String last_name;  // initializing the last name variable
	private String number;     // initializing the number variable
	private String address;    // initializing the address variable
	
	//initializing the id generator
	private static AtomicLong idGenerator = new AtomicLong(); 
	
	//CONSTRUCTOR
	public Contact(String first_name,String last_name, String number, String address) {
		//CONTACTID
		this.id = String.valueOf(idGenerator.getAndIncrement());;// generate the contact id
		
		//First name constructor with conditions
		if(first_name == null || first_name.length() == 0) {
			this.first_name = "NULL";
		}
		
		else if(first_name.length() > 10) {
			this.first_name = first_name.substring(0, 10);
		}
		
		else {
			this.first_name = first_name;
		}
		
		//last name constructor with conditions
		if(last_name == null || last_name.length() == 0) {
			this.last_name = "NULL";
		}
		
		else if(last_name.length() > 10) {
			this.last_name = last_name.substring(0, 10);
		}
		
		else {
			this.last_name = last_name;
		}
		
		//Number constructor with conditions
		if(number == null || number.length() == 0 || number.length() != 10) {
			this.number = "5555555555";
		}
		
		
		else {
			this.number = number;
		}
		
		//Address constructor with conditions
		if(address == null || address.length() == 0) {
			this.address = "NULL";
		}
		
		else if(address.length() > 30) {
			this.address = address.substring(0, 30);
		}
		
		else {
			this.address = address;

		}
		
	}
	//GETTER
	//returns the contact id
	public String getId() {
		return id;
	}
	
	//returns first name
	public String getFirstName() {
		return first_name;
	}
	
	//return last name
	public String getLastName() {
		return last_name;
	}
	
	//returns number
	public String getNumber() {
		return number;
	}
	
	//returns address
	public String getAddress() {
		return address;
	}
	
	//SETTER
	//Sets FirstName with conditions
	public void setFirstName(String first_name) {
		if(first_name == null || first_name.length() == 0) {
			this.first_name = "NULL";
		}
		
		else if(first_name.length() > 10) {
			this.first_name = first_name.substring(0, 10);
		}
		
		else {
			this.first_name = first_name;
		}
	}
	
	//Set LastName with conditions
	public void setLastName(String last_name) {
		if(last_name == null || last_name.length() == 0) {
			this.last_name = "NULL";
		}
		
		else if(last_name.length() > 10) {
			this.last_name = last_name.substring(0, 10);
		}
		
		else {
			this.last_name = last_name;
		}
	}
	
	//Set Number with conditions
	public void setNumber(String number) {
		if(number == null || number.length() == 0 || number.length() != 10) {
			this.number = "5555555555";
		}
		
		
		else {
			this.number = number;
		}
		
	}
	
	//set Address with conditions
	public void setAddress(String address) {
		if(address == null || address.length() == 0) {
			this.address = "NULL";
		}
		
		else if(address.length() > 30) {
			this.address = address.substring(0, 30);
		}
		
		else {
			this.address = address;

		}
	}
}
