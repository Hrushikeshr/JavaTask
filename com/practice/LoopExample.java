package com.practice;

import java.util.ArrayList;

public class LoopExample {
    public static void main(String[] args) {
//        int[] arr = {10,15,4,56,7,8,99,45};
//
//        for(int n : arr){
//            System.out.println(n);
//        }
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(5);
        list.add(54);
        list.add(55);
        list.add(56);
        list.add(57);
        list.add(78);
        list.add(48);
        list.add(58);
        list.forEach((Integer i) -> System.out.println(i));

    }


}
