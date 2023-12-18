// Program: https://leetcode.com/problems/third-maximum-number/
// Author: Andrew Jarombek
// Date: 12/18/2023

#include <assert.h>

int thirdMax(int* nums, int numsSize) {
    int max = nums[0];
    int secondMax = nums[0];
    int thirdMax = nums[0];
    int count = 1;

    for (int i = 1; i < numsSize; i++) {
        int num = nums[i];
        if (num == max || num == secondMax || num == thirdMax) {
            continue;
        }

        if (num > max) {
            thirdMax = secondMax;
            secondMax = max;
            max = num;
        } else if (num > secondMax || count == 1) {
            thirdMax = secondMax;
            secondMax = num;
        } else if (num > thirdMax || count == 2) {
            thirdMax = num;
        }

        count++;
    }

    if (count < 3) {
        return max;
    } else {
        return thirdMax;
    }
}

int main() {
    int nums1[] = {3, 2, 1};
    int result1 = thirdMax(nums1, 3);
    assert(result1 == 1);

    int nums2[] = {1, 2};
    int result2 = thirdMax(nums2, 2);
    assert(result2 == 2);

    int nums3[] = {1, 1, 2};
    int result3 = thirdMax(nums3, 3);
    assert(result3 == 2);
    return 0;
}