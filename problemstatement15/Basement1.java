package problemstatement15;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Basement1{


	private Scanner sc = new Scanner(System.in);
	private int noOfBikes =0;
	int j =0;
	ArrayList<String> arrayList = new ArrayList<>();




	public void bikeList(){
		for (int i =0; i<15; i++){
			arrayList.add(i,"slot "+(i+1));
		}
	}
	public void printList(int i){

		for (int p = 0; p<15-i; p++){
			System.out.println(arrayList.get(p));
		}
	}

	public void removeList(int i){
		int k = i+j;
		for (; j<k; j++){
			arrayList.remove(j);
			System.out.println("slot-" + (j + 1) + " : occupied for" +  "Bike - " + (j + 1));
		}

	}

	public void bikes() {
		char ch;
		do {
			System.out.println("Enter which vehicle you want to park 1 for bike and 2 for cars: ");
			int num = sc.nextInt();

			switch (num){
				case 1 ->{

					System.out.println("For Bike Parking(BASMENT-1):  Total slots are: ");
					printList(noOfBikes);

					System.out.println("Enter No. BIKES");
					this.noOfBikes = sc.nextInt();


					System.out.println("\nOccupied slots By(BIKES, BASEMENT-1: ");
					removeList(noOfBikes);
				}
				case 2 -> {

				}
				default -> System.out.println("Invalid Input");
			}

			System.out.println("Enter y for continue and n of exit: ");
			ch = sc.next().trim().charAt(0);
		}while (ch == 'y');



	}
}

























