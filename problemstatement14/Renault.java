package problemstatement14;
import java.util.HashMap;
import java.util.Scanner;

public class Renault {
    private static int r1=10;
    private static int r2=16;
    private static int r3=15;

    public static void renault(){
        HashMap<String,Integer>renaultLIst=new HashMap<String,Integer>();
        renaultLIst.put("renault turigo",r1);
        renaultLIst.put(" renault secnic",r2);
        renaultLIst.put("renault duster",r3);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for:renault turigo \n enter 2 for renault secnic \n enter 3 renault duster");
        int series=sc.nextInt();
        try {
            switch (series) {
                case 1 -> {
                    System.out.println("Your choose to buy renault turigo");
                    r1 = r1 - 1;
                    renaultLIst.replace("renault turigo", r1);
                    System.out.println("count of remaining is :" + renaultLIst.get("renault turigo"));
                }
                case 2 -> {
                    System.out.println("Your choose to buy renault secnic");
                    r2 = r2 - 1;
                    renaultLIst.replace("renault secnic", r2);
                    System.out.println("count of remaining is :" + renaultLIst.get("renault secnic"));
                }
                case 3 -> {
                    System.out.println("Your choose to buy renault duster");
                    r3 = r3 - 1;
                    renaultLIst.replace("renault duster", r3);
                    System.out.println("count of remaining is :" + renaultLIst.get("renault duster"));
                }
                default -> System.out.println("this model is is not available");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}


