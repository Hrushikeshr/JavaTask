package com.practice;

public class Task {
    public static void main(String[] args) {
        for (int i =0; i<= 50; i++){
            if (i%5 ==0  && i%3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
