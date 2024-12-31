package com.example.learn.lamda;

import com.example.learn.Calculate;

public class Program {
    public static void main(String[] args) {

        // Without lambda: Using an anonymous inner class
        Calculate calculate = new Calculate() {
            @Override
            public int multiply(int a, int b) {
                return a * b;  // Implementing the multiply method
            }

            @Override
            public int divide(int a, int b) {
                // Custom divide method, preventing division by zero
                return (b == 0) ? 0 : a / b;
            }
        };

        // Using the multiply method from the Calculate interface
        int multiplyResult = calculate.multiply(5, 7);
        System.out.println("Multiply Result: " + multiplyResult);  // Output: 35

        // Using the divide method (with custom logic for division by zero)
        int divideResult = calculate.divide(5, 0);  // Division by zero
        System.out.println("Divide Result: " + divideResult);  // Output: 0

        // With lambda: A cleaner implementation for multiply
        Calculate cal = (a, b) -> a * b;  // Lambda expression to multiply two numbers

        // Using the multiply method with lambda
        int lambdaMultiplyResult = cal.multiply(5, 3);
        System.out.println("Lambda Multiply Result: " + lambdaMultiplyResult);  // Output: 15
    }
}
