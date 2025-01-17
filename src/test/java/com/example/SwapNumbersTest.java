package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SwapNumbersTest {

    private SwapNumbers swapNumbers;

    @BeforeAll
    void beforeAll() {
        System.out.println("Starting SwapNumbersTest - Running setup before all tests.");
    }

    @AfterAll
    void afterAll() {
        System.out.println("Finished SwapNumbersTest - Cleaning up after all tests.");
    }

    @BeforeEach
    void setUp() {
        // Initialize SwapNumbers with default values before each test
        swapNumbers = new SwapNumbers(10, 20);
        System.out.println("Setup complete. Initial values: first = " + swapNumbers.getFirst() + ", second = " + swapNumbers.getSecond());
    }

    @AfterEach
    void tearDown() {
        // Clean up resources or state after each test
        System.out.println("Test complete. Final values: first = " + swapNumbers.getFirst() + ", second = " + swapNumbers.getSecond());
    }

    @Test
    void testSwapWithPositiveNumbers() {
        // Act
        swapNumbers.swap();

        // Assert
        assertEquals(20, swapNumbers.getFirst(), "First number should be swapped to 20");
        assertEquals(10, swapNumbers.getSecond(), "Second number should be swapped to 10");
    }

    @Test
    void testSwapWithNegativeNumbers() {
        // Arrange
        swapNumbers = new SwapNumbers(-5, -15);

        // Act
        swapNumbers.swap();

        // Assert
        assertEquals(-15, swapNumbers.getFirst(), "First number should be swapped to -15");
        assertEquals(-5, swapNumbers.getSecond(), "Second number should be swapped to -5");
    }

    @Test
    void testSwapWithZero() {
        // Arrange
        swapNumbers = new SwapNumbers(0, 50);

        // Act
        swapNumbers.swap();

        // Assert
        assertEquals(50, swapNumbers.getFirst(), "First number should be swapped to 50");
        assertEquals(0, swapNumbers.getSecond(), "Second number should be swapped to 0");
    }
}
