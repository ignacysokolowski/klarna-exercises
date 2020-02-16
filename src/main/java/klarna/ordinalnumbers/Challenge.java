package klarna.ordinalnumbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Challenge {

    public static String numberToOrdinal(int number) {
        return new OrdinalNumeral(number).toString();
    }

    private static class OrdinalNumeral {
        private static Map<Integer, String> onesIndicators = new HashMap<Integer, String>() {{
            put(1, "st");
            put(2, "nd");
            put(3, "rd");
        }};
        private List<Integer> tensWithDefaultIndicator = Arrays.asList(11, 12, 13);

        private final int number;

        OrdinalNumeral(int number) {
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
            if (isExceptionToOnesRule(tensDigit())) {
                return null;
            }
            return onesIndicators.get(onesDigit());
        }

        private boolean isExceptionToOnesRule(int tensDigit) {
            return tensWithDefaultIndicator.contains(tensDigit);
        }

        private int onesDigit() {
            return number % 10;
        }

        private int tensDigit() {
            return number % 100;
        }
    }
}
