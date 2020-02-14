package klarna.creditcard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    @Test
    public void masksAllDigitsExceptForFirstAndLastFourCharacters() {
        assertEquals("1##4567", CreditCard.maskify("1234567"));
    }

    @Test
    public void masksOnlyDigits() {
        assertEquals("1#A#-#3456", CreditCard.maskify("12A3-13456"));
    }

    @Test
    public void doesNotMaskNumbersShorterThanSix() {
        assertEquals("12345", CreditCard.maskify("12345"));
    }

    @Test
    public void doesNotMaskEmptyString() {
        assertEquals("", CreditCard.maskify(""));
    }
}
