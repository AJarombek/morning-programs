/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * @author Andrew Jarombek
 * @since 11/13/2021
 */

public class GetDecimalValue {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int getDecimalValue(ListNode head) {
        int value = 0;

        while (head != null) {
            value = value * 2 + head.val;
            head = head.next;
        }

        return value;
    }
}
