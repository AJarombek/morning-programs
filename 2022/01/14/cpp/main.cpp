// https://leetcode.com/problems/two-sum/
// Author: Andrew Jarombek
// Date: 1/14/2022

#include <cassert>
#include <vector>
#include "TwoSum.h"

using namespace std;

int main() {
    vector<int> v {2, 7, 11, 15};
    vector<int> result = TwoSum::twoSum(v, 9);
    assert(result[0] == 0);
    assert(result[1] == 1);
    assert(result.size() == 2);
}