/*
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * @author Andrew Jarombek
 * @since 9/20/2023
 */

package com.jarombek;

public class Solution {
    public ListNode middleNode(ListNode head) {
        var slow = head;
        var fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
