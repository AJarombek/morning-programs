// https://leetcode.com/problems/two-sum/
// Author: Andrew Jarombek
// Date: 1/14/2022

#include <vector>
#include <set>
#include <map>
#include "TwoSum.h"

using namespace std;

vector<int> TwoSum::twoSum(vector<int>& nums, int target) {
    set<int> candidates {};
    map<int,int> indices {};

    for (int i = 0; i < nums.size(); i++) {
        if (candidates.find(nums[i]) != candidates.end()) {
            return vector<int> {indices[nums[i]], i};
        } else {
            int value = target - nums[i];
            candidates.insert(value);
            indices[value] = i;
        }
    }

    return vector<int> {};
}