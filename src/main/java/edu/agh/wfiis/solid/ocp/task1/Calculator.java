package edu.agh.wfiis.solid.ocp.task1;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<String, Calculating> operators;

    public Calculator() {
        operators = new HashMap<>();
        operators.put("+", new Addition());
        operators.put("-", new Subtraction());
        operators.put("*", new Multiplication());
        operators.put("/", new Division());
    }

    public Number calculate(String[] args) {
        int val1 = Integer.valueOf(args[0]);
        int val2 = Integer.valueOf(args[2]);
        String operator = args[1];

        if (operators.keySet().contains(operator)){
            return operators.get(operator).calculate(val1, val2);
        }
        throw new IllegalArgumentException(operator + " is not supported");
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate(args);
    }
}
