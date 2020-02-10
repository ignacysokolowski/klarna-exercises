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
        return firstCharacter() + maskDigits() + lastUnmaskedCharacters();
    }

    private String firstCharacter() {
        return "1";
    }

    private String lastUnmaskedCharacters() {
        return "3456";
    }

    private String maskDigits() {
        return "#";
    }

    public static String maskify(String creditCardNumber) {
        CreditCard card = new CreditCard(creditCardNumber);
        return card.maskify();
    }
}
