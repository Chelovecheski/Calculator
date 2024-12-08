package com.chelobyte.calculator.operation;

public class Operation {

    private final int firstNumber;
    private final int secondNumber;
    private final String operator;

    public Operation(int firstNumber, int secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    private int add() {
        return this.firstNumber + this.secondNumber;
    }

    private int subtract() {
        return this.firstNumber - this.secondNumber;
    }

    private int multiply() {
        return firstNumber * secondNumber;
    }

    private int divide() {
        if (this.secondNumber == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }

        return this.firstNumber / this.secondNumber;
    }

    public int operate() {

        return switch (this.operator) {
            case "+" -> add();
            case "-" -> subtract();
            case "*" -> multiply();
            case "/" -> divide();
            default -> throw new IllegalStateException("Whoops! Something went wrong with the operations.");
        };

    }

}
