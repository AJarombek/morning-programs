// https://leetcode.com/problems/power-of-two/
// Author: Andrew Jarombek
// Date: 11/6/2023

#include <cassert>
#include <vector>
#include <string>

using namespace std;

class Solution {
public:
    static bool isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n >>= 1;
        }

        return true;
    }
};

int main() {
    auto solution = Solution();
    assert(solution.isPowerOfTwo(1));
    assert(solution.isPowerOfTwo(16));
    assert(!solution.isPowerOfTwo(3));
}
