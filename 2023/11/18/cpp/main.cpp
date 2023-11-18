// https://leetcode.com/problems/counting-bits/
// Author: Andrew Jarombek
// Date: 11/18/2023

#include <cassert>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> countBits(int n) {
        auto result = vector<int>(n + 1);
        result[0] = 0;

        for (int i = 1; i <= n; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }

        return result;
    }
};

int main() {
    auto solution = Solution();
    vector<int> result = solution.countBits(2);
    vector<int> expected {};
    expected.push_back(0);
    expected.push_back(1);
    expected.push_back(1);

    assert(result == expected);
}
