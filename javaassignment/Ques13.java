package javaassignment;

class LifeCycle extends Thread { // by extending Thread class we can create a thread

	public void run() {// run is a method where our thread task is runnning

		System.out.println("Thread 1");
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getAllStackTraces());

	}

}

class LifeCycle2 extends Thread {

	public void run() {
		System.out.println("Thread 2'");
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getAllStackTraces());

	}

}

public class Ques13 {
	
	public static void main(String [] args) throws InterruptedException {
		
		 	LifeCycle c = new LifeCycle(); // we are calling thread 0
	        c.start();
	        c.join(); // this will cal runnale  interface then it will call run method
	        c.setName("Work1");

	        LifeCycle2 c2 = new LifeCycle2();
	        c2.start();
	        c2.setName("Work1");
	}
}
