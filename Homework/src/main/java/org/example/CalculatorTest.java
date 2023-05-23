//STUDENT NAME : Enes Sefa
//STUDENT ID : B201202026
//COURSE NAME : SOFTWARE VERIFICATION AND VALIDATION
// HOMEWORK 1
// REPOSITORY ADRESS :https://github.com/Esefa54/SOFTWARE-VERIFICATION-AND-VALIDATION.git


package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "1903, 1, 1903",
            "90, 6, 15",
            "10, 5, 2",
            "70, 10, 7",
            "45, 5, 9"
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