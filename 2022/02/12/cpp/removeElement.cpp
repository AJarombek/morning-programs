// https://leetcode.com/problems/remove-element/
// Author: Andrew Jarombek
// Date: 2/12/2022

#include <vector>

using namespace std;

int removeElement(vector<int>& nums, int val) {
    int end = nums.size() - 1;
    int index = 0;

    while (index <= end) {
        if (nums[index] == val) {
            nums[index] = nums[end];
            end--;
        } else {
            index++;
        }
    }

    return index;
}
