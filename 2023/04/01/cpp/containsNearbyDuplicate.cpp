// https://leetcode.com/problems/contains-duplicate-ii/
// Author: Andrew Jarombek
// Date: 4/1/2023

#include <cassert>
#include <vector>
#include <unordered_map>

using namespace std;

bool containsNearbyDuplicate(vector<int>& nums, int k) {
    unordered_map<int, int> map {};

    for (int i = 1; i <= nums.size(); i++) {
        int j = map[nums[i - 1]];

        if (j > 0 && i - j <= k) {
            return true;
        }

        map[nums[i - 1]] = i;
    }

    return false;
}

int main() {
    vector<int> v {1, 0, 1, 1};
    assert(containsNearbyDuplicate(v, 1));

    vector<int> v2 {1, 2, 3, 1, 2, 3};
    assert(!containsNearbyDuplicate(v2, 2));
}