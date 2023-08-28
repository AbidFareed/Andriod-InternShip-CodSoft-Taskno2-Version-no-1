package com.example.calculator;

import java.lang.Math;
public class EvaluateString {

    public static double evaluate(String expression) throws Exception {
        String[] tokens = expression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)|(?<=\\()|(?<=\\))");
        // Split the expression into tokens, preserving operators and parentheses

        double result = 0;
        String operator = "+";
        boolean unaryMinus = true;  // This flag is used to handle unary minus operators

        for (String token : tokens) {
            if (token.trim().isEmpty()) {
                continue;  // Skip any whitespace
            }
            switch (token) {
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                case "%":
                    operator = token;
                    unaryMinus = true;
                    break;
                case "√":
                    result = Math.sqrt(result);
                    break;
                case "²":
                    result = Math.pow(result, 2);
                    break;
                case "³":
                    result = Math.pow(result, 3);
                    break;
                case "!":
                    if (result < 0) {
                        throw new Exception("Factorial of a negative number is undefined");
                    }
                    result = factorial((int)result);
                    break;
                case "(":
                    if (!unaryMinus && operator.equals("-")) {
                        operator = "-u";  // Unary minus operator
                    }
                    break;
                case ")":
                    if (operator.equals("-u")) {
                        result = -result;
                        operator = "+";  // Reset operator to addition
                    }
                    unaryMinus = false;
                    break;
                default:
                    double number = Double.parseDouble(token);
                    if (operator.equals("+")) {
                        result += number;
                    } else if (operator.equals("-")) {
                        result -= number;
                    } else if (operator.equals("*")) {
                        result *= number;
                    } else if (operator.equals("/")) {
                        if (number == 0) {
                            throw new Exception("Division by zero is undefined");
                        }
                        result /= number;
                    } else if (operator.equals("^")) {
                        result = Math.pow(result, number);
                    } else if (operator.equals("%")) {
                        result %= number;
                    }
                    unaryMinus = false;
                    break;
            }
        }

        return result;
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}