package com.problemstatement18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public void sortAlphabetic(){
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int num = sc.nextInt();

        System.out.println("Enter the element of the list");
        for(int i=0;i<num;i++)
        {  String j=sc.next();
            list.add(j);
        }

        System.out.println("Raw list: ");
        System.out.println(list);

        System.out.println("After sorting the list alphabetically: ");
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);


//        int len = list.toArray().length;
        List<String> upper= list.subList(0, 0);
        List<String> lower = list.subList(0, 0);
        if (num % 2 == 0){
             upper = list.subList(0, num/2);
             lower = list.subList(num/2, num);
        }
        else {
            upper = list.subList(0, (num/2)+1);
            lower = list.subList((num/2)+1, num);
        }


        upper.replaceAll(String::toUpperCase);
        lower.replaceAll(String::toLowerCase);


        System.out.println();
        System.out.println("After converting it into upper and lower case");
        List<String> newList = Stream.concat(upper.stream(), lower.stream()).toList();
        System.out.println(newList);


    }

    public static void main(String[] args) {

        Main main = new Main();
        main.sortAlphabetic();
    }
}
