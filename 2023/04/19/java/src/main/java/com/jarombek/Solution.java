/*
 * https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
 * @author Andrew Jarombek
 * @since 4/19/2023
 */

package com.jarombek;

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;

        for (int i = left; i <= right; i++) {
            int bits = 0;
            int n = i;

            while (n > 0) {
                if (n % 2 == 1) {
                    bits++;
                }

                n >>= 1;
            }

            if (isPrime(bits)) {
                result++;
            }
        }

        return result;
    }

    public boolean isPrime(int num) {
        if (num <= 3) {
            return num > 1;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
