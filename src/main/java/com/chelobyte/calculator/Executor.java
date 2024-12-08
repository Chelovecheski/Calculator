package com.chelobyte.calculator;

import com.chelobyte.calculator.input.InputValues;
import com.chelobyte.calculator.operation.Operation;
import com.chelobyte.calculator.operation.Result;

public class Executor {

    public static void main(String[] args) {

        InputValues inputValues = new InputValues();
        Operation operation;

        inputValues.takeFirstNumber();
        inputValues.takeOperator();

        if (!inputValues.getOperator().equals("v")) {
            inputValues.takeSecondNumber();

            operation = new Operation(
                    inputValues.getFirstNumber(),
                    inputValues.getSecondNumber(),
                    inputValues.getOperator()
            );
        } else {
            operation = new Operation(
                    inputValues.getFirstNumber(),
                    inputValues.getOperator()
            );
        }

        inputValues.closeScanner();

        Result.printResult(operation.operate());

    }

}
