package javaassignment;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) throws AssertionError {
        Scanner sc = new Scanner(System.in);

        System.out.println("Click 1 for + ");
        System.out.println("Click 2 for - ");
        System.out.println("Click 3 for / ");
        System.out.println("Click 4 for * ");

        int i = sc.nextInt();
        Task21 task = new Task21();

        if (i == 1) {
            System.out.println("Enter value of a");
            double a = sc.nextDouble();
            System.out.println("Enter value of b");
            double b = sc.nextDouble();
            double result = task.calc(i, a, b);

            System.out.println(result);
        } else if (i == 2) {

            System.out.println("Enter value of a");
            double c = sc.nextDouble();
            System.out.println("Enter value of b");
            double d = sc.nextDouble();
            double result2 = task.calc(i, c, d);

            System.out.println(result2);
        } else if (i == 3) {
            System.out.println("Enter value of a");
            double e = sc.nextDouble();
            System.out.println("Enter value of b");
            double f = sc.nextDouble();
            double result3 = task.calc(i, e, f);
            System.out.println(result3);

        } else if (i == 4) {

            System.out.println("Enter value of a");
            double g = sc.nextDouble();
            System.out.println("Enter value of b");
            double h = sc.nextDouble();
            double result3 = task.calc(i, g, h);
            System.out.println(result3);

        } else {
            throw new AssertionError();
        }

    }
}
