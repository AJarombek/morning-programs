// Program: https://leetcode.com/problems/search-insert-position/
// Author: Andrew Jarombek
// Date: 1/12/2022

int searchInsert(int* nums, int numsSize, int target){
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] == target || nums[i] > target) {
            return i;
        }
    }

    return numsSize;
}