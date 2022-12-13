<?php

/**
 * https://leetcode.com/problems/add-binary/
 * @author Andrew Jarombek
 * @since 12/12/2022
 */

class Solution
{
    function addBinary(string $a, string $b): string {
        $bits = [];
        $x = strlen($a) - 1;
        $y = strlen($b) - 1;
        $remainder = 0;

        while ($remainder > 0 || $x >= 0 || $y >= 0) {
            $first = ($x < 0 || $a[$x] == "0") ? 0 : 1;
            $second = ($y < 0 || $b[$y] == "0") ? 0 : 1;
            $val = $remainder + $first + $second;

            $bits[] = ($val % 2 == 0) ? "0" : "1";
            $remainder = ($val > 1) ? 1 : 0;
            $x--;
            $y--;
        }

        return implode(array_reverse($bits));
    }
}

$solution = new Solution();

$result = $solution->addBinary("11", "1");
assert($result == "100");
