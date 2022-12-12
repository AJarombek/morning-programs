<?php

/**
 * https://leetcode.com/problems/plus-one/
 * @author Andrew Jarombek
 * @since 12/11/2022
 */

class Solution
{
    function plusOne($digits) {
        $remainder = 1;
        $index = count($digits) - 1;

        while ($index >= 0 && $remainder > 0) {
            $val = $digits[$index];

            if ($val == 9) {
                $digits[$index] = 0;
            } else {
                $digits[$index] = $val + $remainder;
                $remainder = 0;
            }

            $index--;
        }

        if ($remainder == 1) {
            array_unshift($digits, 1);
        }

        return $digits;
    }
}

$solution = new Solution();
$nums = [1,2,3];

$result = $solution->plusOne($nums);
assert($result == [1, 2, 4]);

$nums = [9];

$result = $solution->plusOne($nums);
assert($result == [1, 0]);
