package com.chelobyte.calculator.operation;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OperationTest {

    @Test
    void checkOperatorValueIfValidThenReturnAddedTwo() {

        // given
        Operation operation = new Operation(1, 1, "+");

        // when
        // then
        assertThat(operation.operate(), is(2.0));

    }

    @Test
    void checkOperatorValueIfValidThenReturnSubtractedZero() {

        // given
        Operation operation = new Operation(1, 1, "-");

        // when
        // then
        assertThat(operation.operate(), is(0.0));

    }

    @Test
    void checkOperatorValueIfValidThenReturnMultipliedFour() {

        // given
        Operation operation = new Operation(2, 2, "*");

        // when
        // then
        assertThat(operation.operate(), is(4.0));

    }

    @Test
    void checkOperatorValueIfValidThenReturnDividedTwo() {

        // given
        Operation operation = new Operation(4, 2, "/");

        // when
        // then
        assertThat(operation.operate(), is(2.0));

    }

    @Test
    void checkDividedByZeroThenThrowArithmeticException() {

        // given
        Operation operation = new Operation(1, 0, "/");

        // when
        // then
        assertThrows(ArithmeticException.class, operation::operate);

    }
}