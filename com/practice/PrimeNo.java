package com.practice;

public class PrimeNo {
    public static void main(String[] args) {
        for (int i = 2; i<=100; i++){
            int add = 0;
            for (int j=1; j<i; j++){
                if (i % j ==0 ){
                    add = add+j;
                }
            }
            if (add != 1){
                System.out.println(i);
            }
        }
    }
}
