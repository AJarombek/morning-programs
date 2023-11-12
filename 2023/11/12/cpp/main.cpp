// https://leetcode.com/problems/missing-number/
// Author: Andrew Jarombek
// Date: 11/12/2023

#include <cassert>
#include <vector>

using namespace std;

class Solution {
public:
    static int missingNumber(vector<int>& nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int expected = expectedSum(nums.size());
        return expected - sum;
    }

    static unsigned long long expectedSum(unsigned long n) {
        unsigned long long result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }
};

int main() {
    Solution solution;
    vector<int> nums = {3,0,1};
    assert(solution.missingNumber(nums) == 2);
}
