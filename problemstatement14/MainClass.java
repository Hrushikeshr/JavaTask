package problemstatement14;

import java.util.Scanner;
public class MainClass {
    public static void main(String[] ags) {
        Scanner sc=new Scanner(System.in);
        char ch;
        do {
            System.out.println("enter which model you want");
            System.out.println("enter 1 for Renault;enter 2 for mini;enter 3 for volvo");
            int model=sc.nextInt();
            try {
                switch (model) {
                    case 1 -> {
                        System.out.println(" Your choosing renault");
                        Renault.renault();
                    }
                    case 2 -> {
                        System.out.println(" Your choosing mini");
                        Mini.mini();
                    }
                    case 3 -> {
                        System.out.println(" Your choosing volvo");
                        Volvo.volvo();
                    }
                    default -> System.out.println("this model is not available please choose from available models");
                }
            }catch(Exception e) {
                System.out.println(e);
            }
            System.out.println("Enter y for continue:");
            ch = sc.next().trim().charAt(0);
        }while (ch == 'y');
    }
}
