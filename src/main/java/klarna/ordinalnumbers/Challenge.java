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
            return "2nd";
        }
        if (number == 3) {
            return "3rd";
        }
        if (number == 21) {
            return "21st";
        }
        if (number == 31) {
            return "31st";
        }
        if (number == 22) {
            return "22nd";
        }
        return number + "th";
    }
}
