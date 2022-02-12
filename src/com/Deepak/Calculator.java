package com.Deepak;

import com.Deepak.utilities.Constants;

public class Calculator {

    public static Calculator calculator = null;

    public static synchronized Calculator getCalculator() {
        if (calculator == null) {
            calculator = new Calculator();
        }
        return calculator;

    }

    public void calculate(double num1, double num2, int operation) {
        switch (operation) {
            case Constants.KEY_ADDITION:
                System.out.println("The sum is : " + (num1 + num2));
                break;
            case Constants.KEY_SUBTRACTION:
                System.out.println("The difference is : " + (num1 - num2));
                break;
            case Constants.KEY_MULTIPLICATION:
                System.out.println("The product is : " + (num1 * num2));
                break;
            case Constants.KEY_DIVISION:
                System.out.println("The quotient is : " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }

}
