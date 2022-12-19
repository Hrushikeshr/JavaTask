package com.practice;

import java.util.*;

public class SynchronisedArrayList {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
        list.add(123);
        list.add(98);
        list.add(890);

        synchronized (list){
            Iterator it = list.iterator();

            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}
