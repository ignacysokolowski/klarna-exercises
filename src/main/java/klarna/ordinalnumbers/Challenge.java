package klarna.ordinalnumbers;

public class Challenge {
    public static String numberToOrdinal(int number) {
        if (number == 0) {
            return "0";
        }
        String suffix;
        if (number == 1 || number == 21 || number == 31) {
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
}
