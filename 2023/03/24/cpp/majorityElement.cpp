// https://leetcode.com/problems/majority-element/
// Author: Andrew Jarombek
// Date: 3/24/2023

#include <cassert>
#include <vector>
#include <unordered_map>

using namespace std;

int majorityElement(vector<int>& nums) {
    unordered_map<int, int> map {};

    for (int i = 0; i < nums.size(); i++) {
        int num = nums[i];
        int value = map[num] + 1;
        map[num] = value;

        if (value > nums.size() / 2) {
            return num;
        }
    }

    return -1;
}

int main() {
    vector<int> nums {3, 2, 3};
    assert(majorityElement(nums) == 3);
}