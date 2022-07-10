/**
 * https://leetcode.com/problems/palindrome-linked-list/
 * @author Andrew Jarombek
 * @since 7/10/2022
 */

public class DeleteLinkedListNode {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
 
    public static void deleteNode(ListNode node) {
        ListNode prev = null;

        while (node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }

        prev.next = null;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);

        deleteNode(list.next);

        assert list.val == 1;
        assert list.next.val == 3;
        assert list.next.next == null;
    }
}
