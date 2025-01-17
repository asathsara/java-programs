package com.example.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void testAdd() {
        // Arrange
        Calc calc = new Calc();
        int num1 = 3;
        int num2 = 7;

        // Act
        int result = calc.add(num1, num2);

        // Assert
        assertEquals(10, result);
    }

    @Test
    public void testAddWithZero() {
        // Arrange
        Calc calc = new Calc();
        int num1 = 0;
        int num2 = 5;

        // Act
        int result = calc.add(num1, num2);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testAddWithNegativeNumbers() {
        // Arrange
        Calc calc = new Calc();
        int num1 = -3;
        int num2 = -7;

        // Act
        int result = calc.add(num1, num2);

        // Assert
        assertEquals(-10, result);
    }
}