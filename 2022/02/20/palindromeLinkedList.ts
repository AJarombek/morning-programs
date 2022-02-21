/**
 * https://leetcode.com/problems/palindrome-linked-list/
 * @author Andrew Jarombek
 * @since 2/20/2022
 */

class ListNode {
    val: number
    next: ListNode | null
    constructor(val?: number, next?: ListNode | null) {
        this.val = (val===undefined ? 0 : val)
        this.next = (next===undefined ? null : next)
    }
}

function isPalindrome(head: ListNode | null): boolean {
    let length = 0;
    let node = head;
    let tail = null;

    while (node != null) {
        tail = new ListNode(node.val, tail);
        length++;
        node = node.next;
    }

    node = head;
    while (node != null) {
        if (node.val != tail.val) {
            return false;
        }

        node = node.next;
        tail = tail.next;
    }

    return true;
}
