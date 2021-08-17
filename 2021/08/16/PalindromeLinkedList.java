/**
 * https://leetcode.com/problems/palindrome-linked-list/
 * @author Andrew Jarombek
 * @since 8/16/2021
 */

public class PalindromeLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        StringBuilder forward = new StringBuilder();
        StringBuilder backward = new StringBuilder();

        while (head != null) {
            forward.append(head.val);
            backward.insert(0, head.val);
            head = head.next;
        }

        return forward.toString().equals(backward.toString());
    }
}
