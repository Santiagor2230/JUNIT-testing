/*Santiago Ramirez

06/12/2022

CS-320-T5614*/
package taskserv;
import java.util.concurrent.atomic.AtomicLong;


public class Task {
	
	//variables
	final private String objectId; 
	private String objectName;
	private String objectDescription;
	
	//generates new id
	private static AtomicLong idGenerator = new AtomicLong();
	
	//CONSTRUCTOR
	public Task(String objectName, String objectDescription) {
		this.objectId = String.valueOf(idGenerator.getAndIncrement()); //New id
		
		//checks object name
		if(objectName == null || objectName.length() == 0) {
			this.objectName = "NULL";
		}
		
		else if(objectName.length() > 20) {
			this.objectName = objectName.substring(0,20);
		}
		
		else {
			this.objectName = objectName;
		}
		
		//checks object description
		if(objectDescription == null || objectDescription.length() == 0) {
			this.objectDescription = "NULL";
		}
		
		else if(objectDescription.length() > 50) {
			this.objectDescription = objectDescription.substring(0,50);
		}
		
		else {
			this.objectDescription = objectDescription;
		}
		
		
	}
	
	
	//GETTER
	//gets objects id
	public String getObjectId() {
		return objectId;
	}
	
	//gets objects name
	public String getObjectName() {
		return objectName;
	}
	
	//gets objects description
	public String getObjectDescription() {
		return objectDescription;
	}
	
	//SETTER
	
	//sets objects name
	public void setObjectName(String objectName) {
		
		if(objectName == null || objectName.length() == 0) {
			this.objectName = "NULL";
		}
		
		else if(objectName.length() > 20) {
			this.objectName = objectName.substring(0,20);
		}
		
		else {
			this.objectName = objectName;
		}
	}
	
	//sets objects description
	public void setObjectDescription(String objectDescription) {
		if(objectDescription == null || objectDescription.length() == 0) {
			this.objectDescription = "NULL";
		}
		
		else if(objectDescription.length() > 50) {
			this.objectDescription = objectDescription.substring(0,50);
		}
		
		else {
			this.objectDescription = objectDescription;
		}
	}

}
