// Program: https://leetcode.com/problems/hamming-distance/
// Author: Andrew Jarombek
// Date: 1/6/2024

#include <assert.h>

int hammingDistance(int x, int y) {
    int distance = 0;

    for (int i = 0; i < 32; i++) {
        int xBit = (x >> i) & 1;
        int yBit = (y >> i) & 1;

        if (xBit != yBit) {
            distance++;
        }
    }

    return distance;
}

int main() {
    assert(hammingDistance(1, 4) == 2);
    assert(hammingDistance(1, 1) == 0);
    assert(hammingDistance(0, 0) == 0);

    return 0;
}