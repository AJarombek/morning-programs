/*
 * Unit tests for a n-ary-tree-preorder-traversal program
 * @author Andrew Jarombek
 * @since 4/20/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void preorder() {
        var solution = new Solution();
        var node = new Node(1, List.of(new Node(2, List.of(new Node(4, List.of()))), new Node(3, List.of())));
        var result = solution.preorder(node);
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(4, result.get(2));
        assertEquals(3, result.get(3));
    }
}
