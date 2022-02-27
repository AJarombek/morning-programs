// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Author: Andrew Jarombek
// Date: 2/27/2022

#include <vector>
#include <cassert>

using namespace std;

class Solution {
public:
    static int removeDuplicates(vector<int>& nums) {
        int slow = 0;
        int fast = 1;

        while (fast < nums.size()) {
            if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast];
            }

            fast++;
        }

        return slow + 1;
    }
};

int main() {
    vector<int> v {1, 1, 2, 3};
    auto result = Solution::removeDuplicates(v);
    assert(result == 3);
    assert(v[0] == 1);
    assert(v[1] == 2);
    assert(v[2] == 3);
}
