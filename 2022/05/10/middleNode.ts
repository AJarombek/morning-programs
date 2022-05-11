/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * @author Andrew Jarombek
 * @since 5/10/2022
 */

class ListNode {
    val: number
    next: ListNode | null
    constructor(val?: number, next?: ListNode | null) {
        this.val = (val===undefined ? 0 : val)
        this.next = (next===undefined ? null : next)
    }
}

function middleNode(head: ListNode | null): ListNode | null {
    let slow = head;
    let fast = head;

    while (fast?.next != null) {
        slow = slow.next;
        fast = fast.next?.next;
    }

    return slow;
}