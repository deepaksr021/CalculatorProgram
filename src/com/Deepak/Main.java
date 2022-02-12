
package com.Deepak;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int operator;
        double number1, number2;


        // create an object of Scanner class
        Scanner input = new Scanner(System.in);


        // creating an object of Calculator class
        Calculator calculator = Calculator.getCalculator();


        for (; ; ) {
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println("Choose your option: \n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division\n5 for Exit.");
            System.out.println("---------------------------------------------------------------------------------------------------------");

            operator = input.nextInt();

            if (operator == 1 || operator == 2 || operator == 3 || operator == 4) {
                // ask users to enter numbers
                System.out.print("Enter first number : ");
                number1 = input.nextDouble();

                System.out.print("Enter Second number :");
                number2 = input.nextDouble();
                calculator.calculate(number1, number2, operator);
            } else {

                break;

            }

        }
    }
}