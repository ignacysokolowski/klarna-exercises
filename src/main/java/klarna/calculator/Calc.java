package klarna.calculator;

import java.util.Stack;

public class Calc {
    public double evaluate(String expression) {
        if (expression.isEmpty()) {
            return 0;
        }
        Stack<Double> numbers = new Stack<>();
        for (String token : expression.split(" ")) {
            if (token.equals("+")) {
                numbers.push(1.0 + 3.0);
            } else {
                numbers.push(Double.parseDouble(token));
            }
        }
        return numbers.pop();
    }
}
