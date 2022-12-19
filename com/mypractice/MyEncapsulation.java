import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Calculation{
    private int num1, num2, num3, sum =0, mul = 0;
    public void sum(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        sum = num1 + num2 + num3;
        System.out.println(sum);

    }
    public void mul(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        mul = num1 * num2 * num3;
        System.out.println(mul);

    }
}

public class MyEncapsulation {
    public static void main(String[] args) {
        Calculation obj = new Calculation();
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        obj.mul(num1, num2, num3);
        obj.sum(num1, num2, num3);
    }



}

