/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * @author Andrew Jarombek
 * @since 5/7/2023
 */

const assert = require('assert');

function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}

const middleNode = function(head) {
    if (head.next == null)
        return head;

    let slow = head;
    let fast = head;

    while (fast?.next) {
        slow = slow.next;
        fast = fast.next;

        if (fast) {
            fast = fast.next;
        }
    }

    return slow;
}

// Test case 1: Even number of nodes
let node1 = new ListNode(1);
let node2 = new ListNode(2);
let node3 = new ListNode(3);
let node4 = new ListNode(4);
node1.next = node2;
node2.next = node3;
node3.next = node4;
assert.strictEqual(middleNode(node1), node3, 'Test case 1 failed');

// Test case 2: Odd number of nodes
let node5 = new ListNode(5);
node4.next = node5;
assert.strictEqual(middleNode(node1), node3, 'Test case 2 failed');

// Test case 3: Single node
let node6 = new ListNode(6);
assert.strictEqual(middleNode(node6), node6, 'Test case 3 failed');

// Test case 4: Two nodes
let node7 = new ListNode(7);
node6.next = node7;
assert.strictEqual(middleNode(node6), node7, 'Test case 4 failed');
