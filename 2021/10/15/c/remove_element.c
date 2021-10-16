// Program: https://leetcode.com/problems/remove-element/
// Author: Andrew Jarombek
// Date: 10/15/2021

#include <assert.h>

int removeElement(int* nums, int numsSize, int val) {
    int end = numsSize;

    for (int i = 0; i < end; i++) {
        int* p = nums + i;

        if (*p == val) {
            while (nums[end - 1] == val) {
                end--;

                if (end == i) {
                    return end;
                }
            }

            *p = nums[end - 1];
            end--;
        }
    }

    return end;
}

int main() {
    int numbers[] = {3, 2, 2, 3};
    int result = removeElement(numbers, 4, 3);
    assert(result == 2);
    assert(numbers[0] == 2);
    assert(numbers[1] == 2);
}