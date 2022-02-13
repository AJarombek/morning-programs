// https://leetcode.com/problems/maximum-subarray/
// Author: Andrew Jarombek
// Date: 2/13/2022

#include "maxSubArray.h"
#include <vector>

using namespace std;

int maxSubArray(vector<int>& nums) {
    int max = nums[0];
    int current = 0;

    for (const int num : nums) {
        current += num;

        if (current > max) {
            max = current;
        }

        if (current < 0) {
            current = 0;
        }
    }

    return max;
}