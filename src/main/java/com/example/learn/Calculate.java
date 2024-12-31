package com.example.learn;

@FunctionalInterface
public interface Calculate {
    // Abstract method that must be implemented in any class that implements Calculate
    int multiply(int a, int b);

    // Default method with a default implementation
    default int divide(int a, int b) {
        return a / b;  // Division logic is already provided, no need to implement
    }
}
