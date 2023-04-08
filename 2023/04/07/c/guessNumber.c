// Program: https://leetcode.com/problems/guess-number-higher-or-lower/
// Author: Andrew Jarombek
// Date: 4/7/2023

#include <assert.h>

int guess(int num);
int guessNumber(int n);

int guessNumber(int n) {
    long low = 1;
    long high = n;

    while (low <= high) {
        long mid = (low + high) / 2;
        int result = guess((int) mid);

        if (result == 0)
            return (int) mid;

        if (result == -1) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return (int) low;
}

int guess(int num) {
    if (num == 6) return 0;
    return (num > 6) ? -1 : 1;
}

int main() {
    assert(guessNumber(10) == 6);
}