// Program: https://leetcode.com/problems/reverse-bits/
// Author: Andrew Jarombek
// Date: 3/26/2022

#include <stdint.h>
#include <assert.h>

int hammingWeight(uint32_t n) {
    int result = 0;

    while (n > 0) {
        if (n % 2 == 1)
            result++;

        n >>= 1;
    }

    return result;
}

int main() {
    assert(hammingWeight(4) == 1);
}
