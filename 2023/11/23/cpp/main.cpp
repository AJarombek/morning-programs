// https://leetcode.com/problems/intersection-of-two-arrays/
// Author: Andrew Jarombek
// Date: 11/24/2023

#include <cassert>
#include <string>
#include <set>

using namespace std;

class Solution {
public:
    static vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        set<int> set1(nums1.begin(), nums1.end());
        vector<int> result;

        for (int num : nums2) {
            if (set1.find(num) != set1.end()) {
                result.push_back(num);
                set1.erase(num);
            }
        }

        return result;
    }
};

int main() {
    vector<int> nums1 = {1, 2, 2, 1};
    vector<int> nums2 = {2, 2};
    assert(Solution::intersection(nums1, nums2) == vector<int>{2});

    return 0;
}
