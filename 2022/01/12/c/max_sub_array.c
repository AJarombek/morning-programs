// Program: https://leetcode.com/problems/maximum-subarray/
// Author: Andrew Jarombek
// Date: 1/12/2022

#include <limits.h>

int maxSubArray(int* nums, int numsSize){
    int max = INT_MIN;
    int current = 0;

    for (int i = 0; i < numsSize; i++) {
        current += nums[i];

        if (current > max) {
            max = current;
        }

        if (current < 0) {
            current = 0;
        }
    }

    return max;
}