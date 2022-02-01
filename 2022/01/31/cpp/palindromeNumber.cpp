// https://leetcode.com/problems/two-sum/
// Author: Andrew Jarombek
// Date: 1/14/2022

#include <cassert>

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
        z *= 10;
        z += y % 10;
        y /= 10;
    }

    return x == z;
}

int main() {
    assert(isPalindrome(121));
    assert(!isPalindrome(-121));
    assert(!isPalindrome(10));
}