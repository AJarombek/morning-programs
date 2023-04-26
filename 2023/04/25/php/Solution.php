<?php

/**
 * https://leetcode.com/problems/climbing-stairs/
 * @author Andrew Jarombek
 * @since 4/25/2023
 */

class Solution
{
    function climbStairs($n) {
        $x = 1;
        $y = 1;

        for ($i = 1; $i < $n; $i++) {
            $z = $x + $y;
            $x = $y;
            $y = $z;
        }

        return $y;
    }
}

$solution = new Solution();

$result = $solution->climbStairs(4);
assert($result == 5);
