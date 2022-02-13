// https://leetcode.com/problems/search-insert-position/
// Author: Andrew Jarombek
// Date: 2/13/2022

#include <vector>
#include "searchInsertPosition.h"

using namespace std;

int searchInsert(vector<int>& nums, int target) {
    for (int i = 0; i < nums.size(); i++) {
        if (nums[i] >= target) {
            return i;
        }
    }

    return nums.size();
}