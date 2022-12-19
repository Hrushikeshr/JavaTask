package com.practice;



interface Inter1{
    default void show(){
        System.out.println("Hrushikesh");
    }
}
interface Inter2{
    default void show(){
        System.out.println("Rout");
    }
}

@FunctionalInterface
interface Lam{
    public void sum();
}

public class Test implements Inter1,Inter2{

    public void show(){
        Inter1.super.show();
    }
    // Method sum

    //main method.
    public static void main(String[] args) {
        int a = 10;
        Test t = new Test();
        t.show();

        Lam lam = ()->{
            int b =20;
            b = 30;
            System.out.println(a+b);
        };
        lam.sum();
    }

}
