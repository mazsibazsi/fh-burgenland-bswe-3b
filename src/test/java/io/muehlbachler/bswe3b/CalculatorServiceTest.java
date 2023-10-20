package io.muehlbachler.bswe3b;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private CalculatorService calc = new CalculatorService();

    @Test
    public void testDividePositiveNumberNoRemainder() {
        assertEquals(1, calc.divide(1, 1), "1/1 should be 1");
    }

    @Test
    public void divideTest() {
        java.util.Random rand = new java.util.Random();

        int a = rand.nextInt(99) + 1;
        int b = rand.nextInt(99) + 1;

        assertEquals((a/b), calc.divide(a, b), String.format("Division failed with %d and %d", a, b));
    }

    @Test
    public void divideByZeroTest() {
        assertEquals(0, calc.divide(1, 0), "Division by zero should return zero.");
    }
}
