/*
 * Unit tests for check-if-two-string-arrays-are-equivalent program
 * @author Andrew Jarombek
 * @since 10/29/2022
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayStringEqualityTest {
    @Test
    public void arrayStringEquality() {
        assertTrue(ArrayStringEquality.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        assertFalse(ArrayStringEquality.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        assertTrue(ArrayStringEquality.arrayStringsAreEqual(
            new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}
        ));
    }
}
