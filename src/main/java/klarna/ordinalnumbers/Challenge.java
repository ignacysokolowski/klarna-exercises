package klarna.ordinalnumbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Challenge {

    public static String numberToOrdinal(int number) {
        return new OrdinalNumber(number).toString();
    }

    private static class OrdinalNumber {
        private static Map<Integer, String> onesIndicators = new HashMap<Integer, String>() {{
            put(1, "st");
            put(2, "nd");
            put(3, "rd");
        }};

        private final int number;

        OrdinalNumber(int number) {
            this.number = number;
        }

        public String toString() {
            if (number == 0) {
                return "0";
            }
            return number + indicator();
        }

        private String indicator() {
            return Optional.ofNullable(onesBasedIndicator()).orElse("th");
        }

        private String onesBasedIndicator() {
            if (isExceptionToTheOnesRule()) {
                return null;
            }
            return onesIndicators.get(onesDigit());
        }

        private boolean isExceptionToTheOnesRule() {
            return Arrays.asList(11, 12, 13).contains(number % 100);
        }

        private int onesDigit() {
            return number % 10;
        }

    }
}
