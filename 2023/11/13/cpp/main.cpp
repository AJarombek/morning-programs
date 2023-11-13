// https://leetcode.com/problems/move-zeroes/
// Author: Andrew Jarombek
// Date: 11/13/2023

#include <cassert>
#include <vector>

using namespace std;

class Solution {
public:
    static void moveZeroes(vector<int>& nums) {
        int zeroIndex = 0;
        int index = 0;

        while (index < nums.size()) {
            if (nums[index] != 0) {
                nums[zeroIndex] = nums[index];
                zeroIndex++;
            }

            index++;
        }

        while (zeroIndex < nums.size()) {
            nums[zeroIndex] = 0;
            zeroIndex++;
        }
    }
};

int main() {
    Solution solution;
    vector<int> nums = {0,1,0,3,12};
    solution.moveZeroes(nums);
    assert(nums == vector<int>({1,3,12,0,0}));
}
