package klarna.ordinalnumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrdinalNumbersTest {

    @Test
    public void doesNotConvertZero() {
        assertEquals("0", Challenge.numberToOrdinal(0));
    }

}
