// https://leetcode.com/problems/summary-ranges/
// Author: Andrew Jarombek
// Date: 11/5/2023

#include <cassert>
#include <vector>
#include <string>

using namespace std;

class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        vector<string> result;

        if (nums.empty()) {
            return result;
        }

        int start = nums[0];

        for (int i = 1; i < nums.size(); i++) {
            int val = nums[i];

            if (val != nums[i-1] + 1) {
                if (start == nums[i-1]) {
                    result.push_back(to_string(start));
                } else {
                    result.push_back(to_string(start) + "->" + to_string(nums[i-1]));
                }

                start = val;
            }
        }

        if (start == nums[nums.size() - 1]) {
            result.push_back(to_string(start));
        } else {
            result.push_back(to_string(start) + "->" + to_string(nums[nums.size() - 1]));
        }

        return result;
    }
};

int main() {
    auto solution = Solution();
    vector<int> nums {0,1,2,4,5,7};
    vector<string> result = solution.summaryRanges(nums);
    assert(result.size() == 3);
    assert(result[0] == "0->2");
    assert(result[1] == "4->5");
    assert(result[2] == "7");
}
