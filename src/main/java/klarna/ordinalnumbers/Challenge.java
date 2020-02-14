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
        } else if (hasOnesPlaceValue(1, number)) {
            return "st";
        } else if (hasOnesPlaceValue(2, number)) {
            return "nd";
        } else if (hasOnesPlaceValue(3, number)) {
            return "rd";
        } else {
            return "th";
        }
    }

    private static boolean hasOnesPlaceValue(int value, int number) {
        return number % 10 == value;
    }
}
