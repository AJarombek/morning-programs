// Program: https://leetcode.com/problems/reverse-bits/
// Author: Andrew Jarombek
// Date: 3/25/2022

#include <stdint.h>
#include <assert.h>

uint32_t reverseBits(uint32_t n) {
    uint32_t result = 0;
    int bit = 32;

    while (bit > 0) {
        result <<= 1;

        if (n % 2 == 1) {
            result += 1;
        }

        n >>= 1;
        bit--;
    }

    return result;
}

int main() {
    assert(reverseBits(43261596) == 964176192);
}
