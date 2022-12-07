<?php

/**
 * https://leetcode.com/problems/valid-parentheses/
 * @author Andrew Jarombek
 * @since 12/6/2022
 */

class Solution
{
    function isValid($s): bool {
        $matches = ['(' => ')', '[' => ']', '{' => '}'];
        $stack = [];
        $chars = str_split($s);

        foreach ($chars as $c) {
            if (($paren = $matches[$c]) != null) {
                $stack[] = $paren;
            } else {
                $value = array_pop($stack);

                if ($value != $c) {
                    return false;
                }
            }
        }

        return count($stack) == 0;
    }
}