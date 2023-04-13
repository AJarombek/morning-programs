/*
 * https://leetcode.com/problems/1-bit-and-2-bit-characters/
 * @author Andrew Jarombek
 * @since 4/12/2023
 */

package com.jarombek;

class OneBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 1) {
            return true;
        }

        if (bits[bits.length-1] == 1) {
            return false;
        }

        if (bits[bits.length-2] == 0) {
            return true;
        }

        int count = 0;
        int index = bits.length - 2;

        while (index >= 0 && bits[index] == 1) {
            index--;
            count++;
        }

        return count % 2 == 0;
    }
}
