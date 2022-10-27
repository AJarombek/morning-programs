/*
 * Unit tests for slowest-key program
 * @author Andrew Jarombek
 * @since 10/27/2022
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlowestKeyTest {
    @Test
    public void maxDepth() {
        assertEquals('c', SlowestKey.slowestKey(new int[] {9, 29, 49, 50}, "cbcd"));
    }
}
