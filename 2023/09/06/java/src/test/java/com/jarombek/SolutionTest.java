/*
 * Unit tests for a design-hashmap program
 * @author Andrew Jarombek
 * @since 9/6/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void myHashSet() {
        var hashMap = new MyHashMap();

        hashMap.put(1, 2);
        hashMap.put(2, 3);

        assertEquals(hashMap.get(1), 2);
        assertEquals(hashMap.get(2), 3);
        assertEquals(hashMap.get(3), -1);

        hashMap.put(3, 4);
        assertEquals(hashMap.get(3), 4);

        hashMap.remove(2);
        assertEquals(hashMap.get(1), 2);
        assertEquals(hashMap.get(2), -1);
        assertEquals(hashMap.get(3), 4);
    }
}
