package klarna.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculateTests {
    private Calc calculator = new Calc();

    @Test
    public void emptyExpressionEvaluatesToZero() {
        assertEquals(0, calculator.evaluate(""), 0);
    }

    @Test
    public void expressionsWithoutOperatorsEvaluateToTheLastNumber() {
        assertEquals(3, calculator.evaluate("3"), 0);
        assertEquals(2, calculator.evaluate("3 2"), 0);
        assertEquals(3, calculator.evaluate("1 2 3"), 0);
    }

    @Test
    public void parsesFloats() {
        assertEquals(3.5, calculator.evaluate("1 2 3.5"), 0);
    }

    @Test
    public void supportsAddition() {
        assertEquals(4, calculator.evaluate("1 3 +"), 0);
        assertEquals(3, calculator.evaluate("1 2 +"), 0);
        assertEquals(5, calculator.evaluate("2 3 +"), 0);
    }

    @Test
    public void supportsSubtraction() {
        assertEquals(-2, calculator.evaluate("1 3 -"), 0);
        assertEquals(-1, calculator.evaluate("1 2 -"), 0);
        assertEquals(1, calculator.evaluate("3 2 -"), 0);
    }

    @Test
    public void supportsMultiplication() {
        assertEquals(3, calculator.evaluate("1 3 *"), 0);
        assertEquals(4, calculator.evaluate("2 2 *"), 0);
        assertEquals(8, calculator.evaluate("2 4 *"), 0);
    }

    @Test
    public void supportsDivision() {
        assertEquals(2, calculator.evaluate("4 2 /"), 0);
        assertEquals(2, calculator.evaluate("6 3 /"), 0);
        assertEquals(3, calculator.evaluate("6 2 /"), 0);
    }

    @Test
    public void combinesOperations() {
        assertEquals(14, calculator.evaluate("5 1 2 + 4 * + 3 -"), 0);
    }
}
