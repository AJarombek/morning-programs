/*
 * Unit tests for a design-hashset program
 * @author Andrew Jarombek
 * @since 4/24/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void myHashSet() {
        var hashSet = new MyHashSet();

        hashSet.add(1);
        hashSet.add(2);

        assertTrue(hashSet.contains(1));
        assertFalse(hashSet.contains(3));

        hashSet.add(2);
        assertTrue(hashSet.contains(2));

        hashSet.remove(2);
        assertFalse(hashSet.contains(2));
    }
}
