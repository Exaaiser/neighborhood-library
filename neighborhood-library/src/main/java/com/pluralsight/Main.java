package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Screen screen = new Screen();


        while (true) {
            System.out.println(" Home Screen ");
            System.out.println("1. Show Available Books");
            System.out.println("2. Check Out a Book");
            System.out.println("3. Check In a Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                screen.showAvailableBooks();
            } else if (choice == 2) {
                screen.promptCheckOut();
            } else if (choice == 3) {
                screen.promptCheckIn();
            } else if (choice == 4) {
                System.out.println("Exiting the application...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}