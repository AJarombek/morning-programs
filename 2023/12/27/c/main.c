// Program: https://leetcode.com/problems/arranging-coins/
// Author: Andrew Jarombek
// Date: 12/27/2023

#include <assert.h>

int arrangeCoins(int n) {
    int i = 1;

    while (n >= i) {
        n -= i;
        i++;
    }

    return i - 1;
}

int main() {
    assert(arrangeCoins(5) == 2);
    assert(arrangeCoins(8) == 3);
    assert(arrangeCoins(1) == 1);
    return 0;
}