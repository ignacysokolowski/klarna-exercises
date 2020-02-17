package klarna.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.DoubleBinaryOperator;

public class Calc {

    private static Map<String, DoubleBinaryOperator> operators = new HashMap<String, DoubleBinaryOperator>() {{
        put("+", (a, b) -> a + b);
        put("-", (a, b) -> a - b);
        put("*", (a, b) -> a * b);
        put("/", (a, b) -> a / b);
    }};

    public double evaluate(String expression) {
        if (expression.isEmpty()) {
            return 0;
        }
        Stack<Double> numbers = new Stack<>();
        for (String token : expression.split(" ")) {
            DoubleBinaryOperator operator = operators.get(token);
            if (operator == null) {
                numbers.push(Double.parseDouble(token));
            } else {
                numbers.push(resultOf(operator, numbers));
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
