// Program: https://leetcode.com/problems/construct-the-rectangle/
// Author: Andrew Jarombek
// Date: 1/16/2024

#include <assert.h>
#include <stdlib.h>
#include <math.h>

int* constructRectangle(int area, int* returnSize) {
    int* result = malloc(sizeof(int) * 2);
    *returnSize = 2;

    int width = (int) sqrt(area);
    int length = width;

    while (width * length != area) {
        if (width * length > area) {
            width--;
        } else {
            length++;
        }
    }

    result[0] = length;
    result[1] = width;

    return result;
}

int main() {
    int returnSize;
    int* result = constructRectangle(4, &returnSize);

    assert(returnSize == 2);

    assert(result[0] == 2);
    assert(result[1] == 2);

    return 0;
}