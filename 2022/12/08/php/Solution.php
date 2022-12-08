<?php

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * @author Andrew Jarombek
 * @since 12/8/2022
 */

class Solution
{
    function removeDuplicates(&$nums): int {
        $prev = $nums[0];
        $start = 1;
        $end = 1;

        while ($end < count($nums)) {
            $val = $nums[$end];

            if ($prev != $val) {
                $nums[$start] = $val;
                $start++;
                $prev = $val;
            }

            $end++;
        }

        return $start;
    }
}

$solution = new Solution();
$nums = [1, 1, 2];

$result = $solution->removeDuplicates($nums);
assert($result == 2);
assert($nums[0] == 1);
assert($nums[1] == 2);
