package com.example.spe_calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpeCalcApplicationTests {


        @Test
        public void testDivisionByZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                SpeCalcApplication.division(10, 0);
            });
        }

        @Test
        public void testNaturalLog() {
            double result = SpeCalcApplication.naturalLog(1); // Natural logarithm of 1 is 0
            Assertions.assertEquals(0, result);
        }

        @Test
        public void testSquareRoot() {
            double result = SpeCalcApplication.squareRoot(25);
            Assertions.assertEquals(5, result);
        }


        @Test
        public void testMultiplicationByZero() {
            double result = SpeCalcApplication.multiplication(5, 0);
            Assertions.assertEquals(0, result);
        }

        @Test
        public void testSquareRootOfPositiveNumber() {
            double result = SpeCalcApplication.squareRoot(16); // Square root of 16 is 4
            Assertions.assertEquals(4, result);
        }

        @Test
        public void testSquareRootOfZero() {
            double result = SpeCalcApplication.squareRoot(0); // Square root of 0 is 0
            Assertions.assertEquals(0, result);
        }

        @Test
        public void testPowerFunction() {
            double result = SpeCalcApplication.power(2, 3); // 2^3 = 8
            Assertions.assertEquals(8, result);
        }

        @Test
        public void testPowerFunctionWithNegativeExponent() {
            double result = SpeCalcApplication.power(2, -3); // 2^(-3) = 1/8
            Assertions.assertEquals(0.125, result);
        }
}

