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

    public Operation (double firstNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = 0;
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

    private double raiseToPower() {
        return Math.pow(this.firstNumber, this.secondNumber);
    }

    private double extractRoot() {
        return Math.sqrt(this.firstNumber);
    }

    public double operate() {

        return switch (this.operator) {
            case "+" -> add();
            case "-" -> subtract();
            case "*" -> multiply();
            case "/" -> divide();
            case "**" -> raiseToPower();
            case "v" -> extractRoot();
            default -> throw new IllegalStateException("Whoops! Something went wrong with the operations.");
        };

    }

}
