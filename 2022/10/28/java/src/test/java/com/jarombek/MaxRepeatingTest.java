/*
 * Unit tests for maximum-repeating-substring program
 * @author Andrew Jarombek
 * @since 10/28/2022
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxRepeatingTest {
    @Test
    public void maxRepeating() {
        assertEquals(2, MaxRepeating.maxRepeating("ababc", "ab"));
        assertEquals(1, MaxRepeating.maxRepeating("ababc", "ba"));
        assertEquals(0, MaxRepeating.maxRepeating("ababc", "ac"));
    }
}
