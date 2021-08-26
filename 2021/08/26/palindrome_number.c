// Program: https://leetcode.com/problems/palindrome-number/
// Author: Andrew Jarombek
// Date: 8/26/2021

#include <stdbool.h>
#include <assert.h>

bool isPalindrome(int x) {
    if (x < 0) {
        return false;
    }

    if (x < 10) {
        return true;
    }

    int y = x;
    long z = 0;

    while (y > 0) {
        z = z * 10 + (y % 10);
        y = y / 10;
    }

    return x == z;
}

int main() {
    assert(!isPalindrome(-121));
    assert(isPalindrome(121));
}