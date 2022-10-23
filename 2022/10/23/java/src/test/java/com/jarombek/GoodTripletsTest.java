/*
 * Unit tests for count-good-triplets program
 * @author Andrew Jarombek
 * @since 10/23/2022
 */

package com.jarombek;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GoodTripletsTest {
    @Test
    public void tripletsMatches() {
        int result = GoodTriplets.countGoodTriplets(new int[] {3, 0, 1, 1, 9, 7}, 7, 2, 3);
        assertEquals(4, result);
    }

    @Test
    public void tripletsNoMatches() {
        int result = GoodTriplets.countGoodTriplets(new int[] {1, 1, 2, 2, 3}, 0, 0, 1);
        assertEquals(0, result);
    }
}
