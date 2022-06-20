/*Santiago Ramirez

06/12/2022

CS-320-T5614*/
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import taskserv.TaskService;

class TaskServiceTest {
	
	@Before
	void beforeTesting() {
		TaskService taskservices = new TaskService();
		
		taskservices.addObject("The object is irrelavent", "The object serves no purpose");
	}

	@Test
	//checks if a Task can be deleted after creation
	void deleteTest() {
		TaskService taskservices = new TaskService();
		taskservices.deleteObject("0");
		
		assertTrue(taskservices.getObject("0").getObjectName().equals("NULL"));
		assertTrue(taskservices.getObject("0").getObjectDescription().equals("NULL"));
	}
	
	
	@Test
	//checks if the add Task works, if getobject works and then proceeds to update each one to see if it accurately updates
	void addAndUpdateTest() {
		TaskService taskservices = new TaskService();
		taskservices.addObject("The application", "The main application");
		
		assertTrue(taskservices.getObject("0").getObjectName().equals("The application"));
		assertTrue(taskservices.getObject("0").getObjectDescription().equals("The main application"));
		
		taskservices.updateObjectName("The software", "0");
		taskservices.updateObjectDescription("The main software", "0");
		
		
		assertTrue(taskservices.getObject("0").getObjectName().equals("The software"));
		assertTrue(taskservices.getObject("0").getObjectDescription().equals("The main software"));
	}
}
