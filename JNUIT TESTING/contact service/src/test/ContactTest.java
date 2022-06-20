/*Santiago Ramirez

06/12/2022

CS-320-T5614*/
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import services.Contact;

class ContactTest {

	@Test // Test if statements are all true based on conditions it should all come as aspected
	void validationContactTest() {
		Contact contact = new Contact("Santiago", "Ramirez","0123456789", "88501998street" );
		assertTrue(contact.getFirstName().equals("Santiago"));
		assertTrue(contact.getLastName().equals("Ramirez"));
		assertTrue(contact.getNumber().equals("0123456789"));
		assertTrue(contact.getAddress().equals("88501998street"));
	}
	
	@Test //Test makes sure to prove that constructor works
	void defaultValuesTest() {
		Contact contact = new Contact(null,null,null,null );
		assertTrue(contact.getFirstName().equals("NULL"));
		assertTrue(contact.getLastName().equals("NULL"));
		assertTrue(contact.getNumber().equals("5555555555"));
		assertTrue(contact.getAddress().equals("NULL"));
	}
	
	@Test //Test makes sure that there is an adjustment in case too many characters or to little 
	void adjustmentValuesTest() {
		Contact contact = new Contact("Santiagorasus","Ramurasuslar","01234","88-50-1998 street hollis NewYork,NY" );
		assertTrue(contact.getFirstName().equals("Santiagora"));
		assertTrue(contact.getLastName().equals("Ramurasusl"));
		assertTrue(contact.getNumber().equals("5555555555"));
		assertTrue(contact.getAddress().equals("88-50-1998 street hollis NewYo"));
	}

}
