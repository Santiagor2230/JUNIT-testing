/*Santiago Ramirez

06/12/2022

CS-320-T5614*/
package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;


import services.ContactService;



class ContactServiceTest {
	
	@Before
	void beforeTesting() {
		ContactService service = new ContactService();
		
		service.addContact("Santiago", "Ramirez", "0123456789", "88-5012438street");
	}
	
	@Test
	//checks if a contact can be deleted after creation
	void deleteTest() {
		ContactService service = new ContactService();
		
		service.deleteContact("0");
		
		assertTrue(service.getContact("0").getFirstName().equals("NULL"));
		assertTrue(service.getContact("0").getLastName().equals("NULL"));
		assertTrue(service.getContact("0").getNumber().equals("5555555555"));
		assertTrue(service.getContact("0").getAddress().equals("NULL"));
	}
	
	
	@Test
	//checks if the add contact works and then proceeds to update each one to see if it accuratly updates
	void addAndUpdateTest() {
		ContactService service = new ContactService();
		service.addContact("Santiago", "Ramirez", "0123456789", "88-5012438street");
		
		assertTrue(service.getContact("0").getFirstName().equals("Santiago"));
		assertTrue(service.getContact("0").getLastName().equals("Ramirez"));
		assertTrue(service.getContact("0").getNumber().equals("0123456789"));
		assertTrue(service.getContact("0").getAddress().equals("88-5012438street"));
		
		service.updateFirstName("Santus", "0");
		service.updateLastName("Ronaldo", "0");
		service.updateNumber("1112223334", "0");
		service.updateAddress("843289423943", "0");
		
		assertTrue(service.getContact("0").getFirstName().equals("Santus"));
		assertTrue(service.getContact("0").getLastName().equals("Ronaldo"));
		assertTrue(service.getContact("0").getNumber().equals("1112223334"));
		assertTrue(service.getContact("0").getAddress().equals("843289423943"));
	}
	
	
}
	
