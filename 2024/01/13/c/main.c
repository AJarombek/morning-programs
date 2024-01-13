// Program: https://leetcode.com/problems/number-complement/
// Author: Andrew Jarombek
// Date: 1/13/2024

#include <assert.h>

int findComplement(int num) {
    int complement = 0;
    int bit = 0;

    while (num > 0) {
        if ((num & 1) == 0) {
            complement += 1 << bit;
        }

        bit++;
        num >>= 1;
    }

    return complement;
}

int main() {
    assert(findComplement(5) == 2);
    assert(findComplement(1) == 0);

    return 0;
}