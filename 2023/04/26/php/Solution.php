<?php

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * @author Andrew Jarombek
 * @since 4/26/2023
 */

class ListNode {
    public int $val = 0;
    public ListNode|null $next = null;
    function __construct($val = 0, $next = null) {
        $this->val = $val;
        $this->next = $next;
    }
}

class Solution
{
    function deleteDuplicates(ListNode|null $head): ListNode|null {
        $node = $head;

        while ($node != null && $node->next != null) {
            if ($node->val == $node->next->val) {
                $node->next = $node->next->next;
            } else {
                $node = $node->next;
            }
        }

        return $head;
    }
}

$solution = new Solution();
$head = new ListNode(1, new ListNode(1, new ListNode(2)));

$result = $solution->deleteDuplicates($head);
assert($result->val == 1);
assert($result->next->val == 2);
assert($result->next->next == null);
