// https://leetcode.com/problems/valid-perfect-square/
// Author: Andrew Jarombek
// Date: 11/28/2023

#include <cassert>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
public:
    static bool isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }

        int left = 1;
        int right = num / 2;

        while (left <= right) {
            int mid = (left + right) / 2;
            long long square = (long long) mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
};

int main() {
    assert(Solution::isPerfectSquare(16));
    assert(!Solution::isPerfectSquare(14));
    return 0;
}
