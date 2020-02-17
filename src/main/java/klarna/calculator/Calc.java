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
                pushOperation(numbers, (operand1, operand2) -> operand1 + operand2);
            } else if (token.equals("-")) {
                double operand2 = numbers.pop();
                double operand1 = numbers.pop();
                numbers.push(operand1 - operand2);
            } else {
                numbers.push(Double.parseDouble(token));
            }
        }
        return numbers.pop();
    }

    public void pushOperation(Stack<Double> numbers, DoubleBinaryOperator operator) {
        double operand2 = numbers.pop();
        double operand1 = numbers.pop();
        numbers.push(operator.applyAsDouble(operand1, operand2));
    }
}
