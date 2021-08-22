// Program: https://leetcode.com/problems/two-sum/
// Author: Andrew Jarombek
// Date: 8/22/2021

#include <stdlib.h>
#include <assert.h>

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    returnSize = malloc(2 * sizeof(int));

    for (int i = 0; i < numsSize; i++) {
        for (int j = 1; j < numsSize; j++) {
            if (nums[i] + nums[j] == target) {
                returnSize[0] = i;
                returnSize[1] = j;
                return returnSize;
            }
        }
    }

    return returnSize;
}

int main() {
    int* nums = malloc(4 * sizeof(int));
    nums[0] = 2;
    nums[1] = 7;
    nums[2] = 11;
    nums[3] = 15;

    int* result = twoSum(nums, 4, 18, 0);
    assert(result[0] == 1);
    assert(result[1] == 2);

    free(nums);
    free(result);
}
