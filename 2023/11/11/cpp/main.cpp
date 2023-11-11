// https://leetcode.com/problems/add-digits/
// Author: Andrew Jarombek
// Date: 11/11/2023

#include <cassert>
#include <string>
#include <vector>

using namespace std;

class Solution {
public:
    int addDigits(int num) {
        int result = 0;

        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        return result < 10 ? result : addDigits(result);
    }
};

int main() {
    Solution solution;
    assert(solution.addDigits(38) == 2);
    assert(solution.addDigits(0) == 0);
}
