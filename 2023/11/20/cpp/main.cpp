// https://leetcode.com/problems/power-of-four/
// Author: Andrew Jarombek
// Date: 11/20/2023

#include <cassert>

using namespace std;

class Solution {
public:
    static bool isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }

            n /= 4;
        }

        return true;
    }
};

int main() {
    auto solution = Solution();
    assert(solution.isPowerOfFour(16));
    assert(!solution.isPowerOfFour(5));
    assert(solution.isPowerOfFour(1));
    assert(!solution.isPowerOfFour(0));
    assert(!solution.isPowerOfFour(-1));
}
