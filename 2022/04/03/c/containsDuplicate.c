// Program: https://leetcode.com/problems/contains-duplicate/
// Author: Andrew Jarombek
// Date: 4/3/2022

#include <stdbool.h>
#include <stdlib.h>
#include <assert.h>

bool containsDuplicate(int* nums, int numsSize){
    for (int i = 1; i < numsSize; i++) {
        int value = nums[i];

        for (int j = 0; j < i; j++) {
            if (value == nums[j]) {
                return true;
            }
        }
    }

    return false;
}

int compare(const int *a, const int *b) {
    return *a - *b;
}

bool containsDuplicateFaster(int* nums, int numsSize){
    qsort(nums, numsSize, sizeof(int), compare);

    for (int i = 1; i < numsSize; i++) {
        if (nums[i] == nums[i-1]) {
            return true;
        }
    }

    return false;
}

int main() {
    int* nums = malloc(sizeof(int) * 4);
    nums[0] = 1;
    nums[1] = 2;
    nums[2] = 3;
    nums[3] = 1;

    assert(containsDuplicate(nums, 4));
    assert(containsDuplicateFaster(nums, 4));
}
