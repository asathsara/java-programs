package com.example.twosum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTwoTest {

    private SolutionTwo solutionTwo;

    @BeforeEach
    void setUp() {
        solutionTwo = new SolutionTwo();
    }

    @Test
    void testTwoSumExample1() {
        assertArrayEquals(new int[]{0, 1}, solutionTwo.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void testTwoSumExample2() {
        assertArrayEquals(new int[]{1, 2}, solutionTwo.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void testTwoSumExample3() {
        assertArrayEquals(new int[]{0, 1}, solutionTwo.twoSum(new int[]{3, 3}, 6));
    }
}