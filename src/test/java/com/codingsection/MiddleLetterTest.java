package com.codingsection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for MiddleLetter.
 * 
 * This class tests the logic of extracting the middle character
 * from a given string using the mid() method.
 *
 * Author: Fazil Roshan A
 * Date: 09-07-2025
 */
public class MiddleLetterTest {

    /**
     * Test with odd-length word: returns the middle letter.
     */
    @Test
    void testOddLengthWord() {
        assertEquals("a", MiddleLetter.mid("black"));
    }

    /**
     * Test with even-length word: returns empty string.
     */
    @Test
    void testEvenLengthWord() {
        assertEquals("", MiddleLetter.mid("opop"));
    }

    /**
     * Test with a single character: returns the character itself.
     */
    @Test
    void testSingleCharacter() {
        assertEquals("f", MiddleLetter.mid("f"));
    }

    /**
     * Test with an empty string: should return empty string.
     */
    @Test
    void testEmptyString() {
        assertEquals("", MiddleLetter.mid(""));
    }
}
