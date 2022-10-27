/*
 * Unit tests for special-array-with-x-elements-greater-than-or-equal-x program
 * @author Andrew Jarombek
 * @since 10/26/2022
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpecialArrayTest {
    @Test
    public void specialArray() {
        assertEquals(SpecialArray.specialArray(new int[] {3, 5}), 2);
    }
}
