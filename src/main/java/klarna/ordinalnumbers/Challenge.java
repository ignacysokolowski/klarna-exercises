package klarna.ordinalnumbers;

public class Challenge {
    public static String numberToOrdinal(int number) {
        if (number == 0) {
            return "0";
        }
        return number + suffixFor(number);
    }

    private static String suffixFor(int number) {
        String suffix = onesPlaceValueBasedSuffixFor(number);
        if (suffix == null) {
            return "th";
        }
        return suffix;
    }

    private static String onesPlaceValueBasedSuffixFor(int number) {
        if (number == 11 || number == 12 || number == 13) {
            return null;
        }
        switch (onesPlaceValueOf(number)) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return null;
        }
    }

    private static int onesPlaceValueOf(int number) {
        return number % 10;
    }
}
