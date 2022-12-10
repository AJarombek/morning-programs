<?php

/**
 * https://leetcode.com/problems/remove-element/
 * @author Andrew Jarombek
 * @since 12/9/2022
 */

class Solution
{
    function removeElement(&$nums, $val): int {
        $start = 0;
        $end = count($nums) - 1;

        while ($start <= $end) {
            if ($nums[$start] == $val) {
                $nums[$start] = $nums[$end];
                $end--;
            } else {
                $start++;
            }
        }

        return $start;
    }
}

$solution = new Solution();
$nums = [3,2,2,3];

$result = $solution->removeElement($nums, 3);
assert($result == 2);
assert($nums[0] == 2);
assert($nums[1] == 2);
