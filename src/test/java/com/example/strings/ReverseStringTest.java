package com.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void testReverseRegularString() {

        ReverseString reverseString = new ReverseString();
        assertEquals("olleH", reverseString.reverse("Hello"), "Reversing 'Hello' should return 'olleH'");
    }

    @Test
    void testReverseEmptyString() {
        ReverseString reverseString = new ReverseString();
        assertEquals("", reverseString.reverse(""), "Reversing an empty string should return an empty string");
    }

    @Test
    void testReverseSingleCharacter() {
        ReverseString reverseString = new ReverseString();
        assertEquals("a", reverseString.reverse("a"), "Reversing 'a' should return 'a'");
    }
}