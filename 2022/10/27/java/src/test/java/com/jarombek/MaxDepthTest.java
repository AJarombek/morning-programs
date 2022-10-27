/*
 * Unit tests for maximum-nesting-depth-of-the-parentheses program
 * @author Andrew Jarombek
 * @since 10/27/2022
 */

package com.jarombek;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxDepthTest {
    @Test
    public void maxDepth() {
        assertEquals(3, MaxDepth.maxDepth("(1)+((2))+(((3)))"));
        assertEquals(3, MaxDepth.maxDepth("((1)+((2)))"));
    }
}
