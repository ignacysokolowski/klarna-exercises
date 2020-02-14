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

    @Test
    public void acceptanceTests() {
        assertEquals("4###########5616", CreditCard.maskify("4556364607935616"));
        assertEquals("4###-####-####-5616", CreditCard.maskify("4556-3646-0793-5616"));
        assertEquals("6######5616", CreditCard.maskify("64607935616"));
        assertEquals("ABCD-EFGH-IJKLM-NOPQ", CreditCard.maskify("ABCD-EFGH-IJKLM-NOPQ"));
        assertEquals("A#######BCDEFG89HI", CreditCard.maskify("A1234567BCDEFG89HI"));
        assertEquals("12345", CreditCard.maskify("12345"));
        assertEquals("", CreditCard.maskify(""));
        assertEquals("Skippy", CreditCard.maskify("Skippy"));
    }
}
