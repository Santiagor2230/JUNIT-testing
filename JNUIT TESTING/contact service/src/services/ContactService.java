/*Santiago Ramirez

06/12/2022

CS-320-T5614*/
package services;
import java.util.ArrayList;
import services.Contact;


//build a class
public class ContactService{
	
	// initialized an array
	private ArrayList<Contact> contactList = new ArrayList<>();
	
	//prints out the contact list
	public void displayContactList() {
		for(int counter = 0; counter < contactList.size(); counter++) {
			System.out.println("\t Contact ID: " + contactList.get(counter).getId());// prints contact id
			System.out.println("\t First Name: " + contactList.get(counter).getFirstName());// prints first name
			System.out.println("\t Last Name: " + contactList.get(counter).getLastName()); // prints last name
			System.out.println("\t Number: " + contactList.get(counter).getNumber()); // prints number
			System.out.println("\t Address: " + contactList.get(counter).getAddress()); // prints address
		}
	}
	
	// adds contact
	public void addContact(String first_name, String last_name, String number, String address) {
	
	Contact contact = new Contact(first_name, last_name, number, address );
	
	contactList.add(contact); //adds a new contact with unique id

	}
	
	
	// looking up contact with id if no match then default constructor values
	public Contact getContact(String id) {
		
		Contact contact = new Contact(null,null,null,null);//default values
		
		for(int counter = 0; counter < contactList.size(); counter ++) {
			if(contactList.get(counter).getId().contentEquals(id)) {
				contact = contactList.get(counter);
			}
		}
		return contact;
	}

	//delete contact
	public void deleteContact(String id) {
		for(int counter = 0; counter<contactList.size(); counter++) {
			if(contactList.get(counter).getId().equals(id)) { //found contact
				contactList.remove(counter); //remove contact from list
				break;
			}
			if(counter == contactList.size()-1) {
				System.out.println("Contact ID:" + id + " not found."); // no contact found
			}
		}
	}
	
	//updates the first name
	public void updateFirstName(String updatedString, String id) {
		for(int counter = 0; counter < contactList.size(); counter++) {
			if(contactList.get(counter).getId().equals(id)){ //finds contact match
				contactList.get(counter).setFirstName(updatedString); //updates the first name of the contact
				break;
			}
			if(counter == contactList.size()-1) {
				System.out.println("Contact ID: " + id + " not found"); // no contact found
				
			}
		}
	}
	
	//updates the last name
	public void updateLastName(String updatedString, String id) {
		for(int counter = 0; counter < contactList.size(); counter++) {
			if(contactList.get(counter).getId().equals(id)){ //finds contact match
				contactList.get(counter).setLastName(updatedString); //updates the last name
				break;
			}
			if(counter == contactList.size()-1) {
				System.out.println("Contact ID: " + id + " not found"); // no contact found
				
			}
		}
	}
	
	//updates the number
	public void updateNumber(String updatedString, String id) {
		for(int counter = 0; counter < contactList.size(); counter++) {
			if(contactList.get(counter).getId().equals(id)){ //finds contact match
				contactList.get(counter).setNumber(updatedString); //updates the number
				break;
			}
			if(counter == contactList.size()-1) {
				System.out.println("Contact ID: " + id + " not found"); // no contact found
				
			}
		}
	}
	
	//updates address
	public void updateAddress(String updatedString, String id) {
		for(int counter = 0; counter < contactList.size(); counter++) {
			if(contactList.get(counter).getId().equals(id)){ //finds contact match
				contactList.get(counter).setAddress(updatedString); //updates the address
				break;
			}
			if(counter == contactList.size()-1) {
				System.out.println("Contact ID: " + id + " not found"); // no contact found
				
			}
		}
	}
	
}
