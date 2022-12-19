package com.practice;

@FunctionalInterface  //It is optional
interface Drawable{
    public void draw();
}

interface Drawi{
    public void drawing();
}

public class LambdaExample {
    public static void main(String[] args) {
        int width=10;

        //with lambda
        Drawable d2=()->{
            System.out.println("Drawing "+width);
        };
        d2.draw();

        Drawi d = ()->{
            System.out.println("Dont draw");
        };
        d.drawing();
    }
}
