package com.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean menu = true;
        int choice;
        while (menu) {
            System.out.println("Select operation: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    homemadeCalculator();
                    break;
                case 2:
                    division();
                    break;
                case 5:
                    System.out.println("Shutting down calculator");
                    menu = false;
                    break;
            }
        }
    }

    public static void homemadeCalculator(){

        System.out.println("Press to go: \n 1. to divide \n 2. to multiplicate \n 3. to sum \n 4. to substract \n 5. to quit");
    }

    public static void division() {
        int firstNo;
        int secondNo;
        boolean repeat = true;

        do {
            System.out.println("Enter first number:");
            firstNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter second number:");
            secondNo = sc.nextInt();
            sc.nextLine();
            try {
                System.out.println(firstNo + " / " + secondNo + " = " + firstNo / secondNo);
            } catch (ArithmeticException ae){
                System.out.println("Cannot divide by 0");
            } catch (InputMismatchException ie){
                System.out.println("Wrong input");
            }
        } while (repeat);
    }
}
