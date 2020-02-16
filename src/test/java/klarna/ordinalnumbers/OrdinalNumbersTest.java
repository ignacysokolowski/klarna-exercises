package klarna.ordinalnumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrdinalNumbersTest {

    @Test
    public void appendsStToNumbersEndingWithOne() {
        assertEquals("1st", Challenge.numberToOrdinal(1));
        assertEquals("21st", Challenge.numberToOrdinal(21));
        assertEquals("31st", Challenge.numberToOrdinal(31));
        assertEquals("101st", Challenge.numberToOrdinal(101));
        assertEquals("221st", Challenge.numberToOrdinal(221));
    }

    @Test
    public void appendsNdToNumbersEndingWithTwo() {
        assertEquals("2nd", Challenge.numberToOrdinal(2));
        assertEquals("22nd", Challenge.numberToOrdinal(22));
        assertEquals("32nd", Challenge.numberToOrdinal(32));
    }

    @Test
    public void appendsRdToNumbersEndingWithThree() {
        assertEquals("3rd", Challenge.numberToOrdinal(3));
        assertEquals("23rd", Challenge.numberToOrdinal(23));
        assertEquals("33rd", Challenge.numberToOrdinal(33));
    }

    @Test
    public void appendsThToNumbersEndingWithEleven() {
        assertEquals("11th", Challenge.numberToOrdinal(11));
        assertEquals("111th", Challenge.numberToOrdinal(111));
        assertEquals("211th", Challenge.numberToOrdinal(211));
        assertEquals("1211th", Challenge.numberToOrdinal(1211));
    }

    @Test
    public void appendsThToNumbersEndingWithTwelve() {
        assertEquals("12th", Challenge.numberToOrdinal(12));
        assertEquals("112th", Challenge.numberToOrdinal(112));
        assertEquals("212th", Challenge.numberToOrdinal(212));
    }

    @Test
    public void appendsThToNumbersEndingWithThirteen() {
        assertEquals("13th", Challenge.numberToOrdinal(13));
        assertEquals("113th", Challenge.numberToOrdinal(113));
        assertEquals("213th", Challenge.numberToOrdinal(213));
    }

    @Test
    public void appendsThToAllOtherNumbers() {
        assertEquals("4th", Challenge.numberToOrdinal(4));
        assertEquals("5th", Challenge.numberToOrdinal(5));
        assertEquals("6th", Challenge.numberToOrdinal(6));
        assertEquals("7th", Challenge.numberToOrdinal(7));
        assertEquals("8th", Challenge.numberToOrdinal(8));
        assertEquals("9th", Challenge.numberToOrdinal(9));
        assertEquals("10th", Challenge.numberToOrdinal(10));

        assertEquals("14th", Challenge.numberToOrdinal(14));
        assertEquals("15th", Challenge.numberToOrdinal(15));
        assertEquals("16th", Challenge.numberToOrdinal(16));
        assertEquals("17th", Challenge.numberToOrdinal(17));
        assertEquals("18th", Challenge.numberToOrdinal(18));
        assertEquals("19th", Challenge.numberToOrdinal(19));
        assertEquals("20th", Challenge.numberToOrdinal(20));
        assertEquals("24th", Challenge.numberToOrdinal(24));
        assertEquals("100th", Challenge.numberToOrdinal(100));
        assertEquals("114th", Challenge.numberToOrdinal(114));
    }

    @Test
    public void doesNotConvertZero() {
        assertEquals("0", Challenge.numberToOrdinal(0));
    }
}
