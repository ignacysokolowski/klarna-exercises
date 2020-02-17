package klarna.calculator;

import java.util.Stack;
import java.util.function.DoubleBinaryOperator;

public class Calc {
    public double evaluate(String expression) {
        if (expression.isEmpty()) {
            return 0;
        }
        Stack<Double> numbers = new Stack<>();
        for (String token : expression.split(" ")) {
            if (token.equals("+")) {
                numbers.push(resultOf((a, b) -> a + b, numbers));
            } else if (token.equals("-")) {
                numbers.push(resultOf((a, b) -> a - b, numbers));
            } else if (token.equals("*")) {
                numbers.push(resultOf((a, b) -> a * b, numbers));
            } else if (token.equals("/")) {
                numbers.push(resultOf((a, b) -> a / b, numbers));
            } else {
                numbers.push(Double.parseDouble(token));
            }
        }
        return numbers.pop();
    }

    private double resultOf(DoubleBinaryOperator operator, Stack<Double> numbers) {
        double operand2 = numbers.pop();
        double operand1 = numbers.pop();
        return operator.applyAsDouble(operand1, operand2);
    }
}
