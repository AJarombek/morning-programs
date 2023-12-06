// https://leetcode.com/problems/is-subsequence/
// Author: Andrew Jarombek
// Date: 12/6/2023

#include <cassert>
#include <string>

using namespace std;

class Solution {
public:
    static bool isSubsequence(string s, string t) {
        if (s.length() == 0) {
            return true;
        }

        int sIndex = 0;
        int tIndex = 0;

        while (tIndex < t.length()) {
            if (s[sIndex] == t[tIndex]) {
                sIndex++;
            }

            if (sIndex == s.length()) {
                return true;
            }

            tIndex++;
        }

        return false;
    }
};

int main() {
    assert(Solution::isSubsequence("abc", "ahbgdc"));
    assert(!Solution::isSubsequence("axc", "ahbgdc"));
    assert(Solution::isSubsequence("", "ahbgdc"));
    return 0;
}
