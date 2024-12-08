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
        inputValues.takeSecondNumber();

        operation = new Operation(
                inputValues.getFirstNumber(),
                inputValues.getSecondNumber(),
                inputValues.getOperator()
        );

        Result.printResult(operation.operate());

    }

}
