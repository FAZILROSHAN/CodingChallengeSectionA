package com.codingsection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for SyllableCounter.
 * 
 * This test suite validates the syllable-counting logic
 * based on hyphen-separated input strings.
 *
 * Author: Fazil Roshan A
 * Date: 09-07-2025
 */
public class SyllableCounterTest {

    /**
     * Test with a two-syllable word.
     */
    @Test
    void testTwoSyllables() {
        assertEquals(2, SyllableCounter.count("ho-tel"));
    }

    /**
     * Test with a single-syllable word (no hyphen).
     */
    @Test
    void testSingleSyllable() {
        assertEquals(1, SyllableCounter.count("cat"));
    }

    /**
     * Test with a three-syllable word.
     */
    @Test
    void testThreeSyllables() {
        assertEquals(3, SyllableCounter.count("met-a-phor"));
    }
    /**
     * Test with an empty string input.
     */
    @Test
    void testEmptyInput() {
        assertEquals(0, SyllableCounter.count(""));
    }
    /**
     * Test with input containing only hyphens (edge case).
     */
    @Test
    void testOnlyHyphens() {
        assertEquals(0, SyllableCounter.count("--"));
    }
}
