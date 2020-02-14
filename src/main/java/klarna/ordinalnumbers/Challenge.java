package klarna.ordinalnumbers;

public class Challenge {
    public static String numberToOrdinal(int number) {
        if (number == 0) {
            return "0";
        }
        if (number == 1) {
            String suffix = "st";
            return number + suffix;
        }
        if (number == 2) {
            String suffix = "nd";
            return number + suffix;
        }
        if (number == 3) {
            String suffix = "rd";
            return number + suffix;
        }
        if (number == 21) {
            String suffix = "st";
            return number + suffix;
        }
        if (number == 31) {
            String suffix = "st";
            return number + suffix;
        }
        if (number == 22) {
            String suffix = "nd";
            return number + suffix;
        } else {
            String suffix = "th";
            return number + suffix;
        }
    }
}
