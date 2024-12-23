package com.chelobyte.config;

import com.chelobyte.calculator.input.InputValues;
import com.chelobyte.calculator.operation.Operation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CalculatorConfiguration {

    @Bean
    @Scope("singleton")
    protected InputValues inputValues() {
        return new InputValues();
    }

    @Bean
    @Scope("prototype")
    protected Operation normalOperation() {
        return new Operation(
                inputValues().getFirstNumber(),
                inputValues().getSecondNumber(),
                inputValues().getOperator()
        );
    }

    @Bean
    @Scope("prototype")
    protected Operation rootOperation() {
        return new Operation(
                inputValues().getFirstNumber(),
                inputValues().getOperator()
        );
    }

}
