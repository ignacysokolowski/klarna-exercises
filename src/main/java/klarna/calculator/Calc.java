package klarna.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.DoubleBinaryOperator;

public class Calc {
    public double evaluate(String expression) {
        if (expression.isEmpty()) {
            return 0;
        }
        Stack<Double> numbers = new Stack<>();
        Map<String, DoubleBinaryOperator> operators = new HashMap<String, DoubleBinaryOperator>() {{
            put("+", (a, b) -> a + b);
        }};
        for (String token : expression.split(" ")) {
            switch (token) {
                case "+":
                    numbers.push(resultOf(operators.get("+"), numbers));
                    break;
                case "-":
                    numbers.push(resultOf((a, b) -> a - b, numbers));
                    break;
                case "*":
                    numbers.push(resultOf((a, b) -> a * b, numbers));
                    break;
                case "/":
                    numbers.push(resultOf((a, b) -> a / b, numbers));
                    break;
                default:
                    numbers.push(Double.parseDouble(token));
                    break;
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
