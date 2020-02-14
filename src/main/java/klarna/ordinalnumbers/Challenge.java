package klarna.ordinalnumbers;

public class Challenge {
    public static String numberToOrdinal(int number) {
        if (number == 0) {
            return "0";
        }
        String suffix;
        if (number == 11 || number == 12 || number == 13) {
            suffix = "th";
        } else if (endsWith("1", number)) {
            suffix = "st";
        } else if (endsWith("2", number)) {
            suffix = "nd";
        } else if (number == 3) {
            suffix = "rd";
        } else {
            suffix = "th";
        }
        return number + suffix;
    }

    private static boolean endsWith(String suffix, int number) {
        return (String.valueOf(number).endsWith(suffix));
    }
}
