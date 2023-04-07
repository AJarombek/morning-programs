// Program: https://leetcode.com/problems/valid-perfect-square/
// Author: Andrew Jarombek
// Date: 4/6/2023

#include <assert.h>
#include <stdbool.h>

bool isPerfectSquare(int num) {
    int low = 1;
    int high = num;

    if (high > 46340) {
        high = 46340;
    }

    while (low <= high) {
        int mid = (low + high) / 2;
        int val = mid * mid;

        if (val == num) {
            return true;
        }

        if (val < num) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return false;
}

int main() {
    assert(isPerfectSquare(16));
    assert(!isPerfectSquare(14));
}