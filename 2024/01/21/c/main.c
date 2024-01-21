// Program: https://leetcode.com/problems/target-sum/
// Author: Andrew Jarombek
// Date: 1/21/2024

#include <assert.h>
#include <stdlib.h>
#include <math.h>

int findTargetSumWays(int* nums, int numsSize, int target) {
    int sum = 0;
    for (int i = 0; i < numsSize; i++) {
        sum += nums[i];
    }

    if (target > sum || target < -sum) {
        return 0;
    }

    int dp[sum * 2 + 1][numsSize];
    for (int i = 0; i < sum * 2 + 1; i++) {
        for (int j = 0; j < numsSize; j++) {
            dp[i][j] = 0;
        }
    }

    dp[sum + nums[0]][0] = 1;
    dp[sum - nums[0]][0] += 1;

    for (int i = 1; i < numsSize; i++) {
        for (int j = 0; j < sum * 2 + 1; j++) {
            if (j - nums[i] >= 0) {
                dp[j][i] += dp[j - nums[i]][i - 1];
            }

            if (j + nums[i] < sum * 2 + 1) {
                dp[j][i] += dp[j + nums[i]][i - 1];
            }
        }
    }

    return dp[sum + target][numsSize - 1];
}

int main() {
    int nums1[] = {1, 1, 1, 1, 1};
    int result1 = findTargetSumWays(nums1, 5, 3);

    assert(result1 == 5);

    int nums2[] = {1};
    int result2 = findTargetSumWays(nums2, 1, 1);

    assert(result2 == 1);

    int nums3[] = {1, 0};
    int result3 = findTargetSumWays(nums3, 2, 1);

    assert(result3 == 2);

    return 0;
}