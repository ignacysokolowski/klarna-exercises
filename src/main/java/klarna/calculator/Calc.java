package klarna.calculator;

public class Calc {
    public double evaluate(String expression) {
        if (expression.isEmpty()) {
            return 0;
        }
        double result = 0.0;
        for (String token : expression.split(" ")) {
            result = Double.parseDouble(token);
        }
        return result;
    }
}
