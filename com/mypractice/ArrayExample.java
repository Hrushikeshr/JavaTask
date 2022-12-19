//class Divisor{
//
//
//}

import java.util.Scanner;

public class ArrayExample {

    public static void findingDiv(int n){
        int[] arr = new int[100];
        int count = 0;
        for(int index =1; index<=n; index++){
            if(n % index == 0){
                arr[count]=index;
                count++;
            }
        }
        for (int i =0; i<count; i++) {
            if (i == count-1){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i] + " + ");
            }

        }

        int sum = 0;
        for (int i=0; i<count; i++){

            sum +=arr[i];
        }
        System.out.println(" = "+sum);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        findingDiv(num);

    }

}
