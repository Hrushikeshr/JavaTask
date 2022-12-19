package javaassignment;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

public class Ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Perform analysis on ListIterator and Iterator and provide your handson examples on each analysis. */
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        
        
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of Iterator
        Iterator<Integer> iterate = numbers.iterator();

        // Using the next() method
        int number = iterate.next();
        System.out.println("Accessed Element: " + number);

        // Using the remove() method
        iterate.remove();
        System.out.println("Removed Element: " + number);

        System.out.print("Updated ArrayList: ");

        // Using the hasNext() method
        while(iterate.hasNext()) {
            // Using the forEachRemaining() method
            iterate.forEachRemaining((value) -> System.out.print(value + ", "));
            
        }
        
        
        // Creating an instance of ListIterator
        ListIterator<Integer> iterate1 = numbers.listIterator();
        iterate1.next();
        //iterate1.next();

        // Using the previous() method
        int number1 = iterate1.previous();
        System.out.println("Previous Element: " + number1);

        // Using the previousIndex()
        int index1 = iterate1.previousIndex();
        System.out.println("Position of the Previous element: " + index1);

	}

}
