package com.rahul.algo.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void testReverseNormal() {
        String input = "hello";
        String expected = "olleh";
        assertEquals(expected, ReverseString.reverse(input), "Normal string should reverse");
    }

    @Test
    void testReverseSingleChar() {
        String input = "a";
        String expected = "a";
        assertEquals(expected, ReverseString.reverse(input), "Single character should stay same");
    }

    @Test
    void testReverseEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, ReverseString.reverse(input), "Empty string should stay empty");
    }

    @Test
    void testReverseWithSpaces() {
        String input = "hi there";
        String expected = "ereht ih";
        assertEquals(expected, ReverseString.reverse(input), "String with spaces should reverse correctly");
    }
}
