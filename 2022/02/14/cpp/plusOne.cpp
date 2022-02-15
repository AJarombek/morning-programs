// https://leetcode.com/problems/plus-one/
// Author: Andrew Jarombek
// Date: 2/14/2022

#include <vector>
#include <algorithm>
#include <iterator>
#include <cassert>

using namespace std;

vector<int> plusOne(vector<int>& digits) {
    int remainder = 1;

    for (int i = digits.size() - 1; i >= 0; i--) {
        int value = digits[i] + remainder;
        remainder = value / 10;
        digits[i] = value % 10;
    }

    if (remainder > 0) {
        vector<int> result {1};
        copy(digits.begin(), digits.end(), back_inserter(result));
        return result;
    } else {
        return digits;
    }
}

int main() {
    vector<int> v1 {1, 2, 3};
    vector<int> v2 {9};

    auto result1 = plusOne(v1);
    auto result2 = plusOne(v2);

    assert(result1[0] == 1);
    assert(result1[1] == 2);
    assert(result1[2] == 4);

    assert(result2[0] == 1);
    assert(result2[1] == 0);
}
