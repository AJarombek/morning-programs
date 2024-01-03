// Program: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Author: Andrew Jarombek
// Date: 1/3/2024

#include <assert.h>
#include <stdlib.h>

int* findDisappearedNumbers(int* nums, int numsSize, int* returnSize) {
    int* result = malloc(sizeof(int) * numsSize);
    *returnSize = 0;

    for (int i = 0; i < numsSize; i++) {
        int index = abs(nums[i]) - 1;

        if (nums[index] > 0) {
            nums[index] = -nums[index];
        }
    }

    for (int i = 0; i < numsSize; i++) {
        if (nums[i] > 0) {
            result[*returnSize] = i + 1;
            *returnSize += 1;
        }
    }

    return result;
}

int main() {
    int nums[8] = {4,3,2,7,8,2,3,1};
    int returnSize = 0;

    int* result = findDisappearedNumbers(nums, 8, &returnSize);
    assert(returnSize == 2);
    assert(result[0] == 5);
    assert(result[1] == 6);

    return 0;
}