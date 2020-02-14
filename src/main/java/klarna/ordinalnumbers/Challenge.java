package klarna.ordinalnumbers;

public class Challenge {
    public static String numberToOrdinal(int number) {
        if (number == 0) {
            return "0";
        }
        if (number == 1) {
            String suffix = "st";
            return "1" + suffix;
        }
        if (number == 2) {
            String suffix = "nd";
            return "2" + suffix;
        }
        if (number == 3) {
            String suffix = "rd";
            return "3" + suffix;
        }
        if (number == 21) {
            String suffix = "st";
            return "21" + suffix;
        }
        if (number == 31) {
            String suffix = "st";
            return "31" + suffix;
        }
        if (number == 22) {
            String suffix = "nd";
            return "22" + suffix;
        }
        String suffix = "th";
        return number + suffix;
    }
}
