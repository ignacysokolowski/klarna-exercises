package klarna.ordinalnumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Challenge {

    private static Map<Integer, String> suffixes = new HashMap<Integer, String>() {{
        put(1, "st");
        put(2, "nd");
        put(3, "rd");
    }};

    public static String numberToOrdinal(int number) {
        if (number == 0) {
            return "0";
        }
        return number + suffixFor(number);
    }

    private static String suffixFor(int number) {
        return Optional.ofNullable(onesPlaceValueBasedSuffixFor(number)).orElse("th");
    }

    private static String onesPlaceValueBasedSuffixFor(int number) {
        if (number == 11 || number == 12 || number == 13) {
            return null;
        }
        return suffixes.get(onesPlaceValueOf(number));
    }

    private static int onesPlaceValueOf(int number) {
        return number % 10;
    }
}
