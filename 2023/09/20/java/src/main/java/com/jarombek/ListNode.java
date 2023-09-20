/*
 * ListNode class for a node in a linked list.
 * @author Andrew Jarombek
 * @since 9/20/2023
 */

package com.jarombek;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
