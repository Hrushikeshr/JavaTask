package sportscomplex;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SportClub extends Thread implements Serializable {
    private Scanner sc = new Scanner(System.in);

    public void chooseCourt() {
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> fbNameList = new ArrayList<>();
        ArrayList<String> bcNameList = new ArrayList<>();

        HashMap<Integer, String> football = new HashMap<Integer, String>();
        for (int i = 1; i <= 20; i++) {
            football.put(i, " Football Court");
        }
        HashMap<Integer, String> footballTime = new HashMap<Integer, String>();

        footballTime.put(1, "7:00 - 7:30");
        footballTime.put(2, "7:30 - 8:00");
        footballTime.put(3, "8:00 - 8:30");
        footballTime.put(4, "8:30 - 9:00");
        footballTime.put(5, "9:00 - 9:30");
        footballTime.put(6, "9:30 - 10:00");
        footballTime.put(7, "10:00 - 10:30");
        footballTime.put(8, "10:30 - 11:00");
        footballTime.put(9, "11:00 - 11:30");
        footballTime.put(10, "11:30 - 12:00");
        footballTime.put(11, "12:00 - 12:30");
        footballTime.put(12, "12:30 - 13:00");
        footballTime.put(13, "13:00 - 13:30");
        footballTime.put(14, "13:30 - 14:00");
        footballTime.put(15, "14:00 - 14:30");
        footballTime.put(16, "14:30 - 15:00");
        footballTime.put(17, "15:00 - 15:30");
        footballTime.put(18, "15:30 - 16:00");
        footballTime.put(19, "16:00 - 16:30");
        footballTime.put(20, "16:30 - 17:00");

        HashMap<Integer, String> badminton = new HashMap<Integer, String>();
        for (int j = 1; j <= 10; j++) {
            badminton.put(j, " Badminton Court");
        }
        HashMap<Integer, String> badmintonTime = new HashMap<Integer, String>();

        badmintonTime.put(1, " 7:00 - 8:00");
        badmintonTime.put(2, " 8:00 - 9:00");
        badmintonTime.put(3, " 9:00 - 10:00");
        badmintonTime.put(4, " 10:00 - 11:00");
        badmintonTime.put(5, " 11:00 - 12:00");
        badmintonTime.put(6, " 12:00 - 13:00");
        badmintonTime.put(7, " 13:00 - 14:00");
        badmintonTime.put(8, " 14:00 - 15:00");
        badmintonTime.put(9, " 15:00 - 16:00");
        badmintonTime.put(10, " 16:00 - 17:00");

        HashMap<Integer, String> boxCricket = new HashMap<Integer, String>();
        for (int k = 1; k <= 5; k++) {
            boxCricket.put(k, " Box Cricket");
        }
        HashMap<Integer, String> boxCricketTime = new HashMap<Integer, String>();

        boxCricketTime.put(1, " 7:00 - 9:00");
        boxCricketTime.put(2, " 9:00 - 11:00");
        boxCricketTime.put(3, " 11:00 - 13:00");
        boxCricketTime.put(4, " 13:00 - 15:00");
        boxCricketTime.put(5, " 15:00 - 17:00");

        char ch;
        System.out.println("Welcome to Our Sports Club...");
        System.out.println("Please Enter you name?");
        String pName = sc.next();
        while (!pName.matches("[a-zA-Z]+")){
            System.out.println("Please Enter a valid name..");
            pName = sc.next();
        }
        do {

            try {


                System.out.println("Enter 1. Badminton, 2. Football, 3. Box cricket:");
                int courtNum = sc.nextInt();
                switch (courtNum) {
                    case 1 -> {
                            System.out.println("Available court are: ");
                            for (Map.Entry value : badminton.entrySet()) {
                                System.out.println("Court- " + value.getKey());
                            }
                            System.out.println("Select which courts you want to book..");
                            int courtNo = sc.nextInt();
                            if (courtNo <= 10) {
                                if (badminton.containsKey(courtNo)) {
                                    System.out.println("The Available time slot are");
                                    for (Map.Entry value : badmintonTime.entrySet()) {
                                        System.out.println("Enter " + value.getKey() + " for Time slot- " + value.getValue());
                                    }

                                    System.out.println("Enter the time slot: ");
                                    int timeSlot = sc.nextInt();
                                    if (badmintonTime.containsKey(timeSlot)) {
                                        System.out.println("Your slot is allocated.");
                                        nameList.add(pName);
                                        System.out.println("Name: "+ pName);
                                        System.out.println("Court No: "+ courtNo);
                                        System.out.println("Time slot: "+badmintonTime.get(timeSlot));
                                        badmintonTime.remove(timeSlot);

                                    } else {
                                        System.out.println("Please Enter a valid time slot.");
                                    }
                                    if (badmintonTime.isEmpty()) {
                                        badminton.remove(courtNo);
                                    }
                                } else {
                                    System.out.println("This slot is not available!");
                                }
                            } else {
                                System.out.println("Please Enter the slot no between 1 to 10");
                            }
                    }
                    case 2->{
                            System.out.println("Available courts are: ");
                            for (Map.Entry value : football.entrySet()) {
                                System.out.println("Court- " + value.getKey());
                            }
                            System.out.println("Select which court you want to book..");
                            int footCourtNo = sc.nextInt();
                            if (footCourtNo <= 20){
                                if (football.containsKey(footCourtNo)){
                                    System.out.println("The Available time slot are");
                                    for (Map.Entry value : footballTime.entrySet()) {
                                        System.out.println("Enter " + value.getKey() + " for Time slot- " + value.getValue());
                                    }
                                    System.out.println("Enter the time slot: ");
                                    int footTimeSlot = sc.nextInt();
                                    if (footballTime.containsKey(footTimeSlot)) {
                                        System.out.println("Your slot is allocated.");
                                        fbNameList.add(pName);
                                        System.out.println("Name: "+ pName);
                                        System.out.println("Court No: "+ footCourtNo);
                                        System.out.println("Time slot: "+footballTime.get(footTimeSlot));
                                        footballTime.remove(footTimeSlot);
                                    } else {
                                        System.out.println("Please Enter a valid time slot.");
                                    }
                                    if (footballTime.isEmpty()){
                                        football.remove(footTimeSlot);
                                    }

                                }else {
                                    System.out.println("This slot is not available!");
                                }
                            }else {
                                System.out.println("Please Enter the slot no between 1 to 20");
                            }
                    }
                    case 3 ->{
                            System.out.println("Available slots are: ");
                            for (Map.Entry value : boxCricket.entrySet()) {
                                System.out.println("Court- " + value.getKey());
                            }
                            System.out.println("Select which court you want to book..");
                            int boxCourtNo = sc.nextInt();
                            if (boxCourtNo <= 5){
                                if (boxCricket.containsKey(boxCourtNo)){
                                    System.out.println("The Available time slot are");
                                    for (Map.Entry value : boxCricketTime.entrySet()) {
                                        System.out.println("Enter " + value.getKey() + " for Time slot- " + value.getValue());
                                    }
                                    System.out.println("Enter the time slot: ");
                                    int boxTimeSlot = sc.nextInt();
                                    if (boxCricketTime.containsKey(boxTimeSlot)) {
                                        System.out.println("Your slot is allocated.");
                                        bcNameList.add(pName);
                                        System.out.println("Name: "+ pName);
                                        System.out.println("Court No: "+ boxCourtNo);
                                        System.out.println("Time slot: "+boxCricketTime.get(boxTimeSlot));
                                        boxCricketTime.remove(boxTimeSlot);
                                    } else {
                                        System.out.println("Please Enter a valid time slot.");
                                    }
                                    if (boxCricketTime.isEmpty()){
                                        boxCricket.remove(boxCourtNo);
                                    }
                                }else {
                                    System.out.println("This slot is not available!");
                                }
                            }else {
                                System.out.println("Please Enter the slot no between 1 to 20");
                            }
                    }
                    default -> System.out.println("Please enter valid Number: 1 or 2 or 3");

                }


            } catch (Exception e) {
                System.out.println("Please Select a valid option...");
            }

            System.out.println("Enter y for continue, and any key for direct exit: ");
            sc.nextLine();
            ch = sc.next().trim().charAt(0);

        } while (ch == 'y');




    }
    @Override
    public void run() {
        chooseCourt();
        super.run();
    }
}
