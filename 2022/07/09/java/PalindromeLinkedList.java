/**
 * https://leetcode.com/problems/palindrome-linked-list/
 * @author Andrew Jarombek
 * @since 7/9/2022
 */

import java.util.Stack;

public class PalindromeLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public static boolean isPalindrome(ListNode head) {
        int count = 0;
        ListNode node = head;

        while (node != null) {
            count++;
            node = node.next;
        }

        int index = 0;
        Stack<Integer> stack = new Stack<>();
        node = head;

        while (index < count / 2) {
            stack.push(node.val);
            node = node.next;
            index++;
        }

        if (count % 2 == 1) {
            node = node.next;
            index++;
        }

        while (index < count) {
            int val = stack.pop();

            if (val != node.val)
                return false;

            node = node.next;
            index++;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2));
        assert !isPalindrome(listNode);

        listNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        assert isPalindrome(listNode);
    }
}
