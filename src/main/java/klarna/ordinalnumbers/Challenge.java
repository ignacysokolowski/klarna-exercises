package klarna.ordinalnumbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Challenge {

    public static String numberToOrdinal(int number) {
        return new OrdinalNumeral(number).toString();
    }

    private static class OrdinalNumeral {
        private static Map<Integer, String> suffixes = new HashMap<Integer, String>() {{
            put(1, "st");
            put(2, "nd");
            put(3, "rd");
        }};

        private final int number;

        OrdinalNumeral(int number) {
            this.number = number;
        }

        public String toString() {
            if (number == 0) {
                return "0";
            }
            return number + suffix();
        }

        private String suffix() {
            return Optional.ofNullable(onesBasedSuffix()).orElse("th");
        }

        private String onesBasedSuffix() {
            if (isExceptionToOnesRule(tensDigit())) {
                return null;
            }
            return suffixes.get(onesDigit());
        }

        private boolean isExceptionToOnesRule(int tensDigit) {
            return Arrays.asList(11, 12, 13).contains(tensDigit);
        }

        private int onesDigit() {
            return number % 10;
        }

        private int tensDigit() {
            return number % 100;
        }
    }
}
