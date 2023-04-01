// https://leetcode.com/problems/contains-duplicate/
// Author: Andrew Jarombek
// Date: 3/31/2023

#include <cassert>
#include <vector>
#include <set>

using namespace std;

bool containsDuplicate(vector<int>& nums) {
    set<int> uniqueNums {};

    for (int num : nums) {
        if (uniqueNums.find(num) != uniqueNums.end()) {
            return true;
        }

        uniqueNums.insert(num);
    }

    return false;
}

int main() {
    vector<int> v {1, 2, 3};
    assert(!containsDuplicate(v));

    vector<int> v2 {1, 2, 1};
    assert(containsDuplicate(v2));
}