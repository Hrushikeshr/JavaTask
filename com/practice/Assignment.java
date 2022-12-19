package com.practice;

public class Assignment {

    public String [] slots = new String[30];

    public int noOfBikes;
    public int noOfCars;

    public void bikes(int noOfBikes) {

        this.noOfBikes = noOfBikes;

        System.out.println("For Bike Parking(BASMENT-1):  Total slots are: " + slots.length);
        for(int i = 0; i < slots.length; i++) {

            System.out.print("slot-" + (i + 1) + "   ");

        }

        System.out.println("\nOccupied slots By(BIKES, BASEMENT-1: ");
        for(int i = 0; i < noOfBikes; i++) {

            slots[i] = "Occupied !";

            System.out.println("slot-" + (i + 1) + " : " + slots[i] + "Bike - " + (i + 1));


        }
        System.out.println("For Bike Parking(BASMENT-1):  Avialable slots are: " +  slots.length);
        for(int i  = noOfBikes; i < slots.length; i++) {

            System.out.print("slot-" + (i + 1) + "   ");

        }


    }



    public void cars(int noOfcars) {

        this.noOfCars = noOfCars;

        System.out.println("For Car Parking(BASMENT-1):  Total slots are: " + slots.length);

    }


    public void vechileDetails() {

//        WriteFiles wf = new WriteFiles();
//
//        wf.WroteInFile("wrote");
        // wf.WroteInFile("BASEMENT - 1, " + noOfBikes +"- Bikes, Occupied slot,"
        //        + "" + noOfCars + "- cars, Occupied slot");
    }



}
