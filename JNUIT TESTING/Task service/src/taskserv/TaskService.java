/*Santiago Ramirez

06/12/2022

CS-320-T5614*/
package taskserv;

import java.util.ArrayList;

import taskserv.Task;


public class TaskService {
	
	//array to hold objects
	private ArrayList<Task> objectList = new ArrayList<>();
	
	//displays object id, object name and object description
	public void displayObjectList() {
		for(int counter = 0; counter < objectList.size(); counter ++) {
			System.out.println("\t Object ID: " + objectList.get(counter).getObjectId());
			System.out.println("\t Object Name: " + objectList.get(counter).getObjectName());
			System.out.println("\t Object Description " + objectList.get(counter).getObjectDescription());
		}
	}
	
	// adds a new object to the list
	public void addObject(String objectName, String objectDescription) {
		
		Task task = new Task(objectName, objectDescription);
		
		objectList.add(task);
	}
	
	//gets object from the list with the objects id
	public Task getObject(String objectId) {
		
		Task task = new Task(null,null);//default values
		
		for(int counter = 0; counter < objectList.size(); counter ++) {
			if(objectList.get(counter).getObjectId().contentEquals(objectId)) {
				task = objectList.get(counter);
			}
		}
		return task;
	}
	
	//deletes object with the objects id
	public void deleteObject(String objectId) {
		for(int counter = 0; counter<objectList.size(); counter++) {
			if(objectList.get(counter).getObjectId().equals(objectId)) { //found contact
				objectList.remove(counter); //remove contact from list
				break;
			}
			if (counter == objectList.size()-1) {
				System.out.println("Object id:" + objectId + " not found."); // no contact found
			}
		}
	}
	
	//updates object name with the new object name and object id
	public void updateObjectName(String objectName, String objectId) {
		for(int counter = 0 ; counter < objectList.size(); counter++) {
			if(objectList.get(counter).getObjectId().equals(objectId)) {
				objectList.get(counter).setObjectName(objectName);
				break;
			}
			
			if( counter == objectList.size() - 1) {
				System.out.println("Object Id: r" + objectId + " is not valid ");
			}
		}
	}
	
	//updates object description with the new object description and object id
	public void updateObjectDescription(String objectDescription, String objectId) {
		for(int counter = 0 ; counter < objectList.size(); counter++) {
			if(objectList.get(counter).getObjectId().equals(objectId)) {
				objectList.get(counter).setObjectDescription(objectDescription);
				break;
			}
			
			if( counter == objectList.size() - 1) {
				System.out.println("Object Id: e" + objectId + " is not valid ");
			}
		}
	}
}
