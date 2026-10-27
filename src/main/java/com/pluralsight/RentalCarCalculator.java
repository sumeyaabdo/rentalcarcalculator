package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the date:");
        String pickupDate = scanner.nextLine();

        System.out.println("Enter the day of rental");
        int numberOfDays = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Do you want an electronic tool tag at $3.95/day (yes/no)");
        String electronicToll = scanner.nextLine();

        System.out.println("Do you want Gps at $2.95/day (yes/no)");
        String gps = scanner.nextLine();

        System.out.println("DO you want roadside assistance at $3.95/day (yes/no)");
        String roadSide = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        double basicRental = 29.99 * numberOfDays;
        if (age < 25){

            basicRental * 0.30;
        }


        System.out.println("The basic car rental is" + basicRental + " per day. There is a 30% surcharge on the basic car rental\n" +
                "for drivers under 25. All taxes have already been incorporated into the fees shown");



    }

}
