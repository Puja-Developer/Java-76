//creating a user-defined exception
package co.edureka.except;

public class InvalidAgeException extends Exception {

	public InvalidAgeException() {		
	}

	public InvalidAgeException(String message) {
		super(message);		
	}
 
}
