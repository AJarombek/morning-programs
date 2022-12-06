<?php

/**
 * https://leetcode.com/problems/roman-to-integer/
 * @author Andrew Jarombek
 * @since 12/5/2022
 */

class Solution
{
    function romanToInt($s): int {
        $values = array(
            'I' => 1,
            'IV' => 4,
            'V' => 5,
            'IX' => 9,
            'X' => 10,
            'XL' => 40,
            'L' => 50,
            'XC' => 90,
            'C' => 100,
            'CD' => 400,
            'D' => 500,
            'CM' => 900,
            'M' => 1000
        );

        $result = 0;
        $index = 0;

        while ($index < strlen($s)) {
            if ($index + 1 < strlen($s) && ($value = $values[substr($s, $index, 2)]) != null) {
                $result += $value;
                $index += 2;
            } else {
                $result += $values[$s[$index]];
                $index++;
            }
        }

        return $result;
    }
}