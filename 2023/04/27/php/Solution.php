<?php

/**
 * https://leetcode.com/problems/merge-sorted-array/
 * @author Andrew Jarombek
 * @since 4/27/2023
 */

class Solution
{
    function merge(&$nums1, $m, $nums2, $n) {
        $i = $m - 1;
        $j = $n - 1;
        $k = $m + $n - 1;

        while ($i >= 0 && $j >= 0) {
            if ($nums1[$i] > $nums2[$j]) {
                $nums1[$k] = $nums1[$i];
                $i--;
            } else {
                $nums1[$k] = $nums2[$j];
                $j--;
            }

            $k--;
        }

        while ($j >= 0) {
            $nums1[$k] = $nums2[$j];
            $j--;
            $k--;
        }
    }
}

$solution = new Solution();
$nums1 = [1, 2, 3, 0, 0, 0];
$nums2 = [2, 5, 6];

$solution->merge($nums1, 3, $nums2, 3);
assert($nums1 == [1, 2, 2, 3, 5, 6]);
