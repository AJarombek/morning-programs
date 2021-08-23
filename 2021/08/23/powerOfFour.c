// Program: https://leetcode.com/problems/power-of-four/
// Author: Andrew Jarombek
// Date: 8/23/2021

#include <stdbool.h>
#include <assert.h>

bool isPowerOfFour(int n) {
    if (n < 4) {
        return n == 1;
    }

    while (n > 4) {
        if (n % 4 != 0) {
            return false;
        }

        n /= 4;
    }

    return n == 4;
}

int main() {
    assert(!isPowerOfFour(0));
    assert(isPowerOfFour(1));
    assert(isPowerOfFour(4));
    assert(isPowerOfFour(16));
    assert(!isPowerOfFour(17));
}