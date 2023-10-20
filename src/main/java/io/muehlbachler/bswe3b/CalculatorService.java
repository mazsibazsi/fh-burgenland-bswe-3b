package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;

// FIXME: add javadoc
@Service
public class CalculatorService {
    // FIXME: add javadoc
    public int divide(final int a, final int b) {
        return b == 0 ? 0 : a/b;
    }
}
