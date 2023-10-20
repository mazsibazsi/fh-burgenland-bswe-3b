package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;

/**
 * This class provides a service for performing mathematical calculations.
 */
@Service
public class CalculatorService {
    /**
     * Divides two ints.
     *
     * This method takes two integers, a and b, and returns the result.
     * If b is zero, the method returns 0 to avoid division by zero.
     *
     * @param a dividend.
     * @param b divisor.
     * @return The result of 'a' divided by 'b', or 0 if 'b' is zero.
     */
    public int divide(final int a, final int b) {
        return b == 0 ? 0 : a/b;
    }
}
