package com.example.spe_calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpeCalcApplicationTests {
        @Test
        public void testAddition() {
            double result = SpeCalcApplication.addition(5, 3);
            Assertions.assertEquals(8, result);
        }

        @Test
        public void testAdd() {
            double result = SpeCalcApplication.addition(10, 20);
            Assertions.assertEquals(30, result);
        }

        @Test
        public void testSubtraction() {
            double result = SpeCalcApplication.subtraction(5, 3);
            Assertions.assertEquals(2, result);
        }

        @Test
        public void testMultiplication() {
            double result = SpeCalcApplication.multiplication(5, 3);
            Assertions.assertEquals(15, result);
        }

        @Test
        public void testDivision() {
            double result = SpeCalcApplication.division(10, 2);
            Assertions.assertEquals(5, result);
        }

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
        public void testFactorial() {
            double result = SpeCalcApplication.factorial(5); // Factorial of 5 is 120
            Assertions.assertEquals(120, result);
        }

        @Test
        public void testFactorialOfZero() {
            double result = SpeCalcApplication.factorial(0); // Factorial of 0 is 1
            Assertions.assertEquals(1, result);
        }


        @Test
        public void testAdditionNegativeNumbers() {
            double result = SpeCalcApplication.addition(-5, -3);
            Assertions.assertEquals(-8, result);
        }

        @Test
        public void testAdditionZero() {
            double result = SpeCalcApplication.addition(0, 0);
            Assertions.assertEquals(0, result);
        }

        @Test
        public void testAdditionLargeNumbers() {
            double result = SpeCalcApplication.addition(1000000, 2000000);
            Assertions.assertEquals(3000000, result);
        }

        @Test
        public void testSubtractionNegativeResult() {
            double result = SpeCalcApplication.subtraction(3, 5);
            Assertions.assertEquals(-2, result);
        }

        @Test
        public void testSubtractionZero() {
            double result = SpeCalcApplication.subtraction(0, 0);
            Assertions.assertEquals(0, result);
        }

        @Test
        public void testSubtractionLargeNumbers() {
            double result = SpeCalcApplication.subtraction(2000000, 1000000);
            Assertions.assertEquals(1000000, result);
        }

        @Test
        public void testMultiplicationNegativeNumbers() {
            double result = SpeCalcApplication.multiplication(-5, -3);
            Assertions.assertEquals(15, result);
        }

        @Test
        public void testMultiplicationByZero() {
            double result = SpeCalcApplication.multiplication(5, 0);
            Assertions.assertEquals(0, result);
        }

        @Test
        public void testMultiplicationLargeNumbers() {
            double result = SpeCalcApplication.multiplication(10000, 20000);
            Assertions.assertEquals(200000000, result);
        }

        @Test
        public void testDivisionFractionalResult() {
            double result = SpeCalcApplication.division(10, 3);
            Assertions.assertEquals(3.3333333333333335, result, 0.00001);
        }

        @Test
        public void testDivisionFractionalResultRounded() {
            double result = SpeCalcApplication.division(1, 3);
            Assertions.assertEquals(0.3333333333333333, result, 0.00001);
        }

        @Test
        public void testDivisionLargeNumbers() {
            double result = SpeCalcApplication.division(1000000, 500000);
            Assertions.assertEquals(2, result);
        }
}

