// https://leetcode.com/problems/number-of-1-bits/
// Author: Andrew Jarombek
// Date: 3/27/2023

#include <cassert>

using namespace std;

int hammingWeight(uint32_t n) {
    int result = 0;

    while (n > 0) {
        result += n & 1;
        n >>= 1;
    }

    return result;
}

int main() {
    int result = hammingWeight(11);
    assert(result == 3);

    result = hammingWeight(12);
    assert(result == 2);
}