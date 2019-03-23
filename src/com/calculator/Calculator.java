package com.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean menu = true;
        int choice;
        while (menu) {
            homemadeCalculator();
            System.out.println();
            System.out.println("Select operation: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    division();
                    break;
                case 5:
                    System.out.println("Shutting down calculator");
                    menu = false;
                    break;
            }
        }
    }

    public static void homemadeCalculator() {

        System.out.println("Press to go: \n 1. to divide \n 2. to multiplicate \n 3. to sum \n 4. to substract \n 5. to quit");
    }

    public static void division() {
        double firstNo;
        double secondNo;
        double result;

        try {
            System.out.println("Enter first number:");
            firstNo = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter second number:");
            secondNo = sc.nextDouble();
            sc.nextLine();
            result = firstNo / secondNo;
            if (secondNo == 0) {
                System.out.println("Cannot divide by 0");
            } else {
                System.out.println(firstNo + " / " + secondNo + " = " + result);
            }
        } catch (InputMismatchException ie) {
            System.out.println("Wrong input");
        }
    }
}
