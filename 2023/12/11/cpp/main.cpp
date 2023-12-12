// https://leetcode.com/problems/longest-palindrome/
// Author: Andrew Jarombek
// Date: 12/11/2023

#include <cassert>
#include <string>
#include <vector>

using namespace std;

class Solution {
public:
    static int longestPalindrome(string s) {
        vector<int> charCounts(128, 0);

        for (char c : s) {
            charCounts[c]++;
        }

        int palindromeLength = 0;
        bool oddChar = false;

        for (int count : charCounts) {
            if (count % 2 == 0) {
                palindromeLength += count;
            } else {
                palindromeLength += count - 1;
                oddChar = true;
            }
        }

        if (oddChar) {
            palindromeLength++;
        }

        return palindromeLength;
    }
};

int main() {
    assert(Solution::longestPalindrome("abccccdd") == 7);
    assert(Solution::longestPalindrome("a") == 1);
    return 0;
}
