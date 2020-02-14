package klarna.ordinalnumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrdinalNumbersTest {

    @Test
    public void convertsOne() {
        assertEquals("1st", Challenge.numberToOrdinal(1));
    }

    @Test
    public void convertsTwo() {
        assertEquals("2nd", Challenge.numberToOrdinal(2));
    }

    @Test
    public void convertsThree() {
        assertEquals("3rd", Challenge.numberToOrdinal(3));
    }

    @Test
    public void doesNotConvertZero() {
        assertEquals("0", Challenge.numberToOrdinal(0));
    }
}
