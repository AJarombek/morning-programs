// Program: https://leetcode.com/problems/search-insert-position/
// Author: Andrew Jarombek
// Date: 11/23/2021

#include <assert.h>

int searchInsert(int* nums, int numsSize, int target){
    for (int i = 0; i < numsSize; i++) {
        if (*nums >= target) {
            return i;
        }

        nums++;
    }

    return numsSize;
}

int searchInsertBinary(int* nums, int numsSize, int target){
    int high = numsSize - 1;
    int low = 0;

    while (high >= low) {
        int mid = (high + low) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return low;
}

int main() {
    int nums[] = {1, 3, 5, 7};
    int result = searchInsert(nums, 4, 0);
    assert(result == 0);

    int resultBinary = searchInsertBinary(nums, 4, 0);
    assert(resultBinary == 0);
}