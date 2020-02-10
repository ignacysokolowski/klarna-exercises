package klarna.creditcard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    @Test
    public void doesNotMaskEmptyString() {
        assertEquals("", CreditCard.maskify(""));
    }

    @Test
    public void doesNotMaskNumbersShorterThanSix() {
        assertEquals("12345", CreditCard.maskify("12345"));
    }

    @Test
    public void masksAllDigitsExceptForFirstAndLastFourCharacters() {
        assertEquals("1#3456", CreditCard.maskify("123456"));
        assertEquals("2#3456", CreditCard.maskify("223456"));
        assertEquals("1#6789", CreditCard.maskify("126789"));
        assertEquals("1##3456", CreditCard.maskify("1233456"));
    }

    @Test
    public void masksOnlyDigits() {
        assertEquals("1#A#-#3456", CreditCard.maskify("12A3-13456"));
    }
}
