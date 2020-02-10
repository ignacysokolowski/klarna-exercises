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
        return firstCharacter() + maskDigits(charactersToMask()) + lastUnmaskedCharacters();
    }

    private String firstCharacter() {
        return number.substring(0, 1);
    }

    private String lastUnmaskedCharacters() {
        return number.substring(number.length() - 4);
    }

    private String maskDigits(String text) {
        return text.replaceAll(".", "#");
    }

    private String charactersToMask() {
        return number.substring(1, number.length() - 4);
    }

    public static String maskify(String creditCardNumber) {
        CreditCard card = new CreditCard(creditCardNumber);
        return card.maskify();
    }
}
