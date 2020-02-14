package klarna.ordinalnumbers;

public class Challenge {
    public static String numberToOrdinal(int number) {
        if (number == 0) {
            return "0";
        }
        return number + suffixFor(number);
    }

    private static String suffixFor(int number) {
        if (number == 11 || number == 12 || number == 13) {
            return "th";
        }
        if (onesPlaceValueOf(number) == 1) {
            return "st";
        } else if (onesPlaceValueOf(number) == 2) {
            return "nd";
        } else if (onesPlaceValueOf(number) == 3) {
            return "rd";
        } else {
            return "th";
        }
    }

    private static int onesPlaceValueOf(int number) {
        return number % 10;
    }
}
