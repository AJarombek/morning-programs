/*
 * Unit tests for sum-of-all-odd-length-subarrays program
 * @author Andrew Jarombek
 * @since 10/25/2022
 */

package com.jarombek;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OddLengthSubarraysTest {
    @Test
    public void oddLengthSubArrays() {
        int result = OddLengthSubarrays.sumOddLengthSubarrays(new int[] {1, 4, 2, 5, 3});
        assertEquals(58, result);
    }
}
