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
        return firstCharacterUnmasked() + maskDigitsIn(charactersToMask()) + lastCharactersUnmasked();
    }

    private String firstCharacterUnmasked() {
        return number.substring(0, 1);
    }

    private String charactersToMask() {
        return number.substring(1, maskEndPosition());
    }

    private String lastCharactersUnmasked() {
        return number.substring(maskEndPosition());
    }

    private int maskEndPosition() {
        return number.length() - 4;
    }

    private String maskDigitsIn(String text) {
        return text.replaceAll("\\d", "#");
    }

    public static String maskify(String creditCardNumber) {
        return new CreditCard(creditCardNumber).maskify();
    }
}
