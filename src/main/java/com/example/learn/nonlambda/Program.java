package com.example.learn.nonlambda;

import com.example.learn.Calculate;
import com.example.learn.CalculateImpl;

public class Program {
    public static void main(String[] args) {

        // Create an instance of CalculateImpl, which implements the Calculate interface
        Calculate calculate = new CalculateImpl();

        // Using the multiply method from CalculateImpl
        int multiplyResult = calculate.multiply(5, 6);
        System.out.println("Multiply Result: " + multiplyResult);  // Output: 30

        // Optionally, if you want to customize the division logic, you can do so in CalculateImpl
        // For example, handling division by zero (but it isn't needed in the default implementation)
        int divideResult = calculate.divide(10, 2);  // Using the inherited divide method
        System.out.println("Divide Result: " + divideResult);  // Output: 5

        // If you want to customize the divide method in CalculateImpl, you could override it like this:
        // System.out.println(calculate.divide(10, 0));  // To test division by zero handling (handled by default in Calculate interface)
    }
}
