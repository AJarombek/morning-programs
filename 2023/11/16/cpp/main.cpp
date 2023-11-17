// https://leetcode.com/problems/range-sum-query-immutable/
// Author: Andrew Jarombek
// Date: 11/16/2023

#include <cassert>
#include <vector>

using namespace std;

class NumArray {
private:
    vector<int> nums;
public:
    explicit NumArray(vector<int>& nums) {
        this->nums = nums;
    }

    int sumRange(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            result += nums[i];
        }

        return result;
    }
};

int main() {
    vector<int> nums {1, 2, 3, 4, 5};
    NumArray numArray(nums);

    assert(numArray.sumRange(0, 2) == 6);
    assert(numArray.sumRange(2, 4) == 12);
    assert(numArray.sumRange(0, 4) == 15);
}
