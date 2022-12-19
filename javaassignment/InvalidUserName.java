package javaassignment;

public class InvalidUserName extends RuntimeException {
	
	@Override
	public String toString() {
		
		return "Enter Name's length should be greater than 10 or equal to 10, and doesn't contain & ";
	}

}
