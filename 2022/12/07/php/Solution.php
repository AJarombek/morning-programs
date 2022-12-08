<?php

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * @author Andrew Jarombek
 * @since 12/7/2022
 */

require_once "ListNode.php";

class Solution
{
    function mergeTwoLists(?ListNode $list1, ?ListNode $list2): ?ListNode {
        $result = new ListNode();
        $current = $result;

        while ($list1 != null && $list2 != null) {
            if ($list1->val < $list2->val) {
                $current->next = new ListNode($list1->val);
                $list1 = $list1->next;
            } else {
                $current->next = new ListNode($list2->val);
                $list2 = $list2->next;
            }

            $current = $current->next;
        }

        if ($list1 != null) {
            $current->next = $list1;
        }

        if ($list2 != null) {
            $current->next = $list2;
        }

        return $result->next;
    }
}
