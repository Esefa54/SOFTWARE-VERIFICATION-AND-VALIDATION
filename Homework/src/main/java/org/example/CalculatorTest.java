//STUDENT NAME : Enes Sefa
//STUDENT ID : B201202026
//COURSE NAME : SOFTWARE VERIFICATION AND VALIDATION
// HOMEWORK 1
// REPOSITORY ADRESS :


package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "20, 2, 10",
            "15, 5, 3",
            "10, 4, 2.5",
            "30, 2.5, 12",
            "45, 2.5, 18"
    })
    void testDivision(double dividend, double divisor, double expectedQuotient) {
        Calculator calculator = new Calculator();
        double result = calculator.divide(dividend, divisor);
        Assertions.assertEquals(expectedQuotient, result);
    }

    @Test
    void testDivisionByZero() {
        Calculator calculator = new Calculator();
        Exception exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(22, 0),
                "IllegalArgumentException expected."
                );
    }
}