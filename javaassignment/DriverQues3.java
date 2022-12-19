package javaassignment;

class AnonymousClass {

	public void implementInterface() {

		// anonymous class implementing interface
		Application p1 = new Application() {
			public void webBrowser() {
				System.out.println("Inside an anonymous class, implementing Interface");
			}
		};
		p1.webBrowser();
	}

}

public class DriverQues3 {

	public static void main(String[] args) {
		
		AnonymousClass obj = new AnonymousClass();
		obj.implementInterface();
		
		
		
		
		

	}

}
