package javaassignment;

import java.util.Scanner;

public class Ques19 {
	
	public static String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		name = sc.next();
		
		
		while (!name.matches("[a-zA-Z]+") && name.length() < 10) {

			System.out.println( new InvalidUserName());
			System.out.println("Enter Your Name");
			name = sc.next();
		}
		
		System.out.println("Your Name Is Sucessfully Registered !!! >>>>>>>>>>" + name + "\nThank You");

	}

}
