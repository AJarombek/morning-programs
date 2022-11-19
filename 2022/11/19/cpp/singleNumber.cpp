// https://leetcode.com/problems/single-number/
// Author: Andrew Jarombek
// Date: 11/19/2022

#include <cassert>
#include <vector>
#include <set>

using namespace std;

int singleNumber(vector<int>& nums) {
    set<int> s {};

    for (int num : nums) {
        if (s.find(num) != s.end()) {
            s.erase(num);
        } else {
            s.insert(num);
        }
    }

    for (int num : s) {
        return num;
    }

    return -1;
}

int main() {
    vector<int> v {2, 2, 1};
    assert(singleNumber(v) == 1);
}