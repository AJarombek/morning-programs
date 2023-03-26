// https://leetcode.com/problems/reverse-bits/
// Author: Andrew Jarombek
// Date: 3/26/2023

#include <cassert>
#include <iostream>

using namespace std;

uint32_t reverseBits(uint32_t n) {
    uint32_t result = 0;

    for (int i = 31; i >= 0; i--) {
        uint32_t val = n & 1;
        val <<= i;

        result += val;
        n >>= 1;
    }

    return result;
}

int main() {
    u_int32_t result = reverseBits(1);
    cout << result;
    assert(result == 2147483648);
}