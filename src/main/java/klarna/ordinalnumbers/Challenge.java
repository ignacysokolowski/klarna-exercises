package klarna.ordinalnumbers;

public class Challenge {
    public static String numberToOrdinal(int number) {
        if (number == 0) {
            return "0";
        }
        String suffix;
        if (number == 1) {
            suffix = "st";
            return number + suffix;
        }
        if (number == 2) {
            suffix = "nd";
            return number + suffix;
        }
        if (number == 3) {
            suffix = "rd";
            return number + suffix;
        }
        if (number == 21) {
            suffix = "st";
            return number + suffix;
        }
        if (number == 31) {
            suffix = "st";
            return number + suffix;
        }
        if (number == 22) {
            suffix = "nd";
            return number + suffix;
        } else {
            suffix = "th";
            return number + suffix;
        }
    }
}
