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
}
