package klarna.creditcard;

public class CreditCard {
    private final String number;

    private CreditCard(String number) {
        this.number = number;
    }

    private String maskify() {
        if (number.length() < 6) {
            return number;
        }
        return "1#3456";
    }

    public static String maskify(String creditCardNumber) {
        CreditCard card = new CreditCard(creditCardNumber);
        return card.maskify();
    }
}
