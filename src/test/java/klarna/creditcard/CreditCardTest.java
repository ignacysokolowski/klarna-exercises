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
}
