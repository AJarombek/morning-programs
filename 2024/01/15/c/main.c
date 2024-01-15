// Program: https://leetcode.com/problems/max-consecutive-ones/
// Author: Andrew Jarombek
// Date: 1/15/2024

#include <assert.h>

int findMaxConsecutiveOnes(int* nums, int numsSize) {
    int result = 0;
    int current = 0;

    for (int i = 0; i < numsSize; i++) {
        if (nums[i] == 1) {
            current++;
        } else {
            if (current > result) {
                result = current;
            }
            current = 0;
        }
    }

    if (current > result) {
        result = current;
    }

    return result;
}

int main() {
    int nums[5] = {1, 0, 1, 1, 0};
    int result = findMaxConsecutiveOnes(nums, 5);
    assert(result == 2);

    return 0;
}