<?php

/**
 * https://leetcode.com/problems/palindrome-number/
 * @author Andrew Jarombek
 * @since 12/4/2022
 */

class Solution
{
    function isPalindrome($x)
    {
        if ($x < 0) {
            return false;
        }

        if ($x < 10) {
            return true;
        }

        $y = $x;
        $nums = [];

        while ($y > 0) {
            $nums[] = $y % 10;
            $y = floor($y / 10);
        }

        $start = 0;
        $end = count($nums) - 1;

        while ($start < $end) {
            if ($nums[$start] != $nums[$end]) {
                return false;
            }

            $start++;
            $end--;
        }

        return true;
    }
}