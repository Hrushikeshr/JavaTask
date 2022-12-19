package javaassignment;



class MyThread1 implements Runnable {
	
    public void run(){
    	double add = 0;
    	
        for(int i=1;i<11;i++){
            
        	add += i;
                
        }
        System.out.println(add);
    }
}

class MyThread2 extends MyThread1 implements Runnable {
	
    public void run() {
    	
    	int add = 0;
    	double avg = 0.0;
    	
        for(int i=1;i<11;i++) {
            
        	add += i;
        	
        }
        
        avg = (add / 10);
        System.out.println(avg);
        
    }
}
class Display extends MyThread2 implements Runnable {
	
	Runnable r1 = new MyThread1();
	Thread t1 = new Thread(r1);
	
	Runnable r2 = new MyThread2();
	Thread t2 = new Thread(r2);
	
	public void run() {
		
		t1.run();
		t2.run();
	}
	
	
	
	
}
public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Runnable r3 = new Display();
		Thread t3 = new Thread(r3);
		
		t3.run();

	}

}

