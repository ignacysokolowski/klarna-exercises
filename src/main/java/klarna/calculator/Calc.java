package klarna.calculator;

import java.util.Stack;

public class Calc {
    public double evaluate(String expression) {
        if (expression.isEmpty()) {
            return 0;
        }
        Stack<Double> numbers = new Stack<>();
        for (String token : expression.split(" ")) {
            numbers.push(Double.parseDouble(token));
        }
        return numbers.pop();
    }
}
