package problemstatement14;
import java.util.HashMap;
import java.util.Scanner;

public class Volvo {
    private static int v1=10;
    private static int v2=16;
    private static int v3=15;

    public static void volvo(){
        HashMap<String,Integer>volvoList=new HashMap<String,Integer>();
        volvoList.put("volvo xc40",v1);
        volvoList.put("volvo xc60",v2);
        volvoList.put("volvo xc90",v3);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for volvo xc40 \n enter 2 for volvo 60 \n enter 3 for volvo xc90");
        int series=sc.nextInt();
        try {
            switch (series) {
                case 1 -> {
                    System.out.println("Your choose to buy volvo xc40:");
                    v1 = v1 - 1;
                    volvoList.replace("volvo xc40", v1);
                    System.out.println("count of remaining is :" + volvoList.get("volvo xc40"));
                }
                case 2 -> {
                    System.out.println("Your choose to buy volvo xc60");
                    v2 = v2 - 1;
                    volvoList.replace("volvo", v2);
                    System.out.println("count of remaining is :" + volvoList.get("volvo xc60"));
                }
                case 3 -> {
                    System.out.println("Your choose to buy mini103");
                    v3 = v3 - 1;
                    volvoList.replace("volvo xc90", v3);
                    System.out.println("count of remaining is :" + volvoList.get("mini103"));
                }
                default -> System.out.println("this model is is not available");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
