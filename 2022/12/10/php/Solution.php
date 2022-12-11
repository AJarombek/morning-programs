<?php

/**
 * https://leetcode.com/problems/search-insert-position/
 * @author Andrew Jarombek
 * @since 12/10/2022
 */

class Solution
{
    function searchInsert(array $nums, int $target): int {
        for ($i = 0; $i < count($nums); $i++) {
            if ($nums[$i] >= $target) {
                return $i;
            }
        }

        return count($nums);
    }

    function lengthOfLastWord(string $s): int {
        $i = strlen($s) - 1;

        while ($s[$i] == ' ' && $i >= 0) {
            $i--;
        }

        $result = 0;

        while ($s[$i] != ' ' && $i >= 0) {
            $result++;
            $i--;
        }

        return $result;
    }
}

$solution = new Solution();
$nums = [1,3,5,6];

$result = $solution->searchInsert($nums, 5);
assert($result == 2);

$result = $solution->lengthOfLastWord("almost sold out of christmas trees ");
assert($result == 5);
