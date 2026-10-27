package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       // Asking for the date
        System.out.println("Enter the date:");
        String pickupDate = scanner.nextLine();

        //Asking for Day of Rental
        System.out.println("Enter the day of rental");
        int numberOfDays = scanner.nextInt();

        scanner.nextLine();

        // Asking if they need electronic tool tag for 3.95 per day
        System.out.println("Do you want an electronic tool tag at $3.95/day (yes/no)");
        String electronicToll = scanner.nextLine();

        // Asking for Gps for 2.95 per day
        System.out.println("Do you want Gps at $2.95/day (yes/no)");
        String gps = scanner.nextLine();


        // Asking for roadside assistance for 3.95
        System.out.println("Do you want roadside assistance at $3.95/day (yes/no)");
        String roadSide = scanner.nextLine();

        // Asking for age to calculate the total
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        double basicRental = 29.99 * numberOfDays;

        double underageSurcharge = 0;
        if (age < 25){
            underageSurcharge = basicRental * 0.30;
        }
        double electronicPrice = 0;
        if (electronicToll.equalsIgnoreCase("yes")){
            electronicPrice = 3.95 * numberOfDays;
        }
        double gpsPrice = 0;
        if (gps.equalsIgnoreCase("yes")){
            gpsPrice = 2.95 * numberOfDays;
        }
        double roadSidePrice = 0;
        if (roadSide.equalsIgnoreCase("yes")){
            roadSidePrice = 3.95 * numberOfDays;
        }
        double optionsCost = electronicPrice + gpsPrice + roadSidePrice;
        double totalCost = optionsCost + basicRental + underageSurcharge;

        System.out.printf("Basic Rental: " + basicRental);
        System.out.printf("OptionsCost: " + optionsCost);
        System.out.printf("UnderageSurcharge: " + underageSurcharge);
        System.out.printf("Total Cost:" + totalCost);
    }

}
