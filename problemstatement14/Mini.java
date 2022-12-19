package problemstatement14;

import java.util.HashMap;
import java.util.Scanner;
public class Mini {
    private static int m1=10;
    private static int m2=16;
    private static int m3=15;
    public static void mini() {
        HashMap<String,Integer>miniList=new HashMap<String,Integer>();
        miniList.put("mimi101",m1);
        miniList.put(" mini102",m2);
        miniList.put("mini103",m3);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for mini 101 \n enter 2 for mini 102 \n enter 3 for mini 103");
        int series=sc.nextInt();
        try {
            switch(series) {
                case 1:
                    System.out.println("Your choose to buy mini101");
                    m1=m1-1;
                    miniList.replace("mini101",m1);
                    System.out.println("count of remaining is :"+miniList.get("mini101"));
                    break;
                case 2:
                    System.out.println("Your choose to buy mini102");
                    m2=m2-1;
                    miniList.replace("mini102",m2);
                    System.out.println("count of remaining is :"+miniList.get("mini102"));
                    break;
                case 3:
                    System.out.println("Your choose to buy mini103");
                    m3=m3-1;
                    miniList.replace("mini103",m3);
                    System.out.println("count of remaining is :"+miniList.get("mini103"));
                    break;
                default:
                    System.out.println("this model is is not available");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
