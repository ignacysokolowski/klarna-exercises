package klarna.ordinalnumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrdinalNumbersTest {

    @Test
    public void appendsStToOne() {
        assertEquals("1st", Challenge.numberToOrdinal(1));
    }

    @Test
    public void appendsNdToTwo() {
        assertEquals("2nd", Challenge.numberToOrdinal(2));
    }

    @Test
    public void appendsRdToThree() {
        assertEquals("3rd", Challenge.numberToOrdinal(3));
    }

    @Test
    public void appendsThToNumbersAboveThree() {
        assertEquals("4th", Challenge.numberToOrdinal(4));
        assertEquals("5th", Challenge.numberToOrdinal(5));
        assertEquals("6th", Challenge.numberToOrdinal(6));
        assertEquals("7th", Challenge.numberToOrdinal(7));
        assertEquals("8th", Challenge.numberToOrdinal(8));
        assertEquals("9th", Challenge.numberToOrdinal(9));
        assertEquals("10th", Challenge.numberToOrdinal(10));
        assertEquals("11th", Challenge.numberToOrdinal(11));
        assertEquals("12th", Challenge.numberToOrdinal(12));
        assertEquals("13th", Challenge.numberToOrdinal(13));
        assertEquals("14th", Challenge.numberToOrdinal(14));
        assertEquals("15th", Challenge.numberToOrdinal(15));
        assertEquals("16th", Challenge.numberToOrdinal(16));
        assertEquals("17th", Challenge.numberToOrdinal(17));
        assertEquals("18th", Challenge.numberToOrdinal(18));
        assertEquals("19th", Challenge.numberToOrdinal(19));
        assertEquals("20th", Challenge.numberToOrdinal(20));
    }

    @Test
    public void appendsStToNumbersEndingWithOne() {
        assertEquals("21st", Challenge.numberToOrdinal(21));
        assertEquals("31st", Challenge.numberToOrdinal(31));
    }

    @Test
    public void appendsNdToNumbersEndingWithTwo() {
        assertEquals("22nd", Challenge.numberToOrdinal(22));
        assertEquals("32nd", Challenge.numberToOrdinal(32));
    }

    @Test
    public void appendsRdToNumbersEndingWithThree() {
        assertEquals("23rd", Challenge.numberToOrdinal(23));
    }

    @Test
    public void doesNotConvertZero() {
        assertEquals("0", Challenge.numberToOrdinal(0));
    }
}
