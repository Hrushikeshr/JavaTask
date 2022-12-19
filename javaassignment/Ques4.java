package javaassignment;

public class Ques4 {
	
	public static String id = "101";
	
	public static void greet() {
		
		System.out.println("core java training");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ques4 obj1 = new Ques4();
		Ques4 obj2 = new Ques4();
		
		greet();
		
		System.out.println(obj1.hashCode() + "\n" + obj1.toString());
		
		System.out.println(obj1.equals(obj2));
		
		
		int store = Integer.parseInt(id);
		
		System.out.println(store);
		
		
		

	}

}
