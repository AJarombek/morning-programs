// Program: https://leetcode.com/problems/plus-one/
// Author: Andrew Jarombek
// Date: 1/24/2022

#include <stdbool.h>
#include <stdlib.h>
#include <assert.h>

int* plusOne(int* digits, int digitsSize, int* returnSize){
    int* result = (int*) malloc(sizeof(int) * (digitsSize + 1));
    int remainder = 1;

    for (int i = digitsSize - 1; i >= 0; i--) {
        int value = digits[i] + remainder;
        remainder = value / 10;
        result[i + 1] = value % 10;
    }

    if (remainder > 0) {
        result[0] = remainder;
        *returnSize = digitsSize + 1;
        return result;
    } else {
        *returnSize = digitsSize;
        return result + 1;
    }
}

int* plusOneSmallNumbers(int* digits, int digitsSize, int* returnSize){
    long value = 0;
    bool increment = true;

    for (int i = 0; i < digitsSize; i++) {
        value *= 10;
        value += digits[i];

        if (digits[i] != 9) {
            increment = false;
        }
    }

    value++;

    if (increment) {
        digitsSize++;
    }

    *returnSize = digitsSize;

    int* result = (int*) malloc(sizeof(int) * digitsSize);

    int index = digitsSize - 1;
    while (value > 0) {
        result[index] = value % 10;
        value /= 10;
        index--;
    }

    return result;
}

int main() {
    int* digits = (int*) malloc(sizeof(int) * 3);
    digits[0] = 1;
    digits[1] = 2;
    digits[2] = 3;

    int* result = plusOne(digits, 3, digits);
    assert(result[0] == 1);
    assert(result[1] == 2);
    assert(result[2] == 4);
}