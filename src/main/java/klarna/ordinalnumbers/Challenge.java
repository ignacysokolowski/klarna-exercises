package klarna.ordinalnumbers;

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
            if (isExceptionTo123Rule(number)) {
                return null;
            }
            return suffixes.get(onesDigit());
        }

        private boolean isExceptionTo123Rule(int number) {
            return number == 111 || number == 11 || number == 12 || number == 13;
        }

        private int onesDigit() {
            return number % 10;
        }
    }
}
