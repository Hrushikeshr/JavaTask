package problemstatement16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class PassOrFail {
    public void checkMark(){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Float> hm = new HashMap<>();
        int n = sc.nextInt();
        String name;
        float mark;
        for (int i =0; i < n; i++){
            name = sc.next();
            mark = sc.nextFloat();
            hm.put(name, mark);
        }

        HashMap<String, String> nhm = new HashMap<>();
        Iterator<String> itr = hm.keySet().iterator();
        while (itr.hasNext()){
            String id = itr.next();
            float mark1 = hm.get(id);

            if (mark1> 60){
                nhm.put(id, "pass");
            }
            else {
                nhm.put(id, "Faill");
            }
        }

        System.out.println(nhm);

    }

    public static void main(String[] args) {
        PassOrFail pf = new PassOrFail();
        pf.checkMark();
    }
}

