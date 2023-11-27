// https://leetcode.com/problems/intersection-of-two-arrays-ii/
// Author: Andrew Jarombek
// Date: 11/27/2023

#include <cassert>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
public:
    static vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        auto map = unordered_map<int, int>();

        for (int num : nums1) {
            if (map.find(num) == map.end()) {
                map[num] = 1;
            } else {
                map[num]++;
            }
        }

        auto result = vector<int>();

        for (int num : nums2) {
            if (map.find(num) != map.end() && map[num] > 0) {
                result.push_back(num);
                map[num]--;
            }
        }

        return result;
    }
};

int main() {
    auto nums1 = vector<int>{1, 2, 2, 1};
    auto nums2 = vector<int>{2, 2};
    auto result = Solution::intersect(nums1, nums2);
    assert(result.size() == 2);
    assert(result[0] == 2);
    assert(result[1] == 2);

    return 0;
}
