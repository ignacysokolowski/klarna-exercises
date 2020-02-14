package klarna.ordinalnumbers;

public class Challenge {
    public static String numberToOrdinal(int number) {
        if (number == 0) {
            return "0";
        }
        String suffix;
        if (number == 11) {
            suffix = "th";
        } else if (endsWithOne(number)) {
            suffix = "st";
        } else if (number == 2 || number == 22) {
            suffix = "nd";
        } else if (number == 3) {
            suffix = "rd";
        } else {
            suffix = "th";
        }
        return number + suffix;
    }

    private static boolean endsWithOne(int number) {
        return (String.valueOf(number).endsWith("1"));
    }
}
