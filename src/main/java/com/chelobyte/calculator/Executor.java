package com.chelobyte.calculator;

import com.chelobyte.calculator.input.InputValues;
import com.chelobyte.calculator.operation.Operation;
import com.chelobyte.calculator.operation.Result;
import com.chelobyte.config.CalculatorConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Executor {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CalculatorConfiguration.class);

        InputValues inputValues = context.getBean("inputValues", InputValues.class);
        Operation operation;

        inputValues.takeFirstNumber();
        inputValues.takeOperator();

        if (!inputValues.getOperator().equals("v")) {
            inputValues.takeSecondNumber();

            operation = context.getBean("normalOperation", Operation.class);
        } else {
            operation = context.getBean("rootOperation", Operation.class);
        }

        inputValues.closeScanner();

        Result.printResult(operation.operate());

        context.close();

    }

}
