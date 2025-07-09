package com.codingsection;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for CapitalIndexes.
 * 
 * This class contains unit tests to validate the correctness
 * of capital letter index extraction in a given string.
 *
 * Author: Fazil Roshan A
 * Date: 09-07-2025
 */
public class CapitalIndexesTest {
    /**
     * Verifies behavior when input has no capital letters.
     */
    @Test
    void testAllLowercase() {
        List<Integer> result = CapitalIndexes.capitalIndexes("developer");
        assertEquals(Collections.emptyList(), result);
    }

    /**
     * Verifies correct indexing when capital letters are placed in the middle.
     */
    @Test
    void testMiddleCapitals() {
        List<Integer> result = CapitalIndexes.capitalIndexes("coDEbasE");
        assertEquals(List.of(2, 3, 7), result);
    }

    /**
     * Verifies that an empty string returns an empty list.
     */
    @Test
    void testEmptyInput() {
        List<Integer> result = CapitalIndexes.capitalIndexes("");
        assertEquals(Collections.emptyList(), result);
    }
    /**
     * Verifies correct behavior when the input is a single uppercase character.
     */
    @Test
    void testSingleCapital() {
        List<Integer> result = CapitalIndexes.capitalIndexes("A");
        assertEquals(List.of(0), result);
    }

    /**
     * Verifies behavior when the input is a single lowercase character.
     */
    @Test
    void testSingleLowercase() {
        List<Integer> result = CapitalIndexes.capitalIndexes("b");
        assertEquals(Collections.emptyList(), result);
    }
}
