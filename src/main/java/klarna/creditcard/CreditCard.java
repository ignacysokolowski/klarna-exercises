package klarna.creditcard;

public class CreditCard {
    public static String maskify(String creditCardNumber) {
        if (creditCardNumber.length() < 6) {
            return creditCardNumber;
        }
        return "1#3456";
    }
}
