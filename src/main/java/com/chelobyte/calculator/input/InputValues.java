package com.chelobyte.calculator.input;

import java.util.Scanner;

public class InputValues {

    private final Scanner scanner = new Scanner(System.in);

    private int firstNumber = 0;
    private int secondNumber = 1;
    private String operator = "+";

    public void takeFirstNumber() {

        while (true) {
            try {
                System.out.println("Enter the first number: ");
                this.firstNumber = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Please enter a number");
                scanner.nextLine();
            }
        }

    }

    public void takeSecondNumber() {

        while (true) {
            try {
                System.out.println("Enter the second number: ");
                this.secondNumber = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Please enter a number");
                scanner.nextLine();
            }
        }

    }

    public void takeOperator() {

        while (true) {
            System.out.println("Enter the operator: ");
            this.operator = scanner.next();
            scanner.nextLine();

            if (checkOperatorValue(operator)) {
                break;
            } else {
                System.out.println("Please enter a valid operator");
            }

        }

    }

    private boolean checkOperatorValue(String operator) {

        return switch (operator) {
            case "+" -> true;
            case "-" -> true;
            case "*" -> true;
            case "/" -> true;
            case "**" -> true;
            case "v" -> true;
            default -> false;
        };

    }

    public void closeScanner() {
        scanner.close();
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public String getOperator() {
        return operator;
    }
}
