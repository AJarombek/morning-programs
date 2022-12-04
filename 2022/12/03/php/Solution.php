<?php

/**
 * https://leetcode.com/problems/two-sum/
 * @author Andrew Jarombek
 * @since 12/3/2022
 */

class Solution
{
    function twoSum($nums, $target): array
    {
        $values = [];

        for ($i = 0; $i < count($nums); $i++) {
            $num = $nums[$i];
            if (array_key_exists($num, $values)) {
                $index = $values[$num];
                return [$index, $i];
            }

            $values[$target - $num] = $i;
        }

        return [];
    }
}

$solution = new Solution();
assert($solution->twoSum([2,7,11,15], 9) == [0, 1]);