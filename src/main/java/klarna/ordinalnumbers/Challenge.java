package klarna.ordinalnumbers;

public class Challenge {
    public static String numberToOrdinal(int number) {
        if (number == 0) {
            return "0";
        }
        if (number == 1) {
            return "1st";
        }
        if (number == 2) {
            return "2nd";
        }
        if (number == 3) {
            return "3rd";
        }
        return "4th";
    }
}
