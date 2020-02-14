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
        } else if (endsWith("1", number)) {
            return "st";
        } else if (endsWith("2", number)) {
            return "nd";
        } else if (endsWith("3", number)) {
            return "rd";
        } else {
            return "th";
        }
    }

    private static boolean endsWith(String suffix, int number) {
        return (String.valueOf(number).endsWith(suffix));
    }
}
