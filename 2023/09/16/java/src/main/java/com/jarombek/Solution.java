/*
 * https://leetcode.com/problems/lemonade-change/
 * @author Andrew Jarombek
 * @since 9/16/2023
 */

package com.jarombek;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] change = new int[2];

        for (int bill : bills) {
            if (bill == 20) {
                if (change[0] == 0 || change[1] == 0) {
                    if (change[0] < 3) {
                        return false;
                    }

                    change[0] -= 3;
                } else {
                    change[0]--;
                    change[1]--;
                }
            } else if (bill == 10) {
                if (change[0] == 0) {
                    return false;
                }

                change[0]--;
                change[1]++;
            } else {
                change[0]++;
            }
        }

        return true;
    }
}
