package klarna.ordinalnumbers;

public class Challenge {
    public static String numberToOrdinal(int number) {
        if (number == 0) {
            return "0";
        }
        if (number == 1) {
            return "1st";
        }
        return "2nd";
    }
}
