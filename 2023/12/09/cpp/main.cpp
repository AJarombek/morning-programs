// https://leetcode.com/problems/sum-of-left-leaves/
// Author: Andrew Jarombek
// Date: 12/9/2023

#include <cassert>
#include <string>
#include <vector>

using namespace std;

class Solution {
public:
    static std::string toHex(int num) {
        if (num == 0) {
            return "0";
        }

        std::string result = "";
        std::vector<char> hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7',
                                       '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        unsigned int n = static_cast<unsigned int>(num);

        while (n > 0) {
            int digit = n % 16;
            result = hexDigits[digit] + result;
            n /= 16;
        }

        return result;
    }
};

int main() {
    assert(Solution::toHex(26) == "1a");
    assert(Solution::toHex(-1) == "ffffffff");
    assert(Solution::toHex(0) == "0");
    return 0;
}
