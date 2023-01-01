/*
 * Unit tests for kth-largest-element-in-a-stream program
 * @author Andrew Jarombek
 * @since 1/1/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestTest {
    @Test
    public void kthLargest() {
        var kthLargest = new KthLargest(3, new int[] {4, 5, 8, 2});
        assertEquals(4, kthLargest.add(3));
        assertEquals(5, kthLargest.add(5));
        assertEquals(5, kthLargest.add(10));
        assertEquals(8, kthLargest.add(9));
        assertEquals(8, kthLargest.add(4));
    }
}
