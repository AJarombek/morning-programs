/*
 * Unit tests for a middle-of-the-linked-list program
 * @author Andrew Jarombek
 * @since 9/20/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testMiddleNode() {
        var solution = new Solution();

        var head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        var middle1 = solution.middleNode(head1);
        assertEquals(3, middle1.val);

        var head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        var middle2 = solution.middleNode(head2);
        assertEquals(4, middle2.val);

        var head3 = new ListNode(1);
        var middle3 = solution.middleNode(head3);
        assertEquals(1, middle3.val);

        var head4 = new ListNode(1, new ListNode(2));
        var middle4 = solution.middleNode(head4);
        assertEquals(2, middle4.val);
    }
}
