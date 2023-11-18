// https://leetcode.com/problems/power-of-three/
// Author: Andrew Jarombek
// Date: 11/17/2023

#include <cassert>

using namespace std;

class Solution {
public:
    bool isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }

            n /= 3;
        }

        return true;
    }
};

int main() {
    auto solution = Solution();
    assert(solution.isPowerOfThree(27));
    assert(!solution.isPowerOfThree(0));
    assert(!solution.isPowerOfThree(-1));
}
