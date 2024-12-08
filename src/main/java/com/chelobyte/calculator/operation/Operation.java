package com.chelobyte.calculator.operation;

public class Operation {

    private final double firstNumber;
    private final double secondNumber;
    private final String operator;

    public Operation(double firstNumber, double secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    private double add() {
        return this.firstNumber + this.secondNumber;
    }

    private double subtract() {
        return this.firstNumber - this.secondNumber;
    }

    private double multiply() {
        return firstNumber * secondNumber;
    }

    private double divide() {
        if (this.secondNumber == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }

        return this.firstNumber / this.secondNumber;
    }

    public double operate() {

        return switch (this.operator) {
            case "+" -> add();
            case "-" -> subtract();
            case "*" -> multiply();
            case "/" -> divide();
            default -> throw new IllegalStateException("Whoops! Something went wrong with the operations.");
        };

    }

}
