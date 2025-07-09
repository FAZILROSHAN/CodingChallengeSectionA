package com.codingsection;

import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for OnlineStatus.
 * 
 * This class verifies the correctness of the onlineCount() method,
 * which counts how many users are marked as "online" in a given map.
 *
 * Author: Fazil Roshan A
 * Date: 09-07-2025
 */
public class OnlineStatusTest {

    /**
     * Test when all users are online.
     */
    @Test
    void testAllOnline() {
        Map<String, String> statuses = Map.of(
            "Anu", "online",
            "Ravi", "online",
            "Vikram", "online"
        );
        assertEquals(3, OnlineStatus.onlineCount(statuses));
    }

    /**
     * Test when no users are online.
     */
    @Test
    void testAllOffline() {
        Map<String, String> statuses = Map.of(
            "Anu", "offline",
            "Ravi", "offline"
        );
        assertEquals(0, OnlineStatus.onlineCount(statuses));
    }

    /**
     * Test when some users are online and others offline.
     */
    @Test
    void testSomeOnline() {
        Map<String, String> statuses = Map.of(
            "Ram", "online",
            "Shyam", "offline",
            "Maya", "online"
        );
        assertEquals(2, OnlineStatus.onlineCount(statuses));
    }

    /**
     * Test with an empty map (no users).
     */
    @Test
    void testEmptyMap() {
        Map<String, String> statuses = new HashMap<>();
        assertEquals(0, OnlineStatus.onlineCount(statuses));
    }

}
