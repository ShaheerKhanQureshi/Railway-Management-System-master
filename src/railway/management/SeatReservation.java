/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway.management;

import java.util.Date;
import java.util.Scanner;

/**
 *
 */

public class SeatReservation {

    Scanner s = new Scanner(System.in);
    private static int[] seat = new int[10];

    int numofpassengers;

    public void Destination() {

        System.out.println("Enter the name of main head of Passenger : ");
        String nameofmainpassenger = s.nextLine();
        System.out.println("------------------------------");
        System.out.println("Welcome to the Railway");
        System.out.println("Enter the your destination");
        System.out.println("1- Karachi to Lahore");
        System.out.println("2- Karachi to Islamabad");
        System.out.println("3- Karachi to Rawalpindi");
        System.out.println("4- Lahore to Karachi");
        System.out.println("5- Lahore to Islamabad");
        System.out.println("6- Lahore to Rawalpindi");
        System.out.println("7- Islamabad to Lahore");
        System.out.println("8- Islamabad to Karachi");
        System.out.println("9- Islamabad to Rawalpindi");
        System.out.println("------------------------------");
        System.out.println("\n");

        System.out.println("Please enter the number from 1-9 for respective destinations");
        int number = s.nextInt();
        System.out.println("\n");
        System.out.println("----------------------------------");

        System.out.println("enter the number of passengers");
        numofpassengers = s.nextInt();

        switch (number) {
            case 1:
                System.out.println("The ticket cost is " + 1200 + " Rs");
                System.out.println("Total cost of tickets are: " + 1200 * numofpassengers);
                break;
            case 2:
                System.out.println("The ticket cost is " + 1300 + " Rs");
                System.out.println("Total cost of tickets are: " + 1300 * numofpassengers);
                break;
            case 3:
                System.out.println("The ticket cost is " + 1000 + " Rs");
                System.out.println("Total cost of tickets are: " + 1000 * numofpassengers);
                break;
            case 4:
                System.out.println("The ticket cost is " + 1000 + " Rs");
                System.out.println("Total cost of tickets are: " + 1000 * numofpassengers);
                break;
            case 5:
                System.out.println("The ticket cost is " + 1300 + " Rs");
                System.out.println("Total cost of tickets are: " + 1300 * numofpassengers);
                break;
            case 6:
                System.out.println("The ticket cost is " + 1200 + " Rs");
                System.out.println("Total cost of tickets are: " + 1200 * numofpassengers);
                break;
            case 7:
                System.out.println("The ticket cost is " + 1100 + " Rs");
                System.out.println("Total cost of tickets are: " + 1100 * numofpassengers);
                break;
            case 8:
                System.out.println("The ticket cost is " + 1300 + " Rs");
                System.out.println("Total cost of tickets are: " + 1300 * numofpassengers);
                break;
            default:
                System.out.println("The ticket cost is " + 1300 + " Rs");
                System.out.println("Total cost of tickets are: " + 1300 * numofpassengers);
                break;
        }

        System.out.println("Remember that reservation will be done one by one for every passenger");

        System.out.println("");
    }

    private static int Windowseats() {
        for (int i = 0; i < 5; i++) {
            if (seat[i] == 0) {
                seat[i] = 1;
                return i + 1;
            }
        }

        return -1;
    } // This function checks to see if aisle seats were available, -1 if full.

    private static int nonwindowseats() {
        for (int i = 5; i < 10; i++) {

            if (seat[i] == 0) {
                seat[i] = 1;
                return i + 1;
            }
        }
        return -1;
    }

// This simply prints out a nice little boarding pass message with their seat number and date of issue.
    private static void Pass(int seatnumber) {

        Date timenow = new Date();

        System.out.println();

        System.out.println("Date: " + timenow.toString());

        System.out.println("You have been reserved the seat number: " + seatnumber);

        System.out.println("The ticket is not refundable.");

        System.out.println("Please enjoy the ride.");

        System.out.println();

    }

    public void Seat() {

        System.out.println();

        // Lets start by setting all seats equal to 0
        for (int i = 0; i < 10; i++) {

            seat[i] = 0;

        }

        int choice = 1;

        // Ask user for a window or a non window seat and store their coice.
        System.out.print("Please enter 1 for window, 2 for non window, or 0 to exit: ");

        choice = s.nextInt();
        // While their choice is not the one for exit, execute our booking.

        while (choice != 0) {

            int seatnumber = 0;
            // If they chose a window seat, attempt to book it.
            if (choice == 1) {
                seatnumber = Windowseats();
                // No window seats available, try booking a non window seat for them instead.
                if (seatnumber == -1) {
                    seatnumber = nonwindowseats();
                    if (seatnumber != -1) {
                        System.out.println("Window seats are reserved, non window seats are vacant");
                        Pass(seatnumber);
                    }
                } else {
                    // Booking a window seat was successful.
                    System.out.println("\nyou have reserved the window seat");
                    Pass(seatnumber);
                }

            } else if (choice == 2) {

                // If they chose booking a nonwindow, check to see if it is available.
                seatnumber = nonwindowseats();
                // If not available, see if we have window seats available.
                if (seatnumber == -1) {
                    seatnumber = Windowseats();

                    if (seatnumber != -1) {

                        System.out.println("All non windows seats are reserved. You can book Window seats");

                        Pass(seatnumber);

                    }

                } else {

                    // Booking a non window seat was successful.
                    System.out.println("your non window seat has been reserved");

                    Pass(seatnumber);

                }

            } else {

                // Print an error message if they did not choose 1, 2, or 0 for their choice.
                System.out.println("Please enter 1 or 2, Try again!!!");

                choice = 0;

            }

            // No window or non window seats are available. 
            if (seatnumber == -1) {

                System.out.println("Booking procedure closed");
                System.out.println("You have to wait in the waiting area, press 0 and then 4.");
                System.out.println();

            }

            // Selection for a choice
            System.out.print("Please enter 1 for window, 2 for non window, or 0 to exit: ");
            System.out.println();
            choice = s.nextInt();
        }
    }

}
