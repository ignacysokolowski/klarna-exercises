package klarna.ordinalnumbers;

public class Challenge {
    public static String numberToOrdinal(int number) {
        if (number == 0) {
            return "0";
        }
        return number + suffixFor(number);
    }

    private static String suffixFor(int number) {
        String suffix;
        if (number == 11 || number == 12 || number == 13) {
            suffix = "th";
        } else if (endsWith("1", number)) {
            suffix = "st";
        } else if (endsWith("2", number)) {
            suffix = "nd";
        } else if (endsWith("3", number)) {
            suffix = "rd";
        } else {
            suffix = "th";
        }
        return suffix;
    }

    private static boolean endsWith(String suffix, int number) {
        return (String.valueOf(number).endsWith(suffix));
    }
}
