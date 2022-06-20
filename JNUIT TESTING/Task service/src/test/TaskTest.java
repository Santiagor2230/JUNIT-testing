/*Santiago Ramirez

06/12/2022

CS-320-T5614*/
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import taskserv.Task;

class TaskTest {

	@Test
	//allows to see if the constructor accurately works
	void taskConstructorTest() {
		Task task = new Task("New object", "This object creates an app");
				assertTrue(task.getObjectName() == "New object");
				assertTrue(task.getObjectDescription() == "This object creates an app");
	}
	
	@Test
	//checks if constructor gives a default name and description with null
	void taskConstructorFailedTest() {
		Task task = new Task(null, null);
				assertTrue(task.getObjectName() == "NULL");
				assertTrue(task.getObjectDescription() == "NULL");
	}
	
	@Test
	//checks if cosntructor can adjust the name and description based on boundaries
	void taskConstructorAdjustmentTest() {
		Task task = new Task("new Object for the new app", "This object creates an app that allows for users to analyse data");
				assertTrue(task.getObjectName().equals("new Object for the n"));
				assertTrue(task.getObjectDescription().equals("This object creates an app that allows for users t"));
				//System.out.println(task.getObjectDescription());
	}
	

}
