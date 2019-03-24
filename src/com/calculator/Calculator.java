package com.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean menu = true;
        int choice;

        while (menu) {
            menuCalculator();
            System.out.println();
            do {
                System.out.println("Select operation: ");
                choice = -1;
                if (!sc.hasNextInt()) {
                    System.out.println("Please enter valid number from 1 do 5");
                } else {
                    choice = sc.nextInt();
                    if (choice < 1 || choice > 5) {
                        System.out.println(choice + " is not valid option.");
                    }
                }
                sc.nextLine();
            } while (choice < 1 || choice > 5);

            switch (choice) {
                case 1:
                    try {
                        division();
                    } catch (InputMismatchException e) {
                        System.err.println("Wrong input. Please enter valid value(s).");
                    }
                    break;
                case 2:
                    try {
                        multiplication();
                    } catch (InputMismatchException e) {
                        System.err.println("Wrong input. Please enter valid value(s).");
                    }
                    break;
                case 3:
                    try {
                        sum();
                    } catch (InputMismatchException e) {
                        System.err.println("Wrong input. Please enter valid value(s).");
                    }
                    break;
                case 4:
                    try {
                        substraction();
                    } catch (InputMismatchException e) {
                        System.err.println("Wrong input. Please enter valid value(s).");
                    }
                case 5:
                    System.out.println("Shutting down calculator");
                    menu = false;
                    break;
            }
        }
    }

    public static void menuCalculator() {
        System.out.println("Press: \n 1. to divide \n 2. to multiplicate \n 3. to sum \n 4. to substract \n 5. to quit");
    }

    public static void multiplication() {
        Multiplication multiplication = new Multiplication();
        double firstNo;
        double secondNo;

        System.out.println("Enter first number:");
        firstNo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter second number:");
        secondNo = sc.nextDouble();
        sc.nextLine();
        multiplication.result(firstNo, secondNo);
    }

    public static void division() {
        Division division = new Division();
        double firstNo;
        double secondNo;

        System.out.println("Enter first number:");
        firstNo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter second number:");
        secondNo = sc.nextDouble();
        sc.nextLine();
        division.result(firstNo, secondNo);
    }

    public static void sum() {
        Sum sum = new Sum();
        double firstNo;
        double secondNo;

        System.out.println("Enter first number:");
        firstNo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter second number:");
        secondNo = sc.nextDouble();
        sc.nextLine();
        sum.result(firstNo, secondNo);
    }

    public static void substraction() {
        Substraction substraction = new Substraction();
        double firstNo;
        double secondNo;

        System.out.println("Enter first number:");
        firstNo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter second number:");
        secondNo = sc.nextDouble();
        sc.nextLine();
        substraction.result(firstNo, secondNo);
    }
}
