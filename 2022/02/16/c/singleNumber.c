// Program: https://leetcode.com/problems/single-number/
// Author: Andrew Jarombek
// Date: 2/16/2022

#include <stdlib.h>
#include <assert.h>

int singleNumber(int* nums, int numsSize){
    int value = 0;

    for (int i = 0; i < numsSize; i++) {
        value ^= nums[i];
    }

    return value;
}

int main() {
    int* array = (int*) malloc(sizeof(int) * 5);
    array[0] = 2;
    array[1] = 2;
    array[2] = 1;

    assert(singleNumber(array, 3) == 1);

    free(array);
}
