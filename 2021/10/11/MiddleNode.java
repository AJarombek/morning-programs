/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * @author Andrew Jarombek
 * @since 10/11/2021
 */

public class MiddleNode {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        head = head.next;

        int index = 1;

        while (head != null) {
            index++;

            if (index % 2 == 0) {
                mid = mid.next;
            }

            head = head.next;
        }

        return mid;
    }
}
