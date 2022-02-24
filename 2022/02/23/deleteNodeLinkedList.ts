/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 * @author Andrew Jarombek
 * @since 2/23/2022
 */

class ListNode {
    val: number
    next: ListNode | null
    constructor(val?: number, next?: ListNode | null) {
        this.val = (val===undefined ? 0 : val)
        this.next = (next===undefined ? null : next)
    }
}

function deleteNode(root: ListNode | null): void {
    while (root.next) {
        root.val = root.next.val;

        if (root.next.next) {
            root = root.next;
        } else {
            root.next = null;
        }
    }
}