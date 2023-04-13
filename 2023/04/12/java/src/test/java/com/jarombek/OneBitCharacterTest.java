/*
 * Unit tests for 1-bit-and-2-bit-characters program
 * @author Andrew Jarombek
 * @since 4/12/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OneBitCharacterTest {
    @Test
    public void oneBitCharacter() {
        var solution = new OneBitCharacter();
        assertTrue(solution.isOneBitCharacter(new int[] {1, 0, 0}));
        assertFalse(solution.isOneBitCharacter(new int[] {1, 1, 1, 0}));
    }
}
